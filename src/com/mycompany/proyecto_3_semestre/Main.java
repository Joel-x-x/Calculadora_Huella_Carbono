/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_3_semestre;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        CConexion cc= new CConexion();
        cc.getConnection();
        cc.encuestaID();
        cc.respuesta();
        Ingreso_datos_frame frm_principal = new Ingreso_datos_frame();
        frm_principal.setVisible(true);

        datos_anlisis_preguntas datos = new datos_anlisis_preguntas();

        datos.analisis();
    }
}
