package Unidad3.TipoExamenU3;

public class Hacker {
    private String nombre;
    private int cansancio;
    private int concentracion;

    public Hacker(String nombre, int cansancio, int concentracion){
        setNombre(nombre);
        setCansancio(cansancio);
        setConcentracion(concentracion);
    }
    public Hacker(String nombre){
        this(nombre,0,100);
    }

    //metodos
    public void entrarSistema(Sistema s1){
        if (s1.getEstado().equalsIgnoreCase("Hackeado")){
            System.out.println("Sistema ya hackeado");
        }else if (s1.getEstado().equalsIgnoreCase("Protegido")){
            if (concentracion > s1.getDificultad() && cansancio < 70){
                s1.setEstado("Hackeado");
                setCansancio(cansancio+20);
                setConcentracion(concentracion-10);
            }else {
                setCansancio(cansancio+10);
                setConcentracion(concentracion-20);
            }
        }
    }


    // getter y setter
    public void setCansancio(int cansancio) {
        if (cansancio < 0){
            this.cansancio = 0;
        } else if (cansancio >= 0 && cansancio <= 100) {
            this.cansancio = cansancio;
        } else {
            this.cansancio = 100;
        }
    }
    public void setConcentracion(int concentracion) {
        if (concentracion < 0){
            this.concentracion = 0;
        } else if (concentracion >= 0 && concentracion <= 100) {
            this.concentracion = concentracion;
        } else {
            this.concentracion = 100;
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
