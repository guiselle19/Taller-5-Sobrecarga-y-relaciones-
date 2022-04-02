/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

/**
 *
 * @author emilse
 */
public class Párrafo {
     
    private String texto;

    public Párrafo(){
        
        this.texto="El auto de Pepe es de color blanco y tiene 4 puertas ese auto";
                
    }

    public Párrafo(String texto) {
        this.texto = texto;
    }
    
    
  
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
   
    public void nVocales(){
        int vocales=0;
        for (int i=0; i<getTexto().length(); i++){
            char letraActual = getTexto().charAt(i);
            if ("aeiouáéíóú".contains(String.valueOf(letraActual).toLowerCase())){
                vocales++;
            }
        }
        System.out.println("Hay "+vocales+" vocales en el texto");
    }
    
    public void nConsonantes(){
        int conso=0;
        for (int i=0; i<getTexto().length(); i++){
            char letraActual = getTexto().charAt(i);
            if ("bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letraActual).toLowerCase())){
                conso++;
            }
        }
        System.out.println("Hay "+conso+" consonantes en el texto");
    }
    
    public void nSimbolos(){
        int simbo=0;
        for (int i=0; i<getTexto().length(); i++){
            char letraActual = getTexto().charAt(i);
            if ("@#%&/=?¡*¨><°¬|-+~¿".contains(String.valueOf(letraActual).toLowerCase())){
                simbo++;
            }
        }
        System.out.println("Hay "+simbo+" símbolos en el texto");
    }
    
    public void buscar(String palabra){
        
        String nombre="";
        int pal = 0;
        
       for(int i=0; i<getTexto().length(); i++){
            
            char caracter=getTexto().charAt(i);
            if(caracter==' '){
                nombre="";
                continue;
        }
            
            nombre = nombre + caracter;
            
            if(palabra.length()==nombre.length() & nombre.equalsIgnoreCase(palabra)){
           
            pal++;
            
            }
        }
        
        System.out.println("La palabra "+palabra+" se repite "+pal+" veces en el texto");
}
    
    
    /*public void vocalModa(){
        
       int vocal = 0;
       
       for (int i=0; i<getTexto().length(); i++){
           
           if 
       }
        
    }*/
    
    public void nPalabras(){
        
        int pal = 1;
        
        String txt = getTexto().trim();
        
        for (int i=0; i<txt.length(); i++){
            if ((txt.charAt(i)==' ')&&(txt.charAt(i+1)!=' ')){
                pal++;
            }        
        }
        System.out.println("Hay "+pal+" palabras en el texto");
    }
    
    public void palabraMayor(){
        int longi=0, pos=0, mayor=0, posMayor=0;
        
        for (int i=0; i<getTexto().length(); i++){
            while (! Character.isLetter(getTexto().charAt(i)) && (i+1)<getTexto().length()){
                i++;
            }
           pos=1;
           longi=0;
           while (! Character.isLetter(getTexto().charAt(i)) && (i+1)<getTexto().length()){
                longi++;
                i++;
            }
           if (longi>mayor){
               mayor=longi;
               posMayor=pos;
           }
        }
        
        String palabra="";
        for (int i=0; i<mayor; i++){
            palabra=palabra.concat(String.valueOf(getTexto().charAt(posMayor+i)));
        }
        System.out.println("La palabra más larga es: "+palabra+" y tiene "+mayor+" caracteres");
    }
    
    
}
