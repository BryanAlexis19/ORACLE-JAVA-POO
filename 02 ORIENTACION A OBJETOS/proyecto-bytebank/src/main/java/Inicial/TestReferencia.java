
package Inicial;

public class TestReferencia {
    
    public static void main (String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.setSaldo(300);
        
        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.setSaldo(100);
        
        System.out.println(segundaCuenta.getSaldo());
    }
}
