package Unidad3.U3TipoExamen;

public class NaveEspacial {
    private String nombre;
    private double combustible;
    private boolean enMision;

    public NaveEspacial(String nombre, double combustible, boolean enMision){
        setNombre(nombre);
        setCombustible(combustible);
        setEnMision(enMision);
    }
    public NaveEspacial(){
        this("Nave",100,false);
    }
    public NaveEspacial(String nombre){
        this(nombre,100,false);
    }
    public NaveEspacial(double combustible){
        this("Nave",combustible,false);
    }
    public NaveEspacial(boolean enMision){
        this("Nave",100,enMision);
    }
    public NaveEspacial(String nombre, double combustible){
        this(nombre,combustible,false);
    }
    public NaveEspacial(String nombre, boolean enMision){
        this(nombre,100,enMision);
    }
    public NaveEspacial(double combustible, String nombre){
        this(nombre,combustible,false);
    }
    public NaveEspacial(double combustible, boolean enMision){
        this("Nave", combustible, enMision);
    }
    public NaveEspacial(boolean enMision, String nombre){
        this(nombre,100,enMision);
    }
    public NaveEspacial(boolean enMision, double combustible){
        this("Nave",combustible,enMision);
    }


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



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible>0 && combustible < 999.99){
            this.combustible = combustible;
        }else{
            this.combustible = 0;
        }
    }

    public boolean isEnMision() {
        return enMision;
    }

    public void setEnMision(boolean enMision) {
        this.enMision = enMision;
    }




    @Override
    public String toString() {
        String salida = "Nombre: " + nombre + ", Combustible: " + combustible + ", En misión: "+ enMision;
        return salida;
    }



}