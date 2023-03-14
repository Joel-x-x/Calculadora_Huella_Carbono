/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_3_semestre;
import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Font;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author Joel
 */
public class Calculadora extends javax.swing.JFrame {
static String fi,Fi,fr,Fr;
    static int filas,columnas;
    static ArrayList<Double> lista = new ArrayList<Double>();
    static ArrayList<Integer> lista_enteros = new ArrayList<Integer>();
    static ArrayList<Integer> lista_conteo = new ArrayList<>();
    static ArrayList<Double> lista_total = new ArrayList<Double>();
    static ArrayList<Float> lista_relativa= new ArrayList<>();
    static ArrayList<Integer> lista_aux= new ArrayList<>();
    static ArrayList<Double> lista_rangos= new ArrayList<>();
    static ArrayList<Integer> lista_frecuencias= new ArrayList<>();
    static Scanner leer = new Scanner(System.in);
    static String[][] tabla=null;
    static String[][] tabla_valores;
    static int contador=1;
    static int n_intervalos_valor;
    static int   amplitud_intervalos_valor;
    static String op = "";
    static String v="";
    static String pregunta_1;
static String pregunta_2;
static String pregunta_3;
static String pregunta_4;
static String pregunta_5;
static String pregunta_6;
static String pregunta_7;
static String pregunta_8;
static String pregunta_9;
static String pregunta_10;
static String pregunta_11;
static double suma_huella;
    static AnalisisDatos datos_objeto = new AnalisisDatos();
    // Instanciamos la clase analisis datos
    AnalisisDatos datos = new AnalisisDatos();
    // Instanciamos las matrices
    JTextField matrizA[][], matrizB[][];
    // Variables dimensiones de las matrices A y B
    int cA = 2, fA = 2, cB = 2, fB = 2;

    // Variables para movimiento del JFrame
    int mouseX, mouseY;

    // Declaración de la fuente para los campos de cada matriz
    Font font = new Font("Arial", Font.BOLD, 14);
    
    
    
    
    
    

    public Calculadora() {
        initComponents();
        // Ocultar los paneles de procesos al iniciar la calculadora
        
        // Posicionar y dimensionar el JFrame
        //this.setBounds(0, 0, 1410, 729);
        //this.setLocationRelativeTo(null);

        // Agregar padding a los cuadros que ingresan los datos a la matriz
        
        
        // Generar Matriz A y B por defecto 2 x 2
        //generarMatA(5, 6);
        
    }
    // Variables Matriz A Matriz B Matriz Reusltante C y Matrices Resultante númerador y denominador
    String a[][] = new String[fA][cA];
    String b[][] = new String[fB][cB];
    String c[][] = new String[fA][cA];
    int n[][] = new int[fA][cA];
    int d[][] = new int[fA][cA];

    // Iteradores para Matriz A Matriz B
    int contadori = 0, contadorj = 0;
    int bcontadori = 0, bcontadorj = 0;

