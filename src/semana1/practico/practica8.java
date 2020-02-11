  /*Calcular y tabular los N primeros números primos*/


package semana1.practico;

import java.util.Scanner;


public class practica8 {
    public static void main(String[] args) {
        
      Scanner dato = new Scanner(System.in);
        
        int n = 0;
        System.out.println("Ingrese el valor de N: ");
        n = dato.nextInt();
        
        int a=0;
        int num=1;
        while(a<n){
            int cont=0;
            for(int i=1;i<=num;i++){
                if(num%i == 0){
                    cont++;
                }
            }
            if(cont==2){
                a++;
                System.out.print(num+"\t");
            }
            num++;
        }
  
        
        
        
    }
}
