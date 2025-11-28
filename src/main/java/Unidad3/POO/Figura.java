package Unidad3.POO;

public class Figura {
    private int num_lados;
    private String color;

    public Figura(int num_lados, String color) {
        setNum_lados(num_lados);
        setColor(color);
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

    @Override
    public String toString() {
        String salida = "Figura{" +
                "lados=" + num_lados +
                ", color='" + color + '\'' +
                '}';
        return salida;
    }

    public void mezclarColor(String otroColor){
        if (otroColor.equalsIgnoreCase("rojo") && this.color.equalsIgnoreCase("azul")){
            this.color = "morado";
        }else if (otroColor.equalsIgnoreCase("rojo") && this.color.equalsIgnoreCase("amarillo")){
            this.color = "naranja";
        }else if (otroColor.equalsIgnoreCase("azul") && this.color.equalsIgnoreCase("amarillo")){
            this.color = "verde";
        }else if (otroColor.equalsIgnoreCase("azul") && this.color.equalsIgnoreCase("rojo")){
            this.color = "morado";
        }
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

