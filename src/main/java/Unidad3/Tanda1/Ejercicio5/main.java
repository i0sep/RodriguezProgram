package Unidad3.Tanda1.Ejercicio5;

public class main {
    public static void main(String[] args) {
        Perfume perfume1 = new Perfume(1, Ingredientes.PACHULI);
        Perfume perfume2 = new Perfume(2, Ingredientes.AZAHAR);
        int random = (int)(Math.random()*3);
        System.out.println(perfume1.getOlor());
        System.out.println(perfume2.getOlor());

        perfume1 = aleatorio(perfume1);
        perfume2 = aleatorio(perfume2);

        System.out.println("------------------------");
        System.out.println(perfume1.getOlor());
        System.out.print(perfume2.getOlor());
    }
    public static Perfume aleatorio(Perfume perfume){
        int random = (int)(Math.random()*3);
        int random1 = (int)(Math.random()*3);
        Ingredientes ing1;
        Ingredientes ing2;
        if (random == 0){
            ing1 = Ingredientes.PACHULI;
        } else if (random == 1) {
            ing1 = Ingredientes.AZAHAR;
        }else {
            ing1 = Ingredientes.VAINILLA;
        }
        if (random1 == 0){
            ing2 = Ingredientes.PACHULI;
        } else if (random1 == 1) {
            ing2 = Ingredientes.AZAHAR;
        }else {
            ing2 = Ingredientes.VAINILLA;
        }
        perfume.prepararPerfume(ing1,ing2);
        return perfume;
    }
}
