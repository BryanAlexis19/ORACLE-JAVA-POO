package Inicial;

public class CrearCuenta {
    
    public static void main (String [] args) {
        
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.setSaldo(500);
        primeraCuenta.setAgencia(50);
        primeraCuenta.setNumero(70412);
        System.out.println(primeraCuenta.getSaldo());
        
        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.setSaldo(800);
        
        
    }
}
