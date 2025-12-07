package Unidad3.Tanda1.Ejercicio5;

public class main {
    public static void main(String[] args) {
        Perfume perfume1 = new Perfume(1, Perfume.Ingredientes.PACHULI);
        Perfume perfume2 = new Perfume(2, Perfume.Ingredientes.AZAHAR);
        int random = (int)(Math.random()*3);
        System.out.println(perfume1.getOlor());
        System.out.println(perfume2.getOlor());

        if (random == 0){
            perfume1.setIngrediente2(Perfume.Ingredientes.PACHULI);
        } else if (random == 1) {
            perfume1.setIngrediente2(Perfume.Ingredientes.AZAHAR);
        }else {
            perfume1.setIngrediente2(Perfume.Ingredientes.VAINILLA);
        }
        random = (int)(Math.random()*3);
        if (random == 0){
            perfume1.setIngrediente3(Perfume.Ingredientes.PACHULI);
        } else if (random == 1) {
            perfume1.setIngrediente3(Perfume.Ingredientes.AZAHAR);
        }else {
            perfume1.setIngrediente3(Perfume.Ingredientes.VAINILLA);
        }
        random = (int)(Math.random()*3);
        if (random == 0){
            perfume2.setIngrediente2(Perfume.Ingredientes.PACHULI);
        } else if (random == 1) {
            perfume2.setIngrediente2(Perfume.Ingredientes.AZAHAR);
        }else {
            perfume2.setIngrediente2(Perfume.Ingredientes.VAINILLA);
        }
        random = (int)(Math.random()*3);
        if (random == 0){
            perfume2.setIngrediente3(Perfume.Ingredientes.PACHULI);
        } else if (random == 1) {
            perfume2.setIngrediente3(Perfume.Ingredientes.AZAHAR);
        }else {
            perfume2.setIngrediente3(Perfume.Ingredientes.VAINILLA);
        }

        System.out.println("------------------------");
        System.out.println(perfume1.getOlor());
        System.out.print(perfume2.getOlor());
    }
}
