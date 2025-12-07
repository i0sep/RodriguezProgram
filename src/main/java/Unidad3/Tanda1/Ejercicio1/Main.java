package Unidad3.Tanda1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Coche coche1 =  new Coche();
        Coche coche2 = new Coche("Jaguar","A4",2005);

        if (coche1.getBrand().equalsIgnoreCase(coche2.getBrand())){
            System.out.println("Son de la misma marca.");
        }else System.out.println("No son de la misma marca.");

        System.out.println("------------------------");

        if (coche1.getModel().equalsIgnoreCase(coche2.getModel())){
            System.out.println("Son el mismo modelo.");
        }else System.out.println("No son el mismo modelo.");

        System.out.println("------------------------");

        if (coche1.getYear()==coche2.getYear()){
            System.out.println("Son del mismo año");
        }else if (coche1.getYear()< coche2.getYear()){
            System.out.println(coche1.getBrand()+" "+coche1.getModel()+" tiene mas años que "+ coche2.getBrand()+" "+coche2.getModel());
        }else System.out.println(coche2.getBrand()+" "+coche2.getModel()+" tiene mas años que "+ coche1.getBrand()+" "+coche1.getModel());

    }
}
