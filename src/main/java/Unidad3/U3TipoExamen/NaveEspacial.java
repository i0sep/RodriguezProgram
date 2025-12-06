package Unidad3.U3TipoExamen;

public class NaveEspacial {
    public String nombre;
    public double combustible;
    private boolean enMision;

    //Constructores
    public NaveEspacial(String nombre, double combustible, boolean enMision){
        setNombre(nombre);
        setCombustible(combustible);
        setEnMision(enMision);
    }
    public NaveEspacial(String nombre, double combustible){
        this(nombre,combustible,false);
    }


    //Comportamientos
    public void despegar(){
        if (this.combustible>=100){
            setEnMision(true);
        }else {
            setEnMision((false));
        }
    }
    public void aterrizar(){
        setEnMision(false);
    }
    public void consumirCombustible(double litros){
        setCombustible(combustible-litros);
    }
    @Override
    public String toString() {
        String salida = "Nombre: " + nombre + ", Combustible: " + combustible + ", En misión: "+ enMision;
        return salida;
    }


    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCombustible() {
        return combustible;
    }

    public boolean isEnMision() {
        return enMision;
    }
    public void setCombustible(double combustible) {
        if (combustible>0 && combustible < 999.99){
            this.combustible = combustible;
        }else{
            this.combustible = 0;
        }
    }
    public void setEnMision(boolean enMision) {
        this.enMision = enMision;
    }
}