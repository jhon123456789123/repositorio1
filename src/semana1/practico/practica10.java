  /*En una granja se requiere saber alguna información para determinar
        el precio de venta por cada kilo de huevo. Es importante determinar
        el promedio de calidad de las N gallinas que hay en la granja.
        La calidad de cada gallina se obtiene según la fórmula:
        calidad = (peso*altura)/numero de huevos que pone*/


package semana1.practico;


public class practica10 {

    
    private double peso;
    private double altura;
    private int numeroHuevos;
    private double calidad;
    private double precioKiloHuevo;

    public practica10 (){
        peso = 0;
        altura = 0;
        numeroHuevos = 1;
        calidad = 0;
        precioKiloHuevo = 0;
    }

    public double getPrecioKiloHuevo() {
        return precioKiloHuevo;
    }

    public void setPrecioKiloHuevo(double precioKiloHuevo) {
        this.precioKiloHuevo = precioKiloHuevo;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }

    public double getCalidad() {
        return calidad;
    }

    public void setCalidad(double calidad) {
        this.calidad = calidad;
    }
    
    public void calcularCalidad(){
        calidad = (peso*altura)/numeroHuevos;
    }
    
    public void calcularPrecio(double variable){
        precioKiloHuevo = variable*calidad;
    }
    
    
}
