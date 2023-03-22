/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.proyecto_3_semestre;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        ConexionBDD conexion = new ConexionBDD();
        conexion.getConnection();
        conexion.encuestaID();
        conexion.respuesta();
        JFrameIngresoDatos frm_principal = new JFrameIngresoDatos();
        frm_principal.setVisible(true);

        AnalisisDatos datos = new AnalisisDatos();

        int size = datos.analisis().size();
        for (int i = 0; i < size; i++) {
            System.out.println(datos.analisis().get(i));            
        }
    }
}