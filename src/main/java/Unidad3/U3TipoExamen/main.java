package Unidad3.U3TipoExamen;

public class main {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Gorrion",200);
        NaveEspacial nave2 = new NaveEspacial("Pajaro",0,true);

        System.out.println(nave1.toString());
        System.out.println(nave2.toString());

        nave1(nave1);
        nave1(nave2);

        System.out.println("    "+nave1.toString());
        System.out.println("    "+nave2.toString());

        System.out.println("-------------------------------");
        if (nave1.combustible == nave2.combustible){
            System.out.println("Las dos naves tienen el mismo combustible");
        } else if (nave1.combustible > nave2.combustible) {
            System.out.println(nave1.nombre+" tiene mas combustible que "+nave2.nombre);
        }else {
            System.out.println(nave2.nombre+" tiene mas combustible que "+nave1.nombre);
        }
    }
    public static void nave1(NaveEspacial nave){
        nave.despegar();
        nave.consumirCombustible(100);
        nave.aterrizar();
    }
}
