package Proyecto;

public class Administrador extends Funcionario implements Autenticable {
    private AutenticacionUtil util;
    
    public Administrador(){
        this.util = new AutenticacionUtil();
    }
    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    /* public boolean autentica(Administrador gerente) {
        boolean puedeLogearse = gerente.iniciarSesion(clave);
        if (puedeLogearse) {
            System.out.println("Logeo exitoso! ");
            return true;
        } else {
            System.out.println("Error de Logeo! ");
            return false;
        }
    }*/

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

}
