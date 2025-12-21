package Unidad4.Tanda1.Ejercicio6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarea> tareas = new ArrayList<>();
        boolean correcto = true;
        do{
            System.out.println("Que deseas hacer: ");
            System.out.println("    1 ·Añadir una tarea.");
            System.out.println("    2 ·Completar una tarea.");
            System.out.println("    3 ·Mostrar tareas pendientes y completadas.");
            System.out.println("    4 ·Eliminar una tarea.");
            int respuesta = scanner.nextInt();
            switch (respuesta){
                case 1:
                    do{
                        System.out.print("Id de la tarea que quieres añadir (número):");

                        try{
                            respuesta = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Error al introducir el tipo de dato: "+e);
                        }
                        for (Tarea tareaFor : tareas){
                            if (tareaFor.getId()==respuesta){
                                correcto = false;
                                System.out.println("ID ya existente.");
                                break;
                            }else correcto = true;
                        }
                    } while (!correcto);
                    System.out.print("Descripción de la tarea:");
                    scanner.nextLine();
                    String respuestaString = scanner.nextLine();
                    System.out.println("    Tarea añadida.");
                    Tarea tarea = new Tarea(respuesta, respuestaString);
                    tareas.add(tarea);
                    break;
                case 2:
                    do {
                        System.out.print("Dime el ID de la tarea que quieres modificar:");
                        respuesta = scanner.nextInt();
                        for (Tarea tareaFor : tareas){
                            if (tareaFor.getId()==respuesta){
                                correcto = true;
                                tareaFor.completarTarea();
                                break;
                            }else correcto = false;
                        }
                        if (!correcto){
                            System.out.println("ID no existente");
                        }
                    }while (!correcto);
                    System.out.println("Tarea completada.");
                    break;
                case 3:
                    System.out.println("Tareas completadas.");
                    for (Tarea tareaFor : tareas){
                        if (tareaFor.isCompletado()){
                            System.out.println("    "+tareaFor.toString());
                        }
                    }
                    System.out.println("-------------------");
                    System.out.println("Tareas no completadas.");
                    for (Tarea tareaFor : tareas){
                        if (!tareaFor.isCompletado()){
                            System.out.println("    "+tareaFor.toString());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Dime el ID de la tarea que quieras eliminar:");
                    respuesta = scanner.nextInt();
                    for (int i = tareas.size() - 1; i >= 0; i--) {
                        if (tareas.get(i).getId() == respuesta) {
                            tareas.remove(i);
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }

        } while (true);
    }
}
