package Unidad3.POO;

public class Principal {
    public static void main(String[] args) {
        Figura circulo = new Figura(1,"rojo");
        circulo.mezclarColor("azul");
        Perro perro = new Perro();

        perro.setColor("amarillo");

        perro.pasear();
        perro.clean();
        if (perro.estaContento()){
            System.out.println("Perro feliz");
        }else System.out.println("Perro triste");
    }
}