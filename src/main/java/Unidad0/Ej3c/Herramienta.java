package Unidad0.Ej3c;

public class Herramienta {
    private String nombre;
    private int durabilidad;
    public Herramienta(String herramientaNombre){
        int durabilidadMaxima = 20;    //tiene en cuenta el 0
        setNombre(herramientaNombre);
        setDurabilidad((int)(Math.random()*5));
    }
    public void usarHerramienta(){
        durabilidad--;
        System.out.println("Tu "+nombre+" ha perdido uno de durabilidad.");
        if (durabilidad <= 0){
            romperse();
        }
    }

    private void romperse() {
        System.out.println("Tu "+nombre+" se ha roto.");
    }

    public void usarHerramienta(int cantidad){
        setDurabilidad(durabilidad - cantidad);
        System.out.println("Tu "+ nombre + " ha usado "+cantidad+" de durabilidad");

        if (durabilidad <= 0){
            romperse();
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDurabilidad() {
        return durabilidad;
    }
    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }
}
