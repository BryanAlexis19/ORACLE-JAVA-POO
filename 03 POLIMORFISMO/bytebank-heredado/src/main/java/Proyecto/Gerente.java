package Proyecto;

public class Gerente extends Funcionario implements Autenticable {

    private String clave;

    public Gerente() {

    }

    @Override
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return super.getSalario() + (this.getSalario() * 0.1);
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.clave == clave;
    }

}
