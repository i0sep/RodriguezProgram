package Unidad1;

import java.util.Scanner;
public class u1t2ej2 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime la temperatura en Celsius: ");
        double celsius = skanner.nextDouble();
        double Fahrenheit = fFahrenheit(celsius);
        System.out.print(celsius+"°C es "+Fahrenheit+" en °F");
    }
    public static double fFahrenheit(double n1){
        double Fahrenheit = (n1 * 9/5) + 32;
        return Fahrenheit;
    }
}