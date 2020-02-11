     
/*Calcular el promedio de calificaciones de un grupo
        de N alumnos*/

package semana1.practico;


import java.util.Scanner;


public class practica3 {

    public static void main(String[] args) {
        
                Scanner dato = new Scanner(System.in);
        
        int nAlumnos = 0;
        System.out.println("Ingrese el número de alumnos: ");
        nAlumnos = dato.nextInt();
        
        double promedios[] = new double[nAlumnos];
        
        System.out.println("Ingrese el promedio de los "+nAlumnos+" alumnos: ");
        for(int i=0;i<nAlumnos;i++){
            promedios[i] = dato.nextDouble();
        }
        
        //Calculo del promedio grupal
        double promedioGrupal = 0;
        for(int i=0;i<nAlumnos;i++){
            promedioGrupal += promedios[i];
        }
        
        promedioGrupal /= nAlumnos;
        
        System.out.println("El promedio grupal es: "+promedioGrupal);

        
        
    }
    
}
