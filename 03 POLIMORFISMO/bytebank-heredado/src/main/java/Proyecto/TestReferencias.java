
package Proyecto;

public class TestReferencias {
    public static void main(String[]args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Bryan");
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Alexis");
        
        funcionario.setSalario(2000);
        gerente.setSalario(10000);
    }
}
