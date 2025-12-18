package Unidad4.Tanda1.Ejercicio5;

public class Carton {
    private int id;
    private int[][] matriz;
    private int[][] matrizAcertada;
    private boolean[] linea;
    private boolean bingo;


    // Constructores
    public Carton(int id,int numeroMaximo){
        setId(id);
        matriz = new int[3][4];
        for (int i = 0;i<4;i++){
            for (int j = 0;j<3;j++){
                matriz[j][i] = (int)(Math.random()*(numeroMaximo-1))+1;
            }
        }
        setLinea(new boolean[]{false, false, false});
        setBingo(false);
    }

    //Metodos
    public void comprobar(int numero){
        matrizAcertada = new int[3][4];
        int acierto = 0;
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++){
                if (matriz[i][j] == numero){
                    matriz[i][j] = matrizAcertada[j][i];
                    for (int h = 0;h<4;h++){
                        if (matriz[i][h] == matrizAcertada[i][h]){
                            acierto++;
                            if (acierto==4){
                                System.out.println("El bingo "+id+" ha hecho línea.");
                            }
                        }else {
                            break;
                        }
                    }
                }
            }
        }
    }
//    public int[][] informacion(){
//        return 0;
//    }


    //Getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean[] getLinea() {
        return linea;
    }
    public void setLinea(boolean[] linea) {
        this.linea = linea;
    }
    public int[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    public boolean isBingo() {
        return bingo;
    }
    public void setBingo(boolean bingo) {
        this.bingo = bingo;
    }
}
