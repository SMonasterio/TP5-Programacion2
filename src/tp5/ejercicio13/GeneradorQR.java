/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio13;

/**
 *
 * @author sofim
 */
public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario); // dependencia de creación
        System.out.println("QR generado exitosamente: " + codigo);
    }
}
