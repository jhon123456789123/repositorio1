 /*Calcular la suma de 1+ 1/(2!) + 1/(3!) + 1/(4!) + .... + 1/(n!) para un n dado.
        Escriba el programa de tres formas
        diferentes: usando Repita mientras, Repita hasta y Repita para.*/



package semana1.practico;


import java.util.Scanner;

public class practica1 {
  
    public static void main(String[] args) {
        
        
                Scanner dato = new Scanner(System.in);
        
        int n = 0;
        System.out.println("Ingrese el valor de N: ");
        n = dato.nextInt();
        
        double suma = 0;
        double factorial = 1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                factorial *= j;
            }
            suma += 1/factorial;
            factorial = 1;
        }
        System.out.println("La suma de la serie es: "+suma);
        

        
    }
    
    
}
