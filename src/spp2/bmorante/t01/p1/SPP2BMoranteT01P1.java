/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmorante.t01.p1;
import java.util.Scanner;
/**
 *
 * @author Benito Mv
 */
public class SPP2BMoranteT01P1 {

       
    public static void main(String[] args) {
   double cal1, cal2, cal3, cal4, cal5 , pro, mat;
  
   //Introducir matricula
  Scanner sc = new Scanner(System.in);
 
 
    //Introduce matrícula
        System.out.println(" Introduce tu matrícula");
        mat= sc.nextDouble();
    //Introduce calificaciones de 5 materias
        System.out.println(" Introduce calificaciones de 5 materias");
    //Calificación materia 1
        System.out.println(" Introduce calificación materia 1");
        cal1= sc.nextDouble();
    //Calificación materia 2
        System.out.println(" Introduce calificación materia 2");
        cal2= sc.nextDouble();
    //Calificación materia 3
        System.out.println(" Introduce calificación materia 3");
        cal3= sc.nextDouble();
    //Calificación materia 4
        System.out.println("Introduce calificación materia 4");
        cal4 = sc.nextDouble();
    //Calificación materia 5
        System.out.println("Introduce calificación materia 5");
        cal5= sc.nextDouble();
    
    //Promedio del alumno
    pro= ((cal1 + cal2 + cal3 + cal4 + cal5)/5);
            
    
    //Aprobado o reprobado
            if (pro > 70.0)
            System.out.println("APROBADO");
            else if (pro < 70.0)
            System.out.println(" REPROBADO");
            
            
        System.out.println("tu promedio es "+ pro);
    
    
    
 
    
    }
    
}
