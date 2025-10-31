/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio12;

/**
 *
 * @author sofim
 */
public class Calculadora {

    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de "
                + impuesto.getContribuyente().getNombre()
                + " por un monto de $" + impuesto.getMonto());

        double total = impuesto.getMonto() * 1.21; // +21% IVA
        System.out.println("Monto total con IVA: $" + total);
    }
}
