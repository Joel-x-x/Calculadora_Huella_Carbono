/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_3_semestre;

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
public class ConexionBDD {
    // Conexión a la base de datos
    static Connection myconection;

    // Crear objeto statement
    static Statement mystatement;

    // Sentencia SQL
    static ResultSet myresultset;

    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "";
    private static String URL = "jdbc:mysql://localhost:3306/bdd_huella_carbono?useSSL=false";

    // Conexión del driver
    static {
        try {
            Class.forName(DRIVER);

        } catch (ClassNotFoundException e) {
            // JOptionPane.showMessageDialog(null, "ERROR EN EL DRIVER: "+e);
            System.out.println("ERROR EN EL DRIVER: ");

        }
    }

    public Connection getConnection() {
        Connection conexion = null;
        try {
            // Conexión a la base de datos
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            // JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
            // System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion " + e);
        }
        return conexion;
    }

    public ArrayList<String> encuestaID() {

        ArrayList<String> arrayEncuestaId = new ArrayList<String>();
        try {
            // Crear objeto statement
            mystatement = this.getConnection().createStatement();
            // Sentencia SQL
            myresultset = mystatement.executeQuery(
                    "SELECT * FROM encuesta_has_respuesta INNER JOIN respuesta on encuesta_has_respuesta.respuesta_id = respuesta.id");

            // Recorrer el resulset
            while (myresultset.next()) {
                // System.out.println(myresultset.getString("encuesta_id") + " " +
                // myresultset.getString("respuesta"));
                arrayEncuestaId.add(myresultset.getString("encuesta_id"));
            }

//            for (int i = 0; i < arrayEncuestaId.size(); i++) {
//                System.out.println(arrayEncuestaId.get(i));
//            }

        } catch (Exception e) {
            System.out.println("Opps!, No se puedo conectar a la base de datos");
            e.printStackTrace();
        }

        return arrayEncuestaId;

    }

    public ArrayList<String> respuesta() {

        ArrayList<String> arrayRespuesta = new ArrayList<String>();

        try {
            // Crear objeto statement
            mystatement = this.getConnection().createStatement();

            // Sentencia SQL
            myresultset = mystatement.executeQuery(
                    "SELECT * FROM encuesta_has_respuesta INNER JOIN respuesta on encuesta_has_respuesta.respuesta_id = respuesta.id");

            // Recorrer el resulset
            while (myresultset.next()) {
                // System.out.println(myresultset.getString("encuesta_id") + " " +
                // myresultset.getString("respuesta"));
                arrayRespuesta.add(myresultset.getString("respuesta"));
            }

//           for (int i = 0; i < arrayRespuesta.size(); i++) {
//                System.out.println(arrayRespuesta.get(i));
//            }

        } catch (Exception e) {
            System.out.println("Opps!, No se puedo conectar a la base de datos");
            e.printStackTrace();
        }

        return arrayRespuesta;
    }
}
