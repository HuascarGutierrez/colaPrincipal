/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.emi.colaprincipal;
import java.util.Scanner;
import java.applet.AudioClip;

/**
 *
 * @author huasc
 */
public class ColaPrincipal {

    public static void main(String[] args){
        /*String sonido = "C:/Users/huasc/Downloads/gatita.wav";
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/com.emi.colaprincipal/gatita.wav"));
        Sound.play();*/
        
        Scanner leer = new Scanner (System.in);
        //texto = leer.nextLine();

        Cola ejemplo = new Cola();
        //ejemplo.vector(3);
        //ejemplo.vRenombrar(2, "bueenas");
        ejemplo.poner("Juan");
        ejemplo.poner("Sussy");
        ejemplo.poner("Ricardo");
        ejemplo.poner("Cecy");
        ejemplo.mostrar();
        ejemplo.sacar();
        System.out.println("");
        ejemplo.mostrar();
        //ejemplo.buscar("mundo!");
        
        
        /*Cola ejemplo2 = new Cola();
        ejemplo2.mostrar();
        System.out.println(ejemplo2.cantidad);
        ejemplo2.sacar();
        System.out.println(ejemplo2.cantidad);
        ejemplo2.poner();
        ejemplo2.mostrar();
        ejemplo2.sacar();
        ejemplo2.sacar();
        ejemplo2.mostrar();*/
        
    }
}
