package Unidad4.MazmorraMatriz;

public class Main {
    public static void main(String[] args) {
        Carta[] cartasDeSala = {
                new Carta("esbirro"),new Carta("esbirro"),
                new Carta("descanso"),new Carta("descanso"),
                new Carta("tesoro"),new Carta("tesoro"),
                new Carta("comerciante"),new Carta("comerciante"),
                new Carta("evento"),new Carta("evento"),
                new Carta("trampa"),new Carta("trampa"),
        };

        Zona zonaPrimera = new Zona(1,true);
        zonaPrimera.rellenarZona(cartasDeSala);

        System.out.println("Nivel de la zona: "+zonaPrimera.getNivel());
        System.out.println(zonaPrimera.isJefe() ? "La zona tiene jefe":"La zona no tiene jefe");
        for (int i = 0 ; i < zonaPrimera.getCartas().length; i++){
            for (int j = 0; j < zonaPrimera.getCartas().length ; j++){
                System.out.println("Carta contenida en esta zona ("+i+" "+j+"): "+zonaPrimera.getCartas()[i][j]);
            }
        }
    }
}
