package Unidad4.MazmorraMatriz;

public class Zona {
    private int nivel;
    private boolean jefe;
    private Carta[][] cartas;

    // Constructor
    public Zona(){
        setCartas();
    }






    // getter y setters
    public void setCartas() {
        cartas = new Carta[][]{
                new Carta[]{new Carta(Carta.TIPOCORRECTO[(int)(Math.random()*5)]),
                        new Carta(Carta.TIPOCORRECTO[(int)(Math.random()*5)]),
                        new Carta(Carta.TIPOCORRECTO[(int)(Math.random()*5)])       },
                new Carta[]{new Carta(Carta.TIPOCORRECTO[(int)(Math.random()*5)]),
                        new Carta(Carta.TIPOCORRECTO[(int)(Math.random()*5)]),
                        new Carta(Carta.TIPOCORRECTO[(int)(Math.random()*5)])},
                new Carta[]{new Carta(Carta.TIPOCORRECTO[(int)(Math.random()*5)]),
                        new Carta(Carta.TIPOCORRECTO[(int)(Math.random()*5)]),
                        new Carta(Carta.TIPOCORRECTO[6])},
        };
    }
}
