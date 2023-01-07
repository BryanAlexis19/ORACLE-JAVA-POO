package Proyecto;

public abstract class Funcionario {

    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    //CONSTRUCTOR
    public Funcionario() {

    }

    //GETTERS AND SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDocumento() {
        return this.documento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    public int getTipo() {
        return this.tipo;
    }

    //BONIFICIACION DEL 10%
    public abstract double getBonificacion();

    //GERENTE RECIBE UN SALARIO MAS DE BONIFICACION
}
