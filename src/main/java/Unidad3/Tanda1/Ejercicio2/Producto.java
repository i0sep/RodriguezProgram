package Unidad3.Tanda1.Ejercicio2;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    //Constructores
    public Producto(String nombre, double precio, int cantidad){
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
    }

    //Comportamientos
    @Override
    public String toString(){
        String salida = "Producto[Nombre: "+nombre+", Precio: "+precio+", Cantidad: "+cantidad+"]";;
        return salida;
    }
    public double calcularTotal(){
        double costoTotal = this.cantidad * this.precio;
        return costoTotal;
    }



    //getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
