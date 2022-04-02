/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7;

/**
 *
 * @author emilse
 */
public class Estudiante {
    
    private String priNom;
    private String priApe;
    private double p1;
    private double p2;
    private double p3;

    public Estudiante(String priNom, String priApe, double p1, double p2, double p3) {
        this.priNom = priNom;
        this.priApe = priApe;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    

    public String getPriNom() {
        return priNom;
    }

    public void setPriNom(String priNom) {
        this.priNom = priNom;
    }

    public String getPriApe() {
        return priApe;
    }

    public void setPriApe(String priApe) {
        this.priApe = priApe;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }
    
    public double prom(){
        double prom=(this.getP1()+this.getP2()+this.getP3())/3;
        return prom;
    }

    @Override
    public String toString(){
        return "Primer Nombre: "+this.getPriNom()+"\nPrimer Apellido: "+this.getPriApe()+"\nPromedio: "+this.prom()+"\n";
    }
    
}
