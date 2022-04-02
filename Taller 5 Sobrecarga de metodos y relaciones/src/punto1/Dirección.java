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
public class Dirección {
    
    private String barriodomi;
    private String nomenclaturadomi;
    private String barriotra;
    private String nomenclaturatra;

    public Dirección() { 
        this.barriodomi="Kennedy";
        this.nomenclaturadomi="Cra 5 A # 19 A 55";
        this.barriotra="San Carlos";
        this.nomenclaturatra="Cra 13 # 7D";
    }
    
    public Dirección(String barriodomi){
        
        this.barriodomi=barriodomi;
        this.nomenclaturadomi="Cra 7 B # 35 B 57";
        this.barriotra="Los Fundadores";
        this.nomenclaturatra="Diag 23 A Bis # 24-66";
    }
    
    public Dirección(String barriodomi, String barriotra){
        
        this.barriodomi=barriodomi;
        this.nomenclaturadomi="Mz 10 Casa 5";
        this.barriotra=barriotra;
        this.nomenclaturatra="Cra 12 # 5-23";
    }

    public String getBarriodomi() {
        return barriodomi;
    }

    public void setBarriodomi(String barriodomi) {
        this.barriodomi = barriodomi;
    }

    public String getNomenclaturadomi() {
        return nomenclaturadomi;
    }

    public void setNomenclaturadomi(String nomenclaturadomi) {
        this.nomenclaturadomi = nomenclaturadomi;
    }


    public String getBarriotra() {
        return barriotra;
    }

    public void setBarriotra(String barriotra) {
        this.barriotra = barriotra;
    }

    public String getNomenclaturatra() {
        return nomenclaturatra;
    }

    public void setNomenclaturatra(String nomenclaturatra) {
        this.nomenclaturatra = nomenclaturatra;
    }
}
