package Unidad0.Ej3a;

public class Division implements Operacion{

    @Override
    public int operacion(int num1, int num2) {
        if (num2==0){
            System.out.println("Error no se puede dividir entre 0");
            return 0;
        }
        return num1/num2;
    }
}
