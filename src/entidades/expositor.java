
package entidades;


public class expositor {
 
    private String codigo;
    
    private String nombres;
    
    private String apellidos;
    
    private String correo_electronico;

    public expositor(String codigo) {
        this.codigo = codigo;
    }

    public expositor(String codigo, String nombres) {
        this.codigo = codigo;
        this.nombres = nombres;
    }

    public expositor(String codigo, String nombres, String apellidos) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public expositor(String codigo, String nombres, String apellidos, String correo_electronico) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo_electronico = correo_electronico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    
    
    
    
}
