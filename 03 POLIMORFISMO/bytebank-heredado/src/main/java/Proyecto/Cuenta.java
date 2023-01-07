package Proyecto;

public abstract class Cuenta {

    protected double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total = 0;

    //CONSTRUCTOR
    public Cuenta(int agencia, int numero) {

        if (agencia < 1) {
            System.out.println("No se permiten 0 en agencia!");
        } else {
            this.agencia = agencia;
        }
        this.saldo = 0;
        this.numero = numero;
        this.titular = null;
        total++;
        System.out.println("Se van creando: " + total + " cuentas");
    }

    //GETTERS AND SETTERS
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("No estan permitidos valores negativos");
        }
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("No estan permitidos valores negativos");
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public abstract void Depositar(double valor);
    
    //public void Depositar(double valor) {
    //    saldo += valor;
    //}

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            //this.saldo -= valor;
            this.retirar(valor);
            cuenta.Depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}
