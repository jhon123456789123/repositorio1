
package semana1.practico;

import java.util.Scanner;


public class practica14_1 {
    public static void main(String[] args) {
         Scanner dato = new Scanner(System.in);
         
         
        
        int n = 0;
        System.out.println("Ingrese el número de alumnos: ");
        n = dato.nextInt();
        
        practica14 alumnos[] = new practica14[n];
        for(int i=0;i<n;i++){
            alumnos[i] = new practica14();
        }
        
        System.out.println("Ingrese los datos de los alumnos: ");
        for(int i=0;i<n;i++){
            System.out.println("Alumno "+i);
            System.out.println("Nombre: ");
            String nombre = dato.next();
            double notas[] = new double[5];
            System.out.println("Ingrese sus 5 notas: ");
            for(int j=0;j<5;j++){
                notas[j]=dato.nextDouble();
            }
            
            alumnos[i].setNombre(nombre);
            alumnos[i].setNotas(notas);
            alumnos[i].promedio();
        }
        
        int aprobados = 0;
        for(int i=0;i<n;i++){
            if(alumnos[i].getPromedio()>=10.5){
                aprobados++;
            }
        }
        
        System.out.println("Solo "+aprobados+" alumnos tienen derecho al examen de nivelación.");
        
        
        
    }
 
}
