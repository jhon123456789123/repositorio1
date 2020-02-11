        /*Imprimir la tabla de multiplicar del número N*/


package semana1.practico;

import java.util.Scanner;

public class practica2 {

    public static void main(String[] args) {
        
                Scanner dato = new Scanner(System.in);
        
        int n = 0;
        System.out.println("Ingrese el valor de N: ");
        n = dato.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(i+" x "+n+" = "+(n*i));
        }
   
    }
    
    
    
}
