/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio11;

/**
 *
 * @author sofim
 */
public class Reproductor {

    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo()
                + " - " + cancion.getArtista().getNombre());
    }
}
