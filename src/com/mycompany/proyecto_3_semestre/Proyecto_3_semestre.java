/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_3_semestre;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Proyecto_3_semestre {
static ConetionBDD bdd = new ConetionBDD();

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CConexion cc= new CConexion();
        cc.getConnection();
        cc.encuestaID();
        Ingreso_datos_frame frm_principal = new Ingreso_datos_frame();
        frm_principal.setVisible(true);
        
  
        
        
        
    }
}
