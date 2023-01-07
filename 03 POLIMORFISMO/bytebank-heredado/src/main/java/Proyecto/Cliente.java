package Proyecto;

public class Cliente implements Autenticable {

    private String nombre;
    private String documento;
    private String telefono;
    private AutenticacionUtil util;

    //COSTRUCTOR
    public Cliente(){
        this.util = new AutenticacionUtil();
    }
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

    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
       return this.util.iniciarSesion(clave);
    }

}
