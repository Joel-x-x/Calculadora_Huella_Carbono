package com.mycompany.proyecto_3_semestre;


import java.sql.*;
import java.util.ArrayList;

public class ConetionBDD {
    // Conexión a la base de datos
    static Connection myconection;

    // Crear objeto statement
    static Statement mystatement;

    // Sentencia SQL
    static ResultSet myresultset;

    public ArrayList<String> encuestaID() {

        ArrayList<String> arrayEncuestaId = new ArrayList<String>();

        try {
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

    public ArrayList<String> respuesta() {

        ArrayList<String> arrayRespuesta = new ArrayList<String>();

        try {
            // Conexión a la base de datos
            myconection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba3", "root", "");

            // Crear objeto statement
            mystatement = myconection.createStatement();

            // Sentencia SQL
            myresultset = mystatement.executeQuery("SELECT * FROM encuesta_has_respuesta INNER JOIN respuesta on encuesta_has_respuesta.respuesta_id = respuesta.id");

            // Recorrer el resulset
            while (myresultset.next()) {
                // System.out.println(myresultset.getString("encuesta_id") + " " +
                // myresultset.getString("respuesta"));
                arrayRespuesta.add(myresultset.getString("respuesta"));
            }

            for (int i = 0; i < arrayRespuesta.size(); i++) {
                System.out.println(arrayRespuesta.get(i));
            }

        } catch (Exception e) {
            System.out.println("Opps!, No se puedo conectar a la base de datos");
            e.printStackTrace();
        }

        return arrayRespuesta;
    }
}
