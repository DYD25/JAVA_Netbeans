
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author centr
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int veces=1, alumnos;
        double matematicas=0,español = 0,ingles=0,promedio=0;
        String materia, repetir = "S";
            
        Scanner s = new Scanner(System.in);
        System.out.println("A cuantos Alumnos le  va a calcular el promedio de las materia");
        alumnos = s.nextInt();
        
        System.out.println(" ");
        for(veces=1; veces<= alumnos; veces++){
             System.out.println("Nota de la materia de MATEMATICAS del alumno " + veces);
            matematicas = matematicas + s.nextDouble();
        }
        
        System.out.println(" ");        
        veces=1;
        while(veces<=alumnos){
            System.out.println("Nota de la materia de ESPAÑOL del alumno "+ veces);
            español = español + s.nextDouble();
            veces++;
        }
        
        System.out.println(" ");        
        veces=1;
        do{
            System.out.println("Nota de la materia de INGLES del alumno "+ veces);
            ingles = ingles + s.nextDouble();
            veces++;
        }while(veces<=alumnos);
         
       
        do{
        
        System.out.println(" ");        
        System.out.println(" ");
        System.out.println("Mateias MATEMATICAS, INGLES Y ESPANOL"); //ESPANOL, debio a que ESPAÑOL por tener Ñ me presenta dificultad       
        System.out.println("¿De que materia quiere saber el promedio?");
        materia = s.next();
        
        switch (materia)
        {
            case "MATEMATICAS": 
               promedio= matematicas/alumnos;
               System.out.println("El promedio de la "+materia+ " es " + promedio );
               System.out.println("©D&D");
            break;
            case "ESPANOL": 
               promedio= español/alumnos;
               System.out.println("El promedio de la "+materia+ " es " + promedio );
               System.out.println("©D&D");
            break;
            case "INGLES":
               promedio= ingles/alumnos;
               System.out.println("El promedio de la "+materia+ " es " + promedio );
               System.out.println("©D&D");
            break;
        }
        System.out.println("¿Desea saber el promedio de otra materia (N/S)? " );
        repetir = s.next();
    }while(!"N".equals(repetir));
}
}


    

