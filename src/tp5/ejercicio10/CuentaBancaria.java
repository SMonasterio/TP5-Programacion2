/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author sofim
 */
public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;   // Composición (existe dentro de CuentaBancaria)
    private Titular titular;        // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, ultimaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setCuenta(this);
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{"
                + "cbu='" + cbu + '\''
                + ", saldo=" + saldo
                + ", clave=" + clave
                + ", titular=" + titular
                + '}';
    }
}
