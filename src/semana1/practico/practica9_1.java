
package semana1.practico;

import java.util.Scanner;


public class practica9_1 {
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        int nAlumnos = 0;
        System.out.println("Ingrese el número de alumnos: ");
        nAlumnos = dato.nextInt();
        
        practica9 alumnos[] = new practica9[nAlumnos];
        for(int i=0;i<nAlumnos;i++){
            alumnos[i] = new practica9();
        }
        
        System.out.println("Ingrese los datos de los alumnos: ");
        for(int i=0;i<nAlumnos;i++){
            System.out.println("Alumno "+i);
            System.out.println("Nombre: ");
            String nombre = dato.next();
            System.out.println("Sexo: ");
            String sexo = dato.next();
            
            alumnos[i].setNombre(nombre);
            alumnos[i].setSexo(sexo);
        }
        
        int nHombres = 0;
        int nMujeres = 0;
        int nIndefinidos = 0;
        
        for(int i=0;i<nAlumnos;i++){
            if(alumnos[i].getSexo().equals("m")){
                nHombres++;
            }else{
                if(alumnos[i].getSexo().equals("f")){
                   nMujeres++; 
                }else{
                    nIndefinidos++;
                }
   
    }
        }
    System.out.println("Hay "+nHombres+" hombres y "+nMujeres+" mujeres.");
        System.out.println("Y "+nIndefinidos+" indefinidos.");
}
    }