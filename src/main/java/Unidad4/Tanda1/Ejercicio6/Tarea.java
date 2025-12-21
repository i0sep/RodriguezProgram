package Unidad4.Tanda1.Ejercicio6;

public class Tarea {
    private int id;
    private String descripcion;
    private boolean completado;

    // Constructores
    public Tarea(int id, String descripcion){
        setId(id);
        setDescripcion(descripcion);
        setCompletado(false);
    }

    //Metodos
    public void completarTarea(){
        setCompletado(true);
    }


    // Getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isCompletado() {
        return completado;
    }
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", completado=" + completado +
                '}';
    }
}
