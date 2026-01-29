package Unidad4.Oficial;

public class DireccionMemoria2 {
    private int[] ObjetoNumeros;

    public DireccionMemoria2(){
    }
    public void direccionMemoria(){
    }
    public void setObjetoNumeros(int[] objetoNumeros) {
        System.out.println(ObjetoNumeros);
        ObjetoNumeros = objetoNumeros;
        System.out.println(ObjetoNumeros);
    }
    public int[] getObjetoNumeros() {
        return ObjetoNumeros;
    }
}
