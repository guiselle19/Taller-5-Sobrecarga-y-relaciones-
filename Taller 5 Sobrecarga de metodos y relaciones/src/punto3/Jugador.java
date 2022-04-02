/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author ardil
 */
public class Jugador {
    private String nombre;
    private int edad;
    private String posJuego;

    public Jugador() {
        
    }

    public Jugador(String nombre, int edad, String posJuego) {
        this.nombre = nombre;
        this.edad = edad;
        this.posJuego = posJuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosJuego() {
        return posJuego;
    }

    public void setPosJuego(String posJuego) {
        this.posJuego = posJuego;
    }
    
    
    
}
