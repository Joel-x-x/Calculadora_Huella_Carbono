/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_3_semestre;


import static com.mycompany.proyecto_3_semestre.ConetionBDD.myconection;
import static com.mycompany.proyecto_3_semestre.ConetionBDD.myresultset;
import static com.mycompany.proyecto_3_semestre.ConetionBDD.mystatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CConexion {
    
    
    
    static Connection myconection;

    // Crear objeto statement
    static Statement mystatement;

    // Sentencia SQL
    static ResultSet myresultset;
    
    
    

   private static String DRIVER ="com.mysql.jdbc.Driver";
  private static String USUARIO ="root";
  private static String PASSWORD ="";
  private static String URL ="jdbc:mysql://localhost:3306/bdd_huella_carbono";
  
  static {
  try {
  Class.forName(DRIVER);
  
  } catch (ClassNotFoundException e ){
  JOptionPane.showMessageDialog(null, "ERROR EN EL DRIVER: "+e);
  
  }
  }
  
  public Connection getConnection(){
  Connection con = null ;
          try{
           con = DriverManager.getConnection(URL,USUARIO,PASSWORD);
              JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
          } catch (SQLException e){
          JOptionPane.showMessageDialog(null, "Error de conexion "+e);
          }
       return con;
  }
  
      public ArrayList<String> encuestaID() {

        ArrayList<String> arrayEncuestaId = new ArrayList<String>();

        try {
            // Conexión a la base de datos
            myconection = com.mycompany.proyecto_3_semestre.DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_huella_carbono", "root", "");
            // Crear objeto statement
            mystatement = myconection.createStatement();

            // Sentencia SQL
            myresultset = mystatement.executeQuery(
                    "SELECT * FROM encuesta_has_respuesta INNER JOIN respuesta on encuesta_has_respuesta.respuesta_id = respuesta.id");

            // Recorrer el resulset
            while (myresultset.next()) {
                // System.out.println(myresultset.getString("encuesta_id") + " " +
                // myresultset.getString("respuesta"));
                arrayEncuestaId.add(myresultset.getString("encuesta_id"));
            }

            for (int i = 0; i < arrayEncuestaId.size(); i++) {
                System.out.println(arrayEncuestaId.get(i));
            }

        } catch (Exception e) {
            System.out.println("Opps!, No se puedo conectar a la base de datos");
            e.printStackTrace();
        }

        return arrayEncuestaId;

    }

 
  
 
    
    
    
}
