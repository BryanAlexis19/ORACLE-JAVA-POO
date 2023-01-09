package Principal;
import MisExcepciones.MyException;
public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin main");
    }

    private static void metodo1() {
        System.out.println("Inicio de metodo 1");
        metodo2();
        System.out.println("Fin de metodo 1");
    }

    private static void metodo2() {
        System.out.println("Inicio metodo 2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        try{
            int num = 0;
            int resultado = 5 / 2;
            System.out.println("Resultado > " + resultado);
            throw new MisExcepciones.MyException("Excepcion propia lanzada");
        }catch(MisExcepciones.MyException me){
            System.out.println("Excepcion controlada! ");
            me.printStackTrace();
        }
            
            
        
         

    }
}
