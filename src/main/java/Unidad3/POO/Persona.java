package Unidad3.POO;

public class Persona {
    private String nombre, apellido;
    private int edad;
    private int altura;
    private float peso;

    public Persona() {
        this("", "", 0, 0, 0);
    }


    public Persona(String nombre) {
        this(nombre, "", 0, 0, 0);
    }


    public Persona(String nombre, String apellido) {
        this(nombre, apellido, 0, 0, 0);
    }


    public Persona(String nombre, String apellido, int edad) {
        this(nombre, apellido, edad, 0, 0);
    }

    public Persona(String nombre, String apellido, int edad, int altura, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}