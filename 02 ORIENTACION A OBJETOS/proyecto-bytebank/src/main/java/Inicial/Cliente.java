
package Inicial;

public class Cliente {
    private String nombre;
    private String documento;
    private String telefono;
    
    //GETTERS AND SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public String getDocumento() {
        return this.documento;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    
}
