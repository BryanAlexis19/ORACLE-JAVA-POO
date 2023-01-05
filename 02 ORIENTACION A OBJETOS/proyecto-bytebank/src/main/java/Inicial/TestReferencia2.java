
package Inicial;

public class TestReferencia2 {
    public static void main(String[] args) {
        //Crear a cliente diego
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("70482171");
        diego.setTelefono("991746203");
        
        //Crear cuenta de Diego
        Cuenta cuentaDiego = new Cuenta();
        cuentaDiego.setAgencia(1);
        cuentaDiego.setTitular(new Cliente());
        
        System.out.println("Cuenta de diego > " + cuentaDiego.getTitular().getNombre());
    }
    
}
