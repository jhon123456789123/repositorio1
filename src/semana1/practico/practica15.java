 /*Escriba un programa que lea un valor entero positivo y determine:
        a) Si el entero es un número primo.
        b) Si el entero es un número de Fibonacci. (Los número de Fibonacci forman una secuencia en la cual cada número
        es igual a la suma de los dos anteriores, siendo los dos primeros números iguales a 1)*/
package semana1.practico;

import java.util.Scanner;


public class practica15 {
    public static void main(String[] args) {
        
         Scanner dato = new Scanner(System.in);
         
          int numero = 0;
        System.out.println("Ingrese un número entero positivo: ");
        numero = dato.nextInt();
        
        int confirmar1 = 0;
        for(int i=1;i<=numero;i++){
            if(numero%i == 0){
                confirmar1++;
            }
        }
        
        int a=1,b=1,c=0;
        
        int confirmar2 = 0;
        while(b<=numero){
            a=b;
            b=c;
            c=a+b;
            if(b==numero){
                confirmar2 = 1;
            }
        }
        
        if(confirmar1==2){
            System.out.println("El número ingresado es un número primo.");
        }else{
            System.out.println("El número ingresado no es un número primo.");
        }
        
        if(confirmar2 == 1){
            System.out.println("El número ingresado es parte de la serie de Fibonacci");
        }else{
            System.out.println("El número ingresado no es parte de la serie de Fibonacci");  
        }
        
        
        
        
    }
    
    
    
}
