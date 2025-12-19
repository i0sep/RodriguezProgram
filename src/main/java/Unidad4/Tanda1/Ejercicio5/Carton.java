package Unidad4.Tanda1.Ejercicio5;

public class Carton {
    private int id;
    private int[][] matriz;
    private boolean[] linea;
    private boolean bingo;


    // Constructores
    public Carton(int id,int numeroMaximo){
        setId(id);
        matriz = new int[3][4];
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++){
                matriz[i][j] = (int)(Math.random()*(numeroMaximo-1)+1);
            }
        }
        setLinea(new boolean[]{false, false, false});
        setBingo(false);
    }

    //Metodos
    public void comprobar(int numero){
        for (int i = 0;i<3;i++){
            int acierto = 0;
            for (int j = 0;j<4;j++){
                if (matriz[i][j] == numero){
                    matriz[i][j] = 0;
                    for (int z = 0; z < 4; z++){
                        if (matriz[i][z]==0){
                            acierto++;
                        } else {
                            break;
                        }
                    }
                    if (acierto==4){
                        informacion();
                        System.out.println("El cartón "+id+" ha hecho línea ("+(i+1)+")");
                        System.out.println();
                        linea[i] = true;
                        if (linea[0] && linea[1] && linea[2]){
                            setBingo(true);
                            System.out.println("El cartón "+id+" ha hecho bingo.");
                        }
                    }
                }
            }
        }
    }
    public void informacion(){
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

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