    // Proceso para generar Matriz A
    public void generarMatA(int f, int c) {
        // El padding de la izquierda cambia conforme la dimension de las columnas
        int espaciadoX = 0, espaciadoY = 0;
        int setX = 0, setY = 0;

        switch (c) {
            case 2 -> {
                espaciadoX = 120;
                espaciadoY = 30;
            }
            case 3 -> {
                espaciadoX = 100;
                espaciadoY = 10;
            }
            case 4 -> {
                espaciadoX = 80;
                espaciadoY = 10;
            }
        }

        switch (f) {
            case 2:
                espaciadoY = 30;
                break;
            case 3:
                espaciadoY = 10;
                break;
            case 4:
                espaciadoY = 0;
                break;
        }

        setX = espaciadoX;
        setY = espaciadoY;

        matrizA = new JTextField[f][c];
        
        
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matrizA[i][j] = new JTextField("");
                matrizA[i][j].setBounds(setX, setY, 50, 30);
                matrizA[i][j].setHorizontalAlignment(JTextField.CENTER);
                matrizA[i][j].setBackground(new Color(100, 100, 100));
                matrizA[i][j].setFont(font);;
                matrizA[i][j].setForeground(new Color(244, 244, 244));
                matrizA[i][j].setBorder(null);
                setX += 53;
            }
            setX = espaciadoX;
            setY += 33;
        }
        matrizA[0][0].setText("Li");
        matrizA[0][1].setText("Ls");
        matrizA[0][2].setText("fi");
        matrizA[0][3].setText("Fi");
        matrizA[0][4].setText("fr");
        matrizA[0][5].setText("Fr");

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                jpanelma.add(matrizA[i][j]);
                matrizA[i][j].setVisible(false);
            }
        }

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matrizA[i][j].setVisible(true);
            }
        }

    }

    // Proceso para generar Matriz B
   
    
    // Borrar Matriz A
    public void borrarMatrizA() {
        for (int i = 0; i < fA; i++) {
            for (int j = 0; j < cA; j++) {
                jpanelma.add(matrizA[i][j]);
                matrizA[i][j].setVisible(false);
            }
        }
                contadori = 0;
        contadorj = 0;
    }

    // Borrar Matriz A


    // Extraer Datos matrizA

    // Extraer Datos matrizB
    public void extraerMatrizB() {
        // Resetear los arrays 
        b = new String[fB][cB];
        c = new String[fA][cA];
        n = new int[fA][cA];
        d = new int[fA][cA];
        for (int i = 0; i < fB; i++) {
            for (int j = 0; j < cB; j++) {
                b[i][j] = "0";
                c[i][j] = "0";
                n[i][j] = 0;
                d[i][j] = 0;
            }
        }

        for (int i = 0; i < fB; i++) {
            for (int j = 0; j < cB; j++) {
                b[i][j] = matrizB[i][j].getText();
            }
        }
    }

    // Validar campo para ingresar datos para matrizA


    // Validar campo b
  

    // Validar matriz a

    // Validar matriz b

    

    // Mostrar mensaje de error

    public String [][] Dimension (String [][] Dimensionar_matriz){
        Dimensionar_matriz=new String [lista_total.size()+7][5];
        for(int i=0;i<Dimensionar_matriz.length;i++){
            for(int j =0;j<Dimensionar_matriz[i].length;j++){
                Dimensionar_matriz[i][j]="";
            }
        }
        return Dimensionar_matriz;
    }
    public String [][] Dimension_continua (String [][] Dimensionar_matriz){
        Dimensionar_matriz=new String [n_intervalos_valor+4][7];
        for(int i=0;i<Dimensionar_matriz.length;i++){
            for(int j =0;j<Dimensionar_matriz[i].length;j++){
                Dimensionar_matriz[i][j]="";
            }
        }
        return Dimensionar_matriz;
    }
    //Método para el ingreso de los datos correspondientes

    public void ingreso(){
        System.out.println("Ingrese la dimension de la matriz (filasxcolumnas)");
        String n="";
        n="5x14";
        double a=0;
        
        System.out.println("Ingrese los valores ");

        String[] aux;
        aux=n.split("x");
        int sizeArray=0;
        sizeArray=Integer.parseInt((aux[0]))*Integer.parseInt((aux[1]));

        filas=Integer.parseInt(aux[0]);
        System.out.println(filas);


        columnas=Integer.parseInt(aux[1]);
        System.out.println(columnas);

        tabla_valores = new String[filas][columnas];
        //System.out.println(tabla_valores.length+tabla_valores[0].length);
        v="1";
        
        for(int i=0; i < sizeArray;i++){
            a = datos.analisis().get(i);
            lista.add(Double.parseDouble(String.valueOf(a)));
            lista_total.add(Double.parseDouble(String.valueOf(a)));
            if (op.equals("1")){
                lista_enteros.add(Integer.parseInt(v));
            }
        }
        int k=0;
        for(int i=0;i<tabla_valores.length;i++){
            for(int j=0;j<tabla_valores[i].length;j++){
                tabla_valores[i][j]= String.valueOf(lista_total.get(k));
                k++;
            }
        }



    }
    public void datos_bdd (){
    for(int i=0;i<75;i++){
        for(int j=0;j<11;j++){
            
        }
    }
    }
    //Método para el ingreso de los datos
    public void datos_tabla(String [][] ingreso_tabla){
        //Declaración de los nombres o títulos de las tablas
        int total_frecuencia=0;
        int total=0;
        ingreso_tabla[0][0]="Xi";
        ingreso_tabla[0][1]="fi";
        ingreso_tabla[0][2]="Fi";
        ingreso_tabla[0][3]="fr";
        ingreso_tabla[0][4]="Fr";
        ingreso_tabla[lista_enteros.size()+2][0]="TOTAL";
        //Ingreso de los datos correspondientes a la Marca de la clase.

        for (int i=0;i<lista_enteros.size();i++){
            ingreso_tabla[i+1][0]=String.valueOf(lista_enteros.get(i));
        }
        //Ingreso de los datos correspondientes a la Frecuancia absoluta
        for (int i=0;i<lista_conteo.size();i++){
            ingreso_tabla[i+1][1]=String.valueOf(lista_conteo.get(i));
        }
        //Cálculo del total de la frecuencia absoluta
        for (int i=0;i<lista_conteo.size();i++){
            total+=lista_conteo.get(i);
        }
        ingreso_tabla[lista_enteros.size()+2][1]=String.valueOf(total);
        //Ingreso de los datos de la Frecuancia absoluta acumulada
        ingreso_tabla[1][2]=String.valueOf(lista_conteo.get(0));
        total_frecuencia=lista_conteo.get(0);
        for (int i=2;i<lista_enteros.size()+1;i++){
            total_frecuencia+=lista_conteo.get(i-1);
            ingreso_tabla[i][2]=String.valueOf(total_frecuencia);
        }
        //Ingreso de los datos de la Frecuancia relativa
        float relatividad=0;
        for (int i=1;i<lista_enteros.size()+1;i++){
            relatividad=lista_conteo.get(i-1);
            relatividad=(relatividad)/total;
            lista_relativa.add(relatividad);
            ingreso_tabla[i][3]=String.format("%.2f",relatividad);
        }
        //Ingreso de los datos de la Frecuancia acumulada
        float total_frecuencia_relaitva=0;
        for (int i=0;i<lista_relativa.size();i++){
            total_frecuencia_relaitva+=lista_relativa.get(i);
        }

        ingreso_tabla[lista_enteros.size()+2][3]=String.format("%.2f",total_frecuencia_relaitva);
        ingreso_tabla[1][4]=String.format("%.2f",lista_relativa.get(0));
        float total_relitivo=0;
        total_relitivo=lista_relativa.get(0);
        for (int i=2;i<lista_enteros.size()+1;i++){
            total_relitivo+=lista_relativa.get(i-1);
            ingreso_tabla[i][4]=String.format("%.2f",total_relitivo);
        }
    }





    




    public static void datos_tabla_contunuas(String [][] ingreso_tabla){
        //Declaración de los nombres o títulos de las tablas

        int total_frecuencia=0;
        int total=0;
        ingreso_tabla[0][0]="Li";
        ingreso_tabla[0][1]="LS";
        ingreso_tabla[0][2]="fi";
        ingreso_tabla[0][3]="Fi";
        ingreso_tabla[0][4]="fr";
        ingreso_tabla[0][5]="Fr";

        ingreso_tabla[n_intervalos_valor+3][0]="TOTAL";

        double rangos_aux=0;
        rangos_aux=Double.parseDouble(String.valueOf(lista_total.get(0)+amplitud_intervalos_valor));
        ingreso_tabla[1][0]=String.valueOf(lista_total.get(0));
        lista_rangos.add(lista_total.get(0));
        ingreso_tabla[1][1]=String.valueOf(lista_total.get(0)+amplitud_intervalos_valor);

        for (int i=1;i<n_intervalos_valor;i++){
            ingreso_tabla[i+1][0]=" "+(rangos_aux);
            lista_rangos.add(rangos_aux);
            rangos_aux=rangos_aux+amplitud_intervalos_valor;
            lista_rangos.add(rangos_aux);
            ingreso_tabla[i+1][1]=(rangos_aux)+" ";
        }
        frecuencias();
        for (int i=0;i<n_intervalos_valor;i++){


            ingreso_tabla[i+1][2]=String.valueOf(lista_frecuencias.get(i));

        }
        //Cálculo del total de la frecuencia absoluta
        for (int i=0;i<n_intervalos_valor;i++){
            total=total+lista_frecuencias.get(i);
        }
        ingreso_tabla[n_intervalos_valor+3][2]=String.valueOf(total);
        ingreso_tabla[1][3]=String.valueOf(lista_frecuencias.get(0));
        total_frecuencia=lista_frecuencias.get(0);
        for (int i=1;i<n_intervalos_valor;i++){
            total_frecuencia+=lista_frecuencias.get(i);
            ingreso_tabla[i+1][3]=String.valueOf(total_frecuencia);
        }
        float relatividad=0;
        for (int i=0;i<n_intervalos_valor;i++){
            relatividad=lista_frecuencias.get(i);
            relatividad=(relatividad)/total;
            lista_relativa.add(relatividad);
            ingreso_tabla[i+1][4]=String.format("%.2f",relatividad);


        }
        //Ingreso de los datos de la Frecuancia acumulada
        float total_frecuencia_relaitva=0;
        for (int i=0;i<n_intervalos_valor;i++){
            total_frecuencia_relaitva+=lista_relativa.get(i);
        }
        ingreso_tabla[n_intervalos_valor+3][4]=String.format("%.2f",total_frecuencia_relaitva);
        ingreso_tabla[n_intervalos_valor+3][1]="     ";
        ingreso_tabla[n_intervalos_valor+3][3]="     ";
        ingreso_tabla[1][5]=String.format("%.2f",lista_relativa.get(0));
        float total_relitivo=0;
        total_relitivo=lista_relativa.get(0);
        for (int i=2;i<n_intervalos_valor+1;i++){
            total_relitivo+=lista_relativa.get(i-1);
            ingreso_tabla[i][5]=String.format("%.2f",total_relitivo);
        }
    }
    public static void frecuencias(){
        int frecuencias_contador=0;
        double y=0;
        double k_y;
        y=lista_rangos.get(0);
        k_y=y+amplitud_intervalos_valor;
        for(int i=0;i<n_intervalos_valor;i++){
            for (int j=0;j<lista_total.size();j++){
                if ((lista_total.get(j)>=y && (lista_total.get(j)<k_y))){
                    frecuencias_contador+=1;
                }else {

                    if (i==(n_intervalos_valor-1)){
                        if ((lista_total.get(j)>=y && (lista_total.get(j)<=k_y))){
                            frecuencias_contador+=1;
                        }
                    }
                }
            }
            y=k_y;
            k_y=k_y+amplitud_intervalos_valor;

            lista_frecuencias.add(frecuencias_contador);
            frecuencias_contador=0;
        }
    }

    //Método para la impresión de la matriz
    public void imprimir_contunuas(String [][] matriz_impresion){
        for(int i=0;i< tabla_valores.length;i++){
            for (int j=0;j<tabla_valores[i].length;j++){
                System.out.print("|"+tabla_valores[i][j]+"|");
            }
            System.out.println();
        }
        for(int i=0;i< matriz_impresion.length;i++){
            for (int j=0;j<matriz_impresion[i].length;j++){
                if (matriz_impresion[i][j].equals("")){

                }else {
                    if(matriz_impresion[i][j].equals("     ")){
                        System.out.print("" + matriz_impresion[i][j] + "                ");
                    }else {

                        System.out.print("|" + matriz_impresion[i][j] + "|                ");
                    }
                }
            }
            System.out.println();
        }
    }
    public void imprimir(String [][] matriz_impresion){
        for(int i=0;i< tabla_valores.length;i++){
            for (int j=0;j<tabla_valores[i].length;j++){
                System.out.print("|"+tabla_valores[i][j]+"|");
            }
            System.out.println();
        }
        for(int i=0;i< matriz_impresion.length;i++){
            for (int j=0;j<matriz_impresion[i].length;j++){
                if (matriz_impresion[i][j].equals("")){

                }else {
                    System.out.print("|" + matriz_impresion[i][j] + "|                ");
                }
            }
            System.out.println();
        }
    }

    //Cálculo del número de repeticiones que realiza cada valor.
    public void repeticiones(){
        int c=0;
        int k,top=0;
        boolean contado;
        for(int i =0;i<lista_enteros.size();i++){
            c=1;
            contado=false;
            k=0;
            while((!contado)&&(k<top)){
                if(lista_enteros.get(i)==lista_aux.get(k)){
                    contado=true;
                }
                k++;
            }
            if(!contado){
                lista_aux.add(lista_enteros.get(i));
                top++;
                for (int j=0;j<lista_enteros.size();j++){
                    if(j!=i){
                        if(lista_enteros.get(i)==lista_enteros.get(j)){
                            c++;
                        }
                    }
                }
                lista_conteo.add(c);
            }
        }
    }

    //Eliminacion de los valores repetidos
    public void valorunico() {
        Set<Integer> hashSet = new HashSet<Integer>(lista_enteros);
        lista_enteros.clear();
        lista_enteros.addAll(hashSet);
    }
    public void n_intervalos(){
        double intervalos= sqrt(lista_total.size());
        String[] h;

        System.out.println(intervalos);
        String j;
        j=String.valueOf(intervalos);
        j=j.replace(".","/");
        System.out.println(j);

        h=j.split("/");
        System.out.println(h[0]);

        n_intervalos_valor=Integer.parseInt(h[0]);
        System.out.println("el intervalo es de "+n_intervalos_valor);

    }
    public void amplitud_intervalos(){
        double amplitud= ((lista_total.get(lista_total.size()-1))-lista_total.get(0))/n_intervalos_valor;
        String y="";
        System.out.println(amplitud);
        y=String.format("%.1f",amplitud);
        System.out.println(y);
        y=y.replace(",",".");
        amplitud=Double.parseDouble(y);
        String[] h;
        y=y.replace(".","/");
        h=String.valueOf(y).split("/");
        if(Integer.parseInt(h[1])>=5){
            h[0]=String.valueOf(Integer.parseInt(h[0])+1);
        }
        if (Integer.parseInt(h[0])==0){
            h[0]=String.valueOf(Integer.parseInt(h[0])+1);
        }
        amplitud_intervalos_valor=Integer.parseInt(h[0]);

        System.out.println("la amplitud es de "+amplitud_intervalos_valor);
    }
    public static void datos(){
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        n4 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpanelma = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        panelsuperior = new javax.swing.JPanel();
        btt_calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Minimizar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        n4.setBackground(new java.awt.Color(102, 102, 102));
        n4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        n4.setForeground(new java.awt.Color(204, 204, 204));
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setFocusableWindowState(false);
        setUndecorated(true);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setPreferredSize(new java.awt.Dimension(500, 300));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jpanelma.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jpanelmaLayout = new javax.swing.GroupLayout(jpanelma);
        jpanelma.setLayout(jpanelmaLayout);
        jpanelmaLayout.setHorizontalGroup(
            jpanelmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jpanelmaLayout.setVerticalGroup(
            jpanelmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpanelma.getAccessibleContext().setAccessibleName("");

        panelsuperior.setBackground(new java.awt.Color(102, 102, 102));
        panelsuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelsuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelsuperiorMouseDragged(evt);
            }
        });
        panelsuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelsuperiorMousePressed(evt);
            }
        });

        btt_calcular.setText("CALCULAR");
        btt_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_calcularActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/arbol.gif"))); // NOI18N

        btn_Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Minimizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_Minimizar.setForeground(new java.awt.Color(22, 22, 22));
        btn_Minimizar.setText("—");
        btn_Minimizar.setBorder(null);
        btn_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Minimizar.setDefaultCapable(false);
        btn_Minimizar.setFocusPainted(false);
        btn_Minimizar.setFocusable(false);
        btn_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseExited(evt);
            }
        });
        btn_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinimizarActionPerformed(evt);
            }
        });

        btn_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cerrar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn_Cerrar.setForeground(new java.awt.Color(22, 22, 22));
        btn_Cerrar.setText("X");
        btn_Cerrar.setBorder(null);
        btn_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cerrar.setDefaultCapable(false);
        btn_Cerrar.setFocusPainted(false);
        btn_Cerrar.setFocusable(false);
        btn_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseExited(evt);
            }
        });
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        jButton1.setText("medidas de tendencia ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelsuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1181, 1181, 1181)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btt_calcular)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(481, 481, 481))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(panelsuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btt_calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jLabel20)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed

    }//GEN-LAST:event_n4ActionPerformed

    private void panelsuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsuperiorMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_panelsuperiorMouseDragged

    private void panelsuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelsuperiorMousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_panelsuperiorMousePressed

    private void btt_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_calcularActionPerformed
        // TODO add your handling code here:
        ingreso();
        
            //borrarMatrizB();
            
                    Collections.sort(lista);
                    Collections.sort(lista_total);
                    n_intervalos();
                    amplitud_intervalos();
                    tabla=Dimension_continua(tabla);
                    datos_tabla_contunuas(tabla);
                    //borrarMatrizA();
                    //matrizA[fA][cA].setVisible(false);
                    fA=tabla.length;
                    
            cA=6;
            //
            
            generarMatA(fA, cA);
            //matrizA[][]=new String()[(tabla[1].length)+4][6];
                    System.out.println();
                    imprimir_contunuas(tabla);
                    for(int i=0;i<tabla.length;i++){
                    for(int j=0;j<6;j++){
                        matrizA[i][j].setText("");
                        matrizA[i][j].setText(tabla[i][j]);
                    }}
    }//GEN-LAST:event_btt_calcularActionPerformed

    private void btn_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_MinimizarMouseClicked

    private void btn_MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseEntered
        // TODO add your handling code here:
        btn_Minimizar.setBackground(new java.awt.Color(98,98,98));
    }//GEN-LAST:event_btn_MinimizarMouseEntered

    private void btn_MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseExited
        // TODO add your handling code here:
        btn_Minimizar.setBackground(Color.white);
    }//GEN-LAST:event_btn_MinimizarMouseExited

    private void btn_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MinimizarActionPerformed

    private void btn_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btn_CerrarMouseClicked

    private void btn_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseEntered
        // TODO add your handling code here:
        btn_Cerrar.setBackground(red);
    }//GEN-LAST:event_btn_CerrarMouseEntered

    private void btn_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseExited
        // TODO add your handling code here:
        btn_Cerrar.setBackground(white);
    }//GEN-LAST:event_btn_CerrarMouseExited

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MedidasTendenciaCentral mt = new MedidasTendenciaCentral();
        mt.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Minimizar;
    private javax.swing.JButton btt_calcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jpanelma;
    private javax.swing.JTextField n4;
    private javax.swing.JPanel panelsuperior;
    // End of variables declaration//GEN-END:variables
}