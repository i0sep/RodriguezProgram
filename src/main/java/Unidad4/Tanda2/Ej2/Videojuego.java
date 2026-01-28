package Unidad4.Tanda2.Ej2;

public class Videojuego {
    private String titulo;
    private eGenero genero;
    private int precio;

    public Videojuego(String titulo, eGenero genero,int precio){
        setTitulo(titulo);
        setGenero(genero);
        setPrecio(precio);
    }

    public void setGenero(eGenero genero) {
        this.genero = genero;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public eGenero getGenero() {
        return genero;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", genero=" + genero +
                ", precio=" + precio +
                '}';
    }
}
