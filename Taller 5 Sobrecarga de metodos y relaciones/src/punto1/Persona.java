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
public class Persona {
    
    private String nombre;
    private String apellido;
    private String sexo;
    private String numtelefono;
    private Fecha fechanaci;
    private Dirección direcdomicilio;
    private Dirección directrabajo;

    public Persona() {
        this.nombre="Emilse";
        this.apellido="Ahumada";
        this.sexo="F";
        this.numtelefono="3013966246";
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo="M";
        this.numtelefono="3148956321";
    }

    public Persona(String sexo) {
        this.nombre = "Andrea";
        this.apellido = "Real";
        this.sexo = sexo;
        this.numtelefono = "3175196358";
    }

    
    
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumtelefono() {
        return numtelefono;
    }

    public void setNumtelefono(String numtelefono) {
        this.numtelefono = numtelefono;
    }

    public Fecha getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(Fecha fechanaci) {
        this.fechanaci = fechanaci;
    }

    public Dirección getDirecdomicilio() {
        return direcdomicilio;
    }

    public void setDirecdomicilio(Dirección direcdomicilio) {
        this.direcdomicilio = direcdomicilio;
    }

    public Dirección getDirectrabajo() {
        return directrabajo;
    }

    public void setDirectrabajo(Dirección directrabajo) {
        this.directrabajo = directrabajo;
    }
    
    public void datosPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Número telefónico: " + numtelefono);
        System.out.println("Fecha de Nacimiento: "+fechanaci.getDia() + "/" +fechanaci.getMes() + "/"+ fechanaci.getAño());
        System.out.println("Dirección domicilio: " + "Barrio: "+direcdomicilio.getBarriodomi()+"\nNomenclatura: "+direcdomicilio.getNomenclaturadomi());
        System.out.println("Dirección de trabajo: " + "Barrio: "+directrabajo.getBarriotra()+"\nNomenclatura: "+directrabajo.getNomenclaturatra());
        System.out.println("*****************************************");
    }
}
