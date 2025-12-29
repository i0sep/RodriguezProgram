package Unidad0.Ej3c;

public class Bloque {
    private String name;
    private Herramienta tipoHerramienta;
    private Item drop;


    //Constructor
    public Bloque(String name, Herramienta tipoHerramienta, Item drop) {
        setName(name);
        setTipoHerramienta(tipoHerramienta);
        setDrop(drop);
    }

    //Metodos
    public boolean isCorrect(Herramienta herramienta){
        if (tipoHerramienta.getNombre().equalsIgnoreCase(herramienta.getNombre())){

        }
        return true;
    }



    //getter y setter
    public Item getDrop() {
        return drop;
    }
    public void setDrop(Item drop) {
        this.drop = drop;
    }
    public Herramienta getTipoHerramienta() {
        return tipoHerramienta;
    }
    public void setTipoHerramienta(Herramienta tipoHerramienta) {
        this.tipoHerramienta = tipoHerramienta;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
