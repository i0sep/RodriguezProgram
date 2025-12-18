package Unidad4.Tanda1.Ejercicio4;

/*
        4. Declarar un array de dobles de 5 elementos; rellenar dicho array con valores
        numéricos entre 0.0 y 10.0; declarar un array de String de 5 elementos; insertar en el
        array de String nombres de alumnos; suponiendo son son notas imprimir nombre del
        alumno/a y la nota según esta tabla:
            ○ [1-4) - Suspenso
            ○ [5-5) - Aprobado
            ○ [6-6) - Bien
            ○ [7-8) - Notable
            ○ [9-9) - Sobresaliente
            ○ 10 - Matrícula
 */
public class main {
    public static void main(String[] args) {
        int longitud = 5;
        double[] notas = new double[longitud];
        for (int i = 0;i < longitud;i++){
            notas[i] = ((int)(Math.random()*1000))/100.0;
        }
        String[] nombres = new String[longitud];
        for (int i = 0;i < longitud;i++){
            // del 97 al 122
            char a = (char)((Math.random()*25)+65);
            char b = (char)((Math.random()*25)+97);
            char c = (char)((Math.random()*25)+97);
            char d = (char)((Math.random()*25)+97);
            nombres[i] = Character.toString(a)+Character.toString(b)+Character.toString(c)+Character.toString(d);
        }
        for (int i = 0;i < longitud;i++) {
            System.out.println("Notas de "+nombres[i]+": "+notas[i]);
            if (notas[i]<5){
                System.out.println("Estas suspenso.");
            } else if (notas[i]<6) {
                System.out.println("Estas aprobado.");
            } else if (notas[i]<7) {
                System.out.println("Estas aprobado, bien.");
            } else if (notas[i]<9) {
                System.out.println("Estas aprobado, notable.");
            } else if (notas[i]<10) {
                System.out.println("Estas aprobado, sobresaliente.");
            } else System.out.println("Estas aprobado, matricula.");
        }
    }
}
