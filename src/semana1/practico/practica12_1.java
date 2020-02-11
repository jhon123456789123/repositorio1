
package semana1.practico;

import java.util.Scanner;


public class practica12_1 {
    public static void main(String[] args) {
        
         Scanner dato = new Scanner(System.in);
         
         int n = 0;
         
        System.out.println("Ingrese el número de autos: ");
        n = dato.nextInt();
        
        practica12 autos[] = new practica12[n];
        for(int i=0;i<n;i++){
            autos[i] = new practica12();
        }
        
        System.out.println("Ingrese los datos de los autos");
        for(int i=0;i<n;i++){
            System.out.println("AUTO "+i);
            System.out.println("Placa: ");
            String placa = dato.next();
            autos[i].setPlaca(placa);
        }
        
        for(int i=0;i<n;i++){
            switch(autos[i].getPlaca().charAt(autos[i].getPlaca().length()-1)){
                case '1':
                    autos[i].setColor("amarillo");
                    break;
                case '2':
                    autos[i].setColor("amarillo");
                    break;
                case '3':
                    autos[i].setColor("rosa");
                    break;
                case '4':
                    autos[i].setColor("rosa");
                    break;
                case '5':
                    autos[i].setColor("rojo");
                    break;
                case '6':
                    autos[i].setColor("rojo");
                    break;
                case '7':
                    autos[i].setColor("verde");
                    break;
                case '8':
                    autos[i].setColor("verde");
                    break;
                case '9':
                    autos[i].setColor("azul");
                    break;
                case '0':
                    autos[i].setColor("azul");
                    break;    
            }
        }
        
        System.out.println("Colores de los autos: ");
        for(int i=0;i<n;i++){
            System.out.println("AUTO "+i);
            System.out.println("Color: "+autos[i].getColor()+"\n");
        }
        
        
        
    }
 
}
