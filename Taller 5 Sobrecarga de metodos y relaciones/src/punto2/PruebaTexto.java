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
public class PruebaTexto {
    
    
    public static void main(String[] args) {
        
    
    Párrafo p1 = new Párrafo("LA casotona de mi mamá es blanc@ mamá mamá y tiene rejas nEgras");
    p1.nVocales();
    p1.nConsonantes();
    p1.nSimbolos();
    p1.buscar("mamá");
    p1.nPalabras();
    p1.palabraMayor();
    
    System.out.println("*****************************************");
    System.out.println("Texto 2");
     
    Párrafo p2 = new Párrafo();
    p2.nVocales();
    p2.nConsonantes();
    p2.nSimbolos();
    p2.buscar("auto");
    p2.nPalabras();
    p2.palabraMayor();
    
    
    
            
            
   }
}
