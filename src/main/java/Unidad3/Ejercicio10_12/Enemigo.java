package Unidad3.Ejercicio10_12;

public class Enemigo {
    private int vida;
    private int danio;
    private int nivel;

    //Constructores
    public Enemigo(int nivel){
        if (nivel == 1){
            setDanio(2);
            setVida(6);
        } else if (nivel == 2) {
            setDanio(5);
            setVida(12);
        }
        setNivel(nivel);
    }
    //Metodos

    public int atacar(){
        int ataque;
        if (Math.random()*6==0){
            ataque = 0;
        }else ataque = danio;
        return ataque;
    }
    public void recibirDanio(int danio){
        vida -= danio;
    }

    //Getter y setter
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getDanio() {
        return danio;
    }
    public void setDanio(int danio) {
        this.danio = danio;
    }
    @Override
    public String toString() {
        return "Enemigo{" +
                "vida=" + vida +
                ", danio=" + danio +
                ", nivel=" + nivel +
                '}';
    }
}
