/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_3_semestre;

import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class datos_anlisis_preguntas {
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
    double suma_huella;

    public datos_anlisis_preguntas() {
        this.suma_huella = 0;
    }

    public ArrayList<Double> analisis() {
        ArrayList<String> arrayRespuesta = new ArrayList<String>();
        ArrayList<Double> arrayPersona = new ArrayList<Double>();

        // Clase conexión
        CConexion conexion = new CConexion();

        arrayRespuesta = conexion.respuesta();

        int contadorPreguntas = 1;
        Double numeroRedondeado = 0.0;
        for (int i = 0; i < 770; i++) {
            // System.out.println(arrayEncuestaId.get(i) + " - " + arrayRespuesta.get(i));

            switch (contadorPreguntas) {
                case 1:
                    pregunta_1 = arrayRespuesta.get(i);
                    switch (pregunta_1) {
                        case "10 a 20":
                            suma_huella = suma_huella + 0.804;
                            break;
                        case "20 a 30":
                            suma_huella = suma_huella + 1.206;
                            break;
                        case "Más de 30":
                            suma_huella = suma_huella + 1.608;
                            break;
                    }
                    break;
                case 2:
                    pregunta_2 = arrayRespuesta.get(i);
                    switch (pregunta_2) {
                        case "1":
                            suma_huella = suma_huella + 0.495;
                            break;
                        case "2":
                            suma_huella = suma_huella + (0.495 * 2);
                            break;
                        case "3":
                            suma_huella = suma_huella + (0.495 * 3);
                            break;
                        case "Más de 3":
                            suma_huella = suma_huella + (0.495 * 4);
                            break;
                        case "No uso gas":
                            break;
                    }
                    break;
                case 3:
                    pregunta_3 = arrayRespuesta.get(i);
                    switch (pregunta_3) {
                        case "LED":
                            suma_huella = suma_huella + (0.335);
                            break;
                        case "Ahorradores":
                            suma_huella = suma_huella + (0.5025);
                            break;
                        case "Incandescentes":
                            suma_huella = suma_huella + (0.8375);
                            break;
                    }
                    break;
                case 4:
                    pregunta_4 = arrayRespuesta.get(i);
                    switch (pregunta_4) {
                        case "Menos de 1 hora":
                            suma_huella = suma_huella + (0.955);
                            break;
                        case "1 hora":
                            suma_huella = suma_huella + (4.696);
                            break;
                        case "2 horas":
                            suma_huella = suma_huella + (4.696 * 2);
                            break;
                        case "3 horas":
                            suma_huella = suma_huella + (4.696 * 3);
                            break;
                        case "Más de 3 horas":
                            suma_huella = suma_huella + (4.696 * 4);
                            break;
                        case "No tengo vehículo":

                            break;
                    }
                    break;
                case 5:
                    pregunta_5 = arrayRespuesta.get(i);
                    switch (pregunta_5) {
                        case "Menos de 1 hora":
                            suma_huella = suma_huella + (0.073);
                            break;
                        case "1 hora":
                            suma_huella = suma_huella + (0.146);
                            break;
                        case "2 horas":
                            suma_huella = suma_huella + (0.146 * 2);
                            break;
                        case "3 horas":
                            suma_huella = suma_huella + (0.146 * 3);
                            break;
                        case "Más de 3 horas":
                            suma_huella = suma_huella + (0.146 * 4);
                            break;
                        case "No utilizo transporte público":
                            break;
                    }
                    break;
                case 6:
                    pregunta_6 = arrayRespuesta.get(i);
                    switch (pregunta_6) {
                        case "Nunca vuelo":
                            break;
                        case "Viajes de menos de 1.500 km":
                            suma_huella = suma_huella + (0.2);
                            break;
                        case "Viajes de más de 1.500 km":
                            suma_huella = suma_huella + (1);
                            break;
                    }
                    break;
                case 7:
                    pregunta_7 = arrayRespuesta.get(i);
                    switch (pregunta_7) {
                        case "Diario":
                            suma_huella = suma_huella + (0.876);
                            break;
                        case "4 - 6 días a la semana":
                            suma_huella = suma_huella + (0.509);
                            break;
                        case "1 - 3 días a la semana":
                            suma_huella = suma_huella + (0.136);
                            break;
                        case "No consumo":
                            break;
                    }
                    break;
                case 8:
                    pregunta_8 = arrayRespuesta.get(i);
                    switch (pregunta_8) {
                        case "Diario":
                            suma_huella = suma_huella + (0.11);
                            break;
                        case "4 - 6 días a la semana":
                            suma_huella = suma_huella + (0.074);
                            break;
                        case "1 - 3 días a la semana":
                            suma_huella = suma_huella + (0.037);
                            break;
                        case "No consumo":
                            break;
                    }
                    break;
                case 9:
                    pregunta_9 = arrayRespuesta.get(i);
                    switch (pregunta_9) {
                        case "Diario":
                            suma_huella = suma_huella + (1.35);
                            break;
                        case "4 - 6 días a la semana":
                            suma_huella = suma_huella + (1.296);
                            break;
                        case "1 - 3 días a la semana":
                            suma_huella = suma_huella + (0.865);
                            break;
                        case "No consumo":
                            break;
                    }
                    break;
                case 10:
                    pregunta_10 = arrayRespuesta.get(i);
                    switch (pregunta_10) {
                        case "Diario":
                            suma_huella = suma_huella + (1.3);
                            break;
                        case "4 - 6 días a la semana":
                            suma_huella = suma_huella + (0.69);
                            break;
                        case "1 - 3 días a la semana":
                            suma_huella = suma_huella + (0.5);
                            break;
                        case "No consumo":
                            break;
                    }
                    break;
                case 11:
                    pregunta_11 = arrayRespuesta.get(i);
                    switch (pregunta_11) {
                        case "Diario":
                            suma_huella = suma_huella + (0.012 * 3);
                            break;
                        case "De vez en cuando":
                            suma_huella = suma_huella + (0.012 * 2);
                            break;
                        case "Rara vez":
                            suma_huella = suma_huella + (0.012);
                            break;
                        case "No uso plásticos":
                            break;
                    }
                    break;
            }

            contadorPreguntas++;

            // Reiniciar contadorPreguntas pregunta
            if (contadorPreguntas == 12) {
                // Reiniciamos el contadorPreguntas de preguntas
                contadorPreguntas = 1;

                numeroRedondeado = Math.round(this.suma_huella * 100.0) / 100.0;
                // Agregar huella de carbono de cada usuario
                arrayPersona.add(numeroRedondeado);
                // Reiniciamos suma_huella para la siguiente persona
                this.suma_huella = 0;
            }
        }

        return arrayPersona;
    }

}
