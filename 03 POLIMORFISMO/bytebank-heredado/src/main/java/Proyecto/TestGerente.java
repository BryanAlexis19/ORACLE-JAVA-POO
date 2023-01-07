package Proyecto;

public class TestGerente {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNombre("Bryan Dreyfus");
        gerente.setSalario(8000);
        gerente.setTipo(1);
        gerente.setClave("AluraCursosOnLine");
        System.out.println(gerente.iniciarSesion("AluraCursosOnLine"));
        
        System.out.println("Bono de gerente >" + gerente.getBonificacion());
        
        
    }
}
