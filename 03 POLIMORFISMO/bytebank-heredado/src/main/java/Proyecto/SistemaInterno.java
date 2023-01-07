
package Proyecto;

public class SistemaInterno {
    private String clave = "1234";
    
    public boolean autentica(Gerente gerente) {
        boolean puedeLogearse = gerente.iniciarSesion(clave);
        if(puedeLogearse){
            System.out.println("Logeo exitoso! ");
            return true;
        }else{
            System.out.println("Error de Logeo! ");
            return false;
        }
    }
}
