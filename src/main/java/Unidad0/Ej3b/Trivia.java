package Unidad0.Ej3b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trivia {

    private final List<Preguntas> pregunta = new ArrayList<>();
    private int puntos;

    //Constructor
    public Trivia(){
        pregunta.add(new Preguntas("¿Cuál es el río más largo del mundo?", "Amazonas"));
        pregunta.add(new Preguntas("¿Qué elemento de la tabla periódica tiene el símbolo Au?", "Oro"));
        pregunta.add(new Preguntas("¿En qué año cayó el Muro de Berlín?", "1989"));
        pregunta.add(new Preguntas("¿Quién pintó la obra La noche estrellada?", "Vincent van Gogh"));
        pregunta.add(new Preguntas("¿Cuál es el planeta más grande del sistema solar?", "Júpiter"));
        pregunta.add(new Preguntas("¿Cuál es el hueso más largo del cuerpo humano?", "Fémur"));
    }



    //Metodos
    public void empezar(){
        Scanner scanner = new Scanner(System.in);
        int rounds = 2;

        for (int i = 0; i < rounds; i++){
            nuevaPregunta(scanner);
        }
        System.out.println("Juego terminado. Preguntas acertadas: "+puntos+"/"+rounds);
    }

    private void nuevaPregunta(Scanner scanner){
        Preguntas pregunta = aleatorio();
        pregunta.salidaPregunta();
        String respuesta = scanner.nextLine();
        if (pregunta.isCorrect(respuesta)){
            System.out.println("Correcto.");
            puntos++;
        }else{
            System.out.println("Incorrecto.");
        }

    }

    private Preguntas aleatorio(){
        int numeroPreguntas = 6;
        int index = (int)(Math.random()*(numeroPreguntas-1))+1;
        Preguntas salida = pregunta.get(index);
        pregunta.remove(salida);
        return salida;
    }

    //getter setters
}
