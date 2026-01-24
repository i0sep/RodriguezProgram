package Unidad3.TipoExamenU3;

public class Main {
    public static void main(String[] args) {

        Sistema s1 = new Sistema(1000,
                eProteccionSistema.values()[(int)(Math.random()*3)]
            );
        System.out.println(s1.toString());
        s1.instalarProtecciones(eProteccionSistema.ANTIVIRUS);
        System.out.println(s1.toString());
    }
}
