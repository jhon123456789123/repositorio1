
/*Calcula la suma siguiente:
        100+98+96+94+...+0 en este orden*/


package semana1.practico;

import java.util.Scanner;


public class practica6 {
    public static void main(String[] args) {
        
                Scanner dato = new Scanner(System.in);
        
        
        int sumatoria = 0;
        for(int i=0;i<=100;i+=2){
            sumatoria += i;
        }
        
        System.out.println("La sumatoria es: "+sumatoria);

        
        
        
    }
   
}
