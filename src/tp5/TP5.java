/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

import java.util.Date;
import tp5.ejercicio1.Foto;
import tp5.ejercicio1.Pasaporte;
import tp5.ejercicio1.Titular;

/**
 *
 * @author sofim
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Foto foto = new Foto("foto_sofia.jpg", "JPEG");
        Pasaporte pasaporte = new Pasaporte("AR123456", "20/10/2024", foto);
        Titular titular = new Titular("Sofia", "12.123.123");

        pasaporte.setTitular(titular);

        System.out.println(pasaporte);
        System.out.println(titular.getPasaporte());
    }

}
