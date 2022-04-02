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
public class PedidosPizza {
    
    public static void main(String[] args) {
        
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        
        int pedidas = p1.getTotalPedidas()+p2.getTotalPedidas()+p3.getTotalPedidas();
        int servidas = p1.getTotalServidas()+p2.getTotalServidas()+p3.getTotalServidas();
        System.out.println("Pedidas: "+pedidas);
        System.out.println("Servidas: "+servidas);
        
    }
}
