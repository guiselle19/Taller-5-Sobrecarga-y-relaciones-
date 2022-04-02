/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Scanner;

/**
 *
 * @author emilse
 */
public class CampeonatoPrincipal {
    
    
        static Equipo Equipos[] = new Equipo[5];
        static Jugador jugadores[] = new Jugador[6];
        
    public static void main(String[] args) {
        
        
        Scanner lector = new Scanner (System.in);
        
        int n,j;
        String nomEquipo, ciudad, nomTecni, nomJuga,pos;
        int numcri, edad;
        
        
        
        
        do{
         System.out.println("\nCuantos equipos desea registrar en el campeonato?");
         n=lector.nextInt();
         
         if (n>5){
             System.out.println("No se pueden registrar esta cantidad de Equipos en el Campeonato");
         }else{
             for (int i=0; i<n; i++){
                 System.out.println("\nRegistro del Equipo #"+(i+1));
                 System.out.println("Nombre de Equipo:");
                 nomEquipo=lector.next();
                 System.out.println("Ciudad de Origen:");
                 ciudad=lector.next();
                 System.out.println("Nombre del Técnico");
                 nomTecni=lector.next();
                 System.out.println("Número de Inscripción");
                 numcri=lector.nextInt();
                 
                 do{
                  System.out.println("\nCuantos jugadores desea registrar para este equipo?");
                  j=lector.nextInt();
         
                  if (j>5){
                  System.out.println("No se pueden registrar esta cantidad de Jugadores por equipo");
                  }else{
                  for (int x=0; x<j; x++){
                      System.out.println("\nRegistro del Jugador #"+(x+1));
                      System.out.println("Nombre de Jugador:");
                      nomJuga=lector.next();
                      System.out.println("Edad del Jugador:");
                      edad=lector.nextInt();
                      System.out.println("Posición de Juego:");
                      pos=lector.next();
                      
                      jugadores[x]=new Jugador(nomJuga, edad, pos);
                    }
                 }
                }while(j>6);
                 
                Equipos[i]=new Equipo(nomEquipo, ciudad, nomTecni, numcri, jugadores); 
             }
         }
         }while(n>5);
        
        String consul;
        System.out.println("Ingrese el nombre del equipo del cual quiere imprimir la nomina de jugadores:");
        consul=lector.next();
        
     
        imprimirNominaJug(consul);
        
    }
    
    static void imprimirNominaJug(String team){
        
        for(int i=0; i<Equipos.length; i++){
            if(team == Equipos[i].getNombre()){
                System.out.println("Lista de Jugadores del equipo "+Equipos[i].getNombre());
                System.out.println(Equipos[i].getJugadores().toString());
            }
        }
        
    }
}
