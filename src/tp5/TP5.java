/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

import ejercicio10.CuentaBancaria;
import ejercicio10.Titular;

/**
 *
 * @author sofim
 */
public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 1
        /*Foto foto = new Foto("foto_sofia.jpg", "JPEG");
        Pasaporte pasaporte = new Pasaporte("AR123456", "20/10/2024", foto);
        Titular titular = new Titular("Sofia", "12.123.123");

        pasaporte.setTitular(titular);

        System.out.println(pasaporte);
        System.out.println(titular.getPasaporte());*/

        //EJERCICIO 2
        /*Bateria bateria = new Bateria("BL-45F1F", 3000);
        Celular celular = new Celular("357894561234567", "LG", "K10", bateria);
        Usuario usuario = new Usuario("Sofia", "12.123.123");

        celular.setUsuario(usuario);

        System.out.println(celular);
        System.out.println(usuario.getCelular());*/
        //EJERCICIO 3
        /*Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires, Argentina");

        Libro libro = new Libro("Cien Años de Soledad", "978-9871138663", autor, editorial);

        System.out.println(libro);*/
        //EJERCICIO 4
        /*Banco banco = new Banco("Banco Nación", "30-50000123-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/28", banco);
        Cliente cliente = new Cliente("Sofia", "12.123.123");

        tarjeta.setCliente(cliente); 
        
        System.out.println(tarjeta);
        System.out.println(cliente.getTarjeta());*/
        //EJERCICIO 5
        /*Computadora compu = new Computadora("HP", "SN12345", "ASUS PRIME B450M", "AMD B450");
        Propietario propietario = new Propietario("Sofia", "12.123.123");

        compu.setPropietario(propietario);

        System.out.println(compu);
        System.out.println(propietario.getComputadora());*/
        //EJERCICIO 6
        /*Cliente cliente = new Cliente("Juan Pérez", "3815123456");
        Mesa mesa = new Mesa(7, 4);
        Reserva reserva = new Reserva("2025-10-18", "21:00", cliente, mesa);

        System.out.println(reserva);*/
        //EJERCICIO 7
        /*Motor motor = new Motor("V8", "MTR-5567");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Corolla", motor);
        Conductor conductor = new Conductor("Laura Gómez", "LIC-998877");

        vehiculo.setConductor(conductor);

        System.out.println(vehiculo);
        System.out.println(conductor);*/
        
        
        //EJERCICIO 8
        /*Usuario usuario = new Usuario("Ana Pérez", "ana.perez@mail.com");
        Documento doc = new Documento("Contrato de Servicios", "Contenido del contrato...", usuario);

        System.out.println(doc);*/
        
        //EJERCICIO 9
        /*Paciente paciente = new Paciente("María López", "OSDE");
        Profesional profesional = new Profesional("Dr. Ramírez", "Pediatría");
        CitaMedica cita = new CitaMedica("2025-10-20", "09:30", paciente, profesional);

        System.out.println(cita);*/
        
        //EJERCICIO 10
        Titular titular = new Titular("Laura Gómez", "32165498");
        CuentaBancaria cuenta = new CuentaBancaria("123000456789", 50000.0, "abc123", "2025-10-17");
        cuenta.setTitular(titular);

        System.out.println(cuenta);
        System.out.println("Cuenta del titular: " + titular.getCuenta().getCbu());
    }

}
