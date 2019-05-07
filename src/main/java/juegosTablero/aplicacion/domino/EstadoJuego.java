/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosTablero.aplicacion.domino;

import jade.content.Predicate;
import jade.content.onto.annotations.Slot;
import juegosTablero.Vocabulario.Estado;
import juegosTablero.dominio.elementos.Juego;

/**
 *
 * @author pedroj
 */
public class EstadoJuego implements Predicate {
    private Juego juego;
    private Estado estadoJuego;
    private int puntuacion;

    public EstadoJuego() {
    }

    public EstadoJuego(Juego juego, Estado estadoJuego, int puntuacion) {
        this.juego = juego;
        this.estadoJuego = estadoJuego;
        this.puntuacion = puntuacion;
    }

    @Slot(mandatory=true)
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    @Slot(mandatory=true)
    public Estado getEstadoJuego() {
        return estadoJuego;
    }

    public void setEstadoJuego(Estado estadoJuego) {
        this.estadoJuego = estadoJuego;
    }

    @Slot(mandatory=false)
    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "EstadoJuego{" + "juego=" + juego + ", estadoJuego=" + estadoJuego 
                + ", puntuacion=" + puntuacion + '}';
    }
}
