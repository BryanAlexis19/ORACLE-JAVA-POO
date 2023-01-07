
package Proyecto;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario bryan = new Contador();
        bryan.setNombre("Bryan Diaz Dreyfus");
        bryan.setDocumento("70482171");
        bryan.setSalario(2600);
        
        System.out.println("Salario > " + bryan.getSalario());
        System.out.println("Bonificacion > " + bryan.getBonificacion());
        
    }
}
