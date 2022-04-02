/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7;

import java.util.Arrays;

/**
 *
 * @author emilse
 */
public class Asignatura {
    private String nombre;
    private String cod;
    private Grupo[] grupos;

    public Asignatura() {
        
    }

    public Asignatura(String nombre, String cod, Grupo[] grupos) {
        this.nombre = nombre;
        this.cod = cod;
        this.grupos = grupos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }
    
    @Override
    public String toString(){
        return "Asignatura: "+this.getNombre()+"\nCódigo: "+this.getCod()+""+Arrays.toString(this.getGrupos());
    }
}


