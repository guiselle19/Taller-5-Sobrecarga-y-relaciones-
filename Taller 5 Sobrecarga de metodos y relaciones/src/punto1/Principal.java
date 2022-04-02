/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

/**
 *
 * @author emilse
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Persona a1 = new Persona ();
        
        Fecha fecha1=new Fecha();
        
        Dirección dire1=new Dirección();
        
        a1.setFechanaci(fecha1);
        a1.setDirecdomicilio(dire1);
        a1.setDirectrabajo(dire1);
        a1.datosPersona();
        
        //persona2
        Persona a2 = new Persona ("David", "Sanchez");
        
        Fecha fecha2=new Fecha(2003);
        Dirección dire2=new Dirección("Centro");
        a2.setFechanaci(fecha2);
        a2.setDirecdomicilio(dire2);
        a2.setDirectrabajo(dire2);
        a2.datosPersona();
        
        //persona3
        Persona a3 = new Persona ("F");
        Fecha fecha3=new Fecha(8,20);
        Dirección dire3=new Dirección("Don Carmelo", "La Garita");
        a3.setFechanaci(fecha3);
        a3.setDirecdomicilio(dire3);
        a3.setDirectrabajo(dire3);
        a3.datosPersona();
    }
}
