
package semana1.practico;

import java.util.Scanner;


public class practica13_1 {
    public static void main(String[] args) {
        
         Scanner dato = new Scanner(System.in);
          
        int n = 0;
        System.out.println("Ingrese el número de alumnos: ");
        n = dato.nextInt();
        
        practica13 alumnos[] = new practica13[n];
        for(int i=0;i<n;i++){
            alumnos[i] = new practica13();
        }
        
        System.out.println("Ingrese los datos de los alumnos: ");
        for(int i=0;i<n;i++){
            System.out.println("Alumno "+i);
            System.out.println("Nombre: ");
            String nombre = dato.next();
            System.out.println("Promedio: ");
            double promedio = dato.nextDouble();
            
            alumnos[i].setNombre(nombre);
            alumnos[i].setPromedio(promedio);
        }
        
        int numeroAprobados=0;
        
        for(int i=0;i<n;i++){
            if(alumnos[i].getPromedio()>=10.5){
                numeroAprobados++;
            }
        }
        
        double porcentajeAprobados = (numeroAprobados*100)/n;
        double porcentajeDesaprobados = 100-porcentajeAprobados;
        
        System.out.println("Aprobó el "+porcentajeAprobados+"% de alumnos.");
        System.out.println("Desaprobó el "+porcentajeDesaprobados+"% de alumnos.");
        
        
    }
  
}
