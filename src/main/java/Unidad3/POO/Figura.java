package Unidad3.POO;

public class Figura {
    private int num_lados;
    private String color;

    public Figura(int num_lados, String color) {
        this.num_lados = num_lados;
        this.color = color;
    }

    public Figura(int num_lados){
        this(num_lados,"rojo");
    }

    public Figura(String color){
        this(1,color);
    }

    public Figura(){
        this(1,"rojo");
    }




    public int getNum_lados() {
        return num_lados;
    }

    public void setNum_lados(int num_lados) {
        this.num_lados = num_lados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

