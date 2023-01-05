
package Inicial;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.setSaldo(300);
        miCuenta.Depositar(500);
        
        System.out.println(miCuenta.getSaldo());
        
        miCuenta.retirar(50);
        System.out.println(miCuenta.getSaldo());
        
        Cuenta cuentaJimena = new Cuenta();
        cuentaJimena.Depositar(20);
        miCuenta.transferir(30, cuentaJimena);
        System.out.println("Saldo de mi cuenta > " + miCuenta.getSaldo());
        System.out.println("Saldo cuenta Jimena > " + cuentaJimena.getSaldo());
    }
}
