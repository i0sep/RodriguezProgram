import java.util.Scanner;

public class aaaaTESTING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i+=2) {
            System.out.println(i);
            assert i % 2 == 0: "Error: " + i + " no es par";
        }
        System.out.println("Fin del programa");
    }
}