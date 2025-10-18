/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

import tp5.ejercicio2.Bateria;
import tp5.ejercicio2.Celular;
import tp5.ejercicio2.Usuario;

/**
 *
 * @author sofim
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Foto foto = new Foto("foto_sofia.jpg", "JPEG");
        Pasaporte pasaporte = new Pasaporte("AR123456", "20/10/2024", foto);
        Titular titular = new Titular("Sofia", "12.123.123");

        pasaporte.setTitular(titular);

        System.out.println(pasaporte);
        System.out.println(titular.getPasaporte());*/
        
        Bateria bateria = new Bateria("BL-45F1F", 3000);
        Celular celular = new Celular("357894561234567", "LG", "K10", bateria);
        Usuario usuario = new Usuario("Sofia", "12.123.123");

        celular.setUsuario(usuario);

        System.out.println(celular);
        System.out.println(usuario.getCelular());
    }

}
