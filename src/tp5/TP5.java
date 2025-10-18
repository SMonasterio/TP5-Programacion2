/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

import tp5.ejercicio5.Computadora;
import tp5.ejercicio5.Propietario;

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

 /*Bateria bateria = new Bateria("BL-45F1F", 3000);
        Celular celular = new Celular("357894561234567", "LG", "K10", bateria);
        Usuario usuario = new Usuario("Sofia", "12.123.123");

        celular.setUsuario(usuario);

        System.out.println(celular);
        System.out.println(usuario.getCelular());*/
 /*Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires, Argentina");

        Libro libro = new Libro("Cien Años de Soledad", "978-9871138663", autor, editorial);

        System.out.println(libro);*/
 /*Banco banco = new Banco("Banco Nación", "30-50000123-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/28", banco);
        Cliente cliente = new Cliente("Sofia", "12.123.123");

        tarjeta.setCliente(cliente); 
        
        System.out.println(tarjeta);
        System.out.println(cliente.getTarjeta());*/
        Computadora compu = new Computadora("HP", "SN12345", "ASUS PRIME B450M", "AMD B450");
        Propietario propietario = new Propietario("Sofia", "12.123.123");

        compu.setPropietario(propietario);

        System.out.println(compu);
        System.out.println(propietario.getComputadora());
    }

}
