package Proyecto;

public class Contador extends Funcionario implements Autenticable {

    @Override
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE CONTADOR");
        return super.getSalario() * 0.8;

    }

    @Override
    public void setClave(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean iniciarSesion(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
