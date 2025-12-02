package Unidad3.U3TipoExamen;

/*

        ● Clase NaveEspacial con los siguientes atributos:
            ○ nombre (String): Nombre de la nave.
            ○ combustible (double): Cantidad de combustible en litros.
            ○ enMision (boolean): Indica si la nave está en misión o no.
        ● Constructores:
            ○ Con todos los atributos.
            ○ Sólo con el nombre y el combustible (obligatorio utilizar this())
        ● Métodos del objeto:
            ○ despegar(): Cambia el estado de enMision a true si hay suficiente combustible
            (mínimo 100 litros).
            ○ aterrizar(): Cambia el estado de enMision a false.
            ○ consumirCombustible(double litros): Reduce el combustible en la cantidad
            especificada, pero no puede ser negativo.
            ○ setCompustible: debe estar entre 0 y 999.99.
            ○ toString(): Devuelve la información del objeto
        ● Método main donde:
            ○ Se creen 2 instancias del objeto (cada una con un constructor y valores distintos a
            decidir por el programador/a).
            ○ Se complete la información faltante si es necesario.
            ○ Se muestre la información de los objetos.
            ○ Con cada objeto se realice las acciones:
                ■ despegar
                ■ consumirCombustible (cada objeto una cantidad distinta)
                ■ aterrizar
            ○ Se muestre la información actualizada de los objetos
            ○ Si informe de qué nave tiene menos combustible


 */
public class main {
    public static void main(String[] args) {
        NaveEspacial Nave = new NaveEspacial(200);
        Nave.consumirCombustible(250);
        System.out.println(Nave);
    }
}
