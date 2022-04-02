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
public class Grupo {
    
    private int numGrupo;
    private String docente;
    private Estudiante[] estu;

    public Grupo() {
        
    }
    
    public Grupo(int numGrupo, String docente, Estudiante[] estu) {
        this.numGrupo = numGrupo;
        this.docente = docente;
        this.estu = estu;
    }

    public int getNumGrupo() {
        return numGrupo;
    }

    public void setNumGrupo(int numGrupo) {
        this.numGrupo = numGrupo;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public Estudiante[] getEstu() {
        return estu;
    }

    public void setEstu(Estudiante[] estu) {
        this.estu = estu;
    }
    
    @Override
   public String toString(){
       return "\nGrupo: "+this.getNumGrupo()+"\nDocente: "+this.getDocente()+"\nEstudiantes:\n"+Arrays.toString(this.getEstu());
   }
}


