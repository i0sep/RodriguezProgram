package Unidad3.Tanda1.Ejercicio2;

public class main {
    public static void main(String[] args) {
        Producto producto = new Producto("Cereales",6.40,6);
        Producto producto2 = new Producto("Pistachos",0.1,59);

        System.out.printf("%.2f\n",producto.calcularTotal());
        System.out.println(producto2.calcularTotal());
    }
}
