package Unidad3.POO;

public class Perro {
    private int nPatas;
    private String raza;
    private String color;
    private int nivelSuciedad;
    public static int nPerros;

    public Perro(String raza, int nPatas, String color, int nivelSuciedad){
        setnPatas(nPatas);
        setColor(color);
        setRaza(raza);
        setNivelSuciedad(nivelSuciedad);
        nPerros++;
    }

    @Override
    public String toString() {
        String salida = "Perro {Raza: "+raza+", Número de patas: "+nPatas+", Color: "+color+", " +
                "Suciedad: "+nivelSuciedad+" Perros totales: " + nPerros;
        return salida;
    }

    public Perro(){
        this("caniche",4,"marrón",0);
    }

    public boolean estaContento(){
        if (this.nivelSuciedad>=10){
            return false;
        }else return true;
    }

    public void pasear(){
        setNivelSuciedad(this.nivelSuciedad+10);
    }

    public void clean(){
        setNivelSuciedad(0);
    }

    public static void ladrar(){
        System.out.println("Guau guau.");
    }





    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNivelSuciedad() {
        return nivelSuciedad;
    }

    public void setNivelSuciedad(int nivelSuciedad) {
        this.nivelSuciedad = nivelSuciedad;
    }

}
