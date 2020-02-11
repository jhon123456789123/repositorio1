
package semana3.teorico;



public class principio {
    public static void main(String[] args) {
        
        rectangulo r=new rectangulo();
        triangulo t=new triangulo();
        cuadrado c=new cuadrado();
        
        System.out.println("el area del rectangulo es : "+r.arearectangulo(22, 11));
          System.out.println("el area del triangulo es : "+t.areatriangulo(60, 30));
          System.out.println("el area del cuadrado es : "+c.areacuadrado(13));
        
        
    }
    
}
