package ENUMS;

public class TestEnums {

    public static void main(String[] args) {
        Dia d = Dia.DOMINGO;
        System.out.println(Dia.LUNES);
        System.out.println(d.getClass());
        
        for(Dia di : Dia.values()){
            System.out.println("El dia es > " + di);
    }
    }
}
