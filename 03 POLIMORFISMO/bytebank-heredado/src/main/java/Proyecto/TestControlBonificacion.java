
package Proyecto;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario bryan = new Contador();
        bryan.setSalario(2000);
        
        Gerente jimena = new Gerente();
        jimena.setSalario(10000);
        
        Contador alexis = new Contador();
        alexis.setSalario(1000);
        
        ControlBonificacion cb = new ControlBonificacion();
        cb.registrarSalario(bryan);
        cb.registrarSalario(jimena);
        cb.registrarSalario(alexis);
    }
}
