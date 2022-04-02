/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author emilse
 */
public class Equipo {
    private String nombre;
    private String ciudadOri;
    private String nomTecnico;
    private int numInscrip;
    private Jugador[] jugadores;

    public Equipo() {
        this.jugadores = new Jugador [6];
    }

    public Equipo(String nombre, String ciudadOri, String nomTecnico, int numInscrip, Jugador[] jugadores) {
        this.nombre = nombre;
        this.ciudadOri = ciudadOri;
        this.nomTecnico = nomTecnico;
        this.numInscrip = numInscrip;
        this.jugadores= jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOri() {
        return ciudadOri;
    }

    public void setCiudadOri(String ciudadOri) {
        this.ciudadOri = ciudadOri;
    }

    public String getNomTecnico() {
        return nomTecnico;
    }

    public void setNomTecnico(String nomTecnico) {
        this.nomTecnico = nomTecnico;
    }

    public int getNumInscrip() {
        return numInscrip;
    }

    public void setNumInscrip(int numInscrip) {
        this.numInscrip = numInscrip;
    }

    
    public Jugador[] getJugadores() {
        return jugadores;
    }

    
    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    
    
    
    
}
