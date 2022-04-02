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
public class Principal {
    
    public static void main(String[] args) {
        
        //Grupo 1
        Estudiante e1 = new Estudiante("Emilse", "Ahumada", 5.0, 5.0, 5.0);
        Estudiante e2 = new Estudiante("Juan", "Redondo", 4.0, 3.2, 4.3);
        Estudiante e3 = new Estudiante("Andrea", "Martinez", 3.0, 5.0, 4.5);
        
        Estudiante[] estuds = {e1,e2,e3};
        
        Grupo grupo1 = new Grupo(01, "Franklin", estuds);
        
        //Grupo 2
        Estudiante e4 = new Estudiante("Adrian", "Rodriguez", 5.0, 3.3, 4.0);
        Estudiante e5 = new Estudiante("Marcelo", "Peinado", 2.8, 3.2, 5.0);
        Estudiante e6 = new Estudiante("Luisa", "Zambrano", 4.1, 5.0, 4.2);
        
        Estudiante[] estuds2 = {e4,e5,e6};
        
        Grupo grupo2 = new Grupo(02, "Carlos", estuds2);
        
        //Asignamos los grupos a un arreglo de grupos
        
        Grupo[] grupos = {grupo1,grupo2};
        
        //Creacion Asignatura
        Asignatura A1 = new Asignatura("Ondas", "FS329", grupos);
        
        
        System.out.println(A1);
                
                
    }
    
}
