/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

/**
 *
 * @author emilse
 */
public class Pizza {
    
    private String tipo;
    private String tamaño;
    private String estado;

    public Pizza(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.estado = "pedida";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    @Override
    public String toString(){
        return "Pizza "+this.getTipo()+" "+this.getTamaño()+", "+this.getEstado();
    }
    
    public String sirve(){
        String s="servida";
        if (this.getEstado()=="servida"){
            System.out.println("esa pizza ya se ha servido");
        }else{
         this.setEstado(s);
        }
        return s;
    }
    
    public int getTotalPedidas(){
        int cont = 0;
        
            if (this.getEstado()=="pedida"){
                cont++;
            }
        return cont;
    }
    
    public int getTotalServidas(){
        int cont = 0;
        
            if (this.getEstado()=="servida"){
                cont++;
            }
        return cont;
    }
    
    
    
}
