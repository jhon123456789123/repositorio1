
package semana1.practico;

import java.util.Scanner;


public class practica11_1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
         int nAlumnos = 0;
        System.out.println("Ingrese el número de alumnos: ");
        nAlumnos = dato.nextInt();
        
        practica11 alumnos[] = new practica11[nAlumnos];
        for(int i=0;i<nAlumnos;i++){
            alumnos[i] = new practica11();
        }
        ///////////////////////////////////////
        System.out.println("Ingrese los datos de los alumnos: ");
        for(int i=0;i<nAlumnos;i++){
            System.out.println("Alumno "+i);
            System.out.println("Nombre: ");
            String nombre = dato.next();
            System.out.println("Edad: ");
            int edad = dato.nextInt();
            System.out.println("Sexo: ");
            String sexo = dato.next();
            
            alumnos[i].setNombre(nombre);
            alumnos[i].setEdad(edad);
            alumnos[i].setSexo(sexo);
        }
        ///////////////////////////////////////
        int numeroHombres=0;
        int numeroMujeres=0;
        
        int promedioEdadesHombres=0;
        int promedioEdadesMujeres=0;
        int promedioEdadesGeneral=0;
        
        for(int i=0;i<nAlumnos;i++){
            promedioEdadesGeneral+=alumnos[i].getEdad();
            if(alumnos[i].getSexo().equals("m")){
                numeroHombres++;
                promedioEdadesHombres+=alumnos[i].getEdad();
            }
            if(alumnos[i].getSexo().equals("f")){
                numeroMujeres++;
                promedioEdadesMujeres+=alumnos[i].getEdad();
            }
        }
        
        if(numeroHombres != 0 && numeroMujeres != 0){
            promedioEdadesHombres /= numeroHombres;
            promedioEdadesMujeres /= numeroMujeres;
            promedioEdadesGeneral /= nAlumnos;
        }
        
        
        System.out.println("Promedio de edades de los hombres: "+promedioEdadesHombres);
        System.out.println("Promedio de edades de los mujeres: "+promedioEdadesMujeres);
        System.out.println("Promedio de edades en general: "+promedioEdadesGeneral);
        
        
    }
}
