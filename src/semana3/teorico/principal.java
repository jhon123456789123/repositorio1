

package semana3.teorico;


public class principal {
    public static void main(String[] args) {
        
        suma s=new suma();
        multiplicacion m=new multiplicacion();
        division d=new division();
        
        s.calcularsuna(50, 30);
        m.multiplicar(15, 3);
        d.div(90, 2);
        
        System.out.println("la suma es :"+ s.calcularsuna(50, 30));
        System.out.println(" la multiplicacion es :"+ m.multiplicar(15, 3));
        System.out.println("la division: "+ d.div(90, 2));
        
        
    }
 
}
