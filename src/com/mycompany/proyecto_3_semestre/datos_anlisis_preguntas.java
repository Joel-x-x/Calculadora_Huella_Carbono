/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_3_semestre;

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
static double suma_huella;
public datos_anlisis_preguntas(){
this.suma_huella=0;
this.pregunta_1="";
this.pregunta_2="";
this.pregunta_3="";
this.pregunta_4="";
this.pregunta_5="";
this.pregunta_6="";
this.pregunta_7="";
this.pregunta_8="";
this.pregunta_9="";
this.pregunta_10="";
this.pregunta_11="";
}

    public static String getPregunta_1() {
        return pregunta_1;
    }

    public static void setPregunta_1(String pregunta_1) {
        datos_anlisis_preguntas.pregunta_1 = pregunta_1;
    }

    public static String getPregunta_2() {
        return pregunta_2;
    }

    public static void setPregunta_2(String pregunta_2) {
        datos_anlisis_preguntas.pregunta_2 = pregunta_2;
    }

    public static String getPregunta_3() {
        return pregunta_3;
    }

    public static void setPregunta_3(String pregunta_3) {
        datos_anlisis_preguntas.pregunta_3 = pregunta_3;
    }

    public static String getPregunta_4() {
        return pregunta_4;
    }

    public static void setPregunta_4(String pregunta_4) {
        datos_anlisis_preguntas.pregunta_4 = pregunta_4;
    }

    public static String getPregunta_5() {
        return pregunta_5;
    }

    public static void setPregunta_5(String pregunta_5) {
        datos_anlisis_preguntas.pregunta_5 = pregunta_5;
    }

    public static String getPregunta_6() {
        return pregunta_6;
    }

    public static void setPregunta_6(String pregunta_6) {
        datos_anlisis_preguntas.pregunta_6 = pregunta_6;
    }

    public static String getPregunta_7() {
        return pregunta_7;
    }

    public static void setPregunta_7(String pregunta_7) {
        datos_anlisis_preguntas.pregunta_7 = pregunta_7;
    }

    public static String getPregunta_8() {
        return pregunta_8;
    }

    public static void setPregunta_8(String pregunta_8) {
        datos_anlisis_preguntas.pregunta_8 = pregunta_8;
    }

    public static String getPregunta_9() {
        return pregunta_9;
    }

    public static void setPregunta_9(String pregunta_9) {
        datos_anlisis_preguntas.pregunta_9 = pregunta_9;
    }

    public static String getPregunta_10() {
        return pregunta_10;
    }

    public static void setPregunta_10(String pregunta_10) {
        datos_anlisis_preguntas.pregunta_10 = pregunta_10;
    }

    public static String getPregunta_11() {
        return pregunta_11;
    }

    public static void setPregunta_11(String pregunta_11) {
        datos_anlisis_preguntas.pregunta_11 = pregunta_11;
    }

    public static double getSuma_huella() {
        return suma_huella;
    }

    public static void setSuma_huella(double suma_huella) {
        datos_anlisis_preguntas.suma_huella = suma_huella;
    }

public static void analisis(){
    
switch (pregunta_1){
    case "10 a 20":
        suma_huella= suma_huella+0.804;
        break;
    case "20 a 30":
        suma_huella= suma_huella+1.206;
        break;
    case "Más de 30":
        suma_huella= suma_huella+1.608;
        break;
}
switch (pregunta_2){
    case "1":
        suma_huella= suma_huella+0.495;
        break;
    case "2":
         suma_huella= suma_huella+(0.495*2);
        break;
    case "3":
        suma_huella= suma_huella+(0.495*3);
        break;
    case "Más de 3":
        suma_huella= suma_huella+(0.495*4);
        break;
    case "No uso gas":
        break;
}
switch (pregunta_3){
    case "LED":
        suma_huella= suma_huella+(0.335);
        break;
    case "Ahorradores":
        suma_huella= suma_huella+(0.5025);
        break;
    case "Incandescentes":
        suma_huella= suma_huella+(0.8375);
        break;
}
switch (pregunta_4){
    case "Menos de 1 hora":
        suma_huella= suma_huella+(0.955);
        break;
    case "1 hora":
        suma_huella= suma_huella+(4.696);
        break;
    case "2 horas":
        suma_huella= suma_huella+(4.696*2);
        break;
    case "3 horas":
        suma_huella= suma_huella+(4.696*3);
        break;
    case "Más de 3 horas":
        suma_huella= suma_huella+(4.696*4);
        break;
    case "No tengo vehículo":
        
        break;
}
switch (pregunta_5){
    case "Menos de 1 hora":
        suma_huella= suma_huella+(0.073);
        break;
    case "1 hora":
        suma_huella= suma_huella+(0.146);
        break;
    case "2 horas":
        suma_huella= suma_huella+(0.146*2);
        break;
    case "3 horas":
        suma_huella= suma_huella+(0.146*3);
        break;
    case "Más de 3 horas":
        suma_huella= suma_huella+(0.146*4);
        break;
    case "No utilizo transporte público":
        break;
}
switch (pregunta_6){
    case "Nunca vuelo":
        break;
    case "Viajes de menos de 1.500 km":
        suma_huella= suma_huella+(0.2);
        break;
    case "Viajes de más de 1.500 km":
        suma_huella= suma_huella+(1);
        break;
}
switch (pregunta_7){
    case "Diario":
        suma_huella= suma_huella+(0.876);
        break;
    case "4 - 6 días a la semana":
        suma_huella= suma_huella+(0.509);
        break;
    case "1 - 3 días a la semana":
        suma_huella= suma_huella+(0.136);
        break;
    case "No consumo":
       break;
}
switch (pregunta_8){
    case "Diario":
        suma_huella= suma_huella+(0.11);
        break;
    case "4 - 6 días a la semana":
        suma_huella= suma_huella+(0.074);
        break;
    case "1 - 3 días a la semana":
        suma_huella= suma_huella+(0.037);
        break;
    case "No consumo":
       break;
}
switch (pregunta_9){
    case "Diario":
        suma_huella= suma_huella+(1.35);
        break;
    case "4 - 6 días a la semana":
        suma_huella= suma_huella+(1.296);
        break;
    case "1 - 3 días a la semana":
        suma_huella= suma_huella+(0.865);
        break;
    case "No consumo":
       break;
}
switch (pregunta_10){
    case "Diario":
        suma_huella= suma_huella+(1.3);
        break;
    case "4 - 6 días a la semana":
        suma_huella= suma_huella+(0.69);
        break;
    case "1 - 3 días a la semana":
        suma_huella= suma_huella+(0.5);
        break;
    case "No consumo":
       break;
}

switch (pregunta_11){
    case "Diario":
        suma_huella= suma_huella+(0.012*3);
        break;
    case "De vez en cuando":
        suma_huella= suma_huella+(0.012*2);
        break;
    case "Rara vez":
        suma_huella= suma_huella+(0.012);
        break;
    case "No uso plásticos":
        break;
}
}
public double sumatoria(){
    analisis();
    
return suma_huella;

}
}

