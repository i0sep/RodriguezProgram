package Unidad0.Ej3b;

public class Preguntas {
    private final String pregunta;
    private final String respuesta;
    //Constructor
    public Preguntas(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }


    //Metodos
    public void salidaPregunta(){
        System.out.println(pregunta);
    }
    public boolean isCorrect(String salida){
        return respuesta.equalsIgnoreCase(salida);
    }
}
