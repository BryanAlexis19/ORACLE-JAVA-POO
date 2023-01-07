package Proyecto;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void Depositar(double valor) {
        this.saldo += valor;

    }

}
