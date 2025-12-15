package Unidad3.Tanda1.Ejercicio5;

public class Perfume {
    private int id;
    private Ingredientes ingrediente1;
    private Ingredientes ingrediente2;
    private Ingredientes ingrediente3;
    private Olores olor;
    enum Ingredientes{
        AZAHAR, PACHULI, VAINILLA, NULL
    }
    enum Olores{
        NORMAL, BUENO, MALO, NULL
    }

    //Constructores
    public Perfume(int id, Ingredientes ingrediente1){
        setId(id);
        setIngrediente1(ingrediente1);
        setIngrediente2(Ingredientes.NULL);
        setIngrediente3(Ingredientes.NULL);
    }
    public Perfume(int id){
        this(id,Ingredientes.NULL);
    }

    //Métodos
    public void prepararPerfume(Ingredientes ingrediente2, Ingredientes ingrediente3){
        setIngrediente2(ingrediente2);
        setIngrediente3(ingrediente3);
        funcionOlor();
    }
    public void funcionOlor() {
        int cantidadPachuli = 0; int cantidadAzahar = 0; int cantidadVainilla = 0;
        if (ingrediente1.equals(Ingredientes.PACHULI)){
            cantidadPachuli++;
        }else if (ingrediente1.equals(Ingredientes.AZAHAR)){
            cantidadAzahar++;
        } else if (ingrediente1.equals(Ingredientes.VAINILLA)){
            cantidadVainilla++;
        }
        if (ingrediente2.equals(Ingredientes.PACHULI)){
            cantidadPachuli++;
        }else if (ingrediente2.equals(Ingredientes.AZAHAR)){
            cantidadAzahar++;
        } else if (ingrediente2.equals(Ingredientes.VAINILLA)){
            cantidadVainilla++;
        }
        if (ingrediente3.equals(Ingredientes.PACHULI)){
            cantidadPachuli++;
        }else if (ingrediente3.equals(Ingredientes.AZAHAR)){
            cantidadAzahar++;
        } else if (ingrediente3.equals(Ingredientes.VAINILLA)){
            cantidadVainilla++;
        }
        if (cantidadPachuli >= 2){
            olor = Olores.MALO;
        } else if (cantidadAzahar >= 2) {
            olor = Olores.BUENO;
        }else olor = Olores.NORMAL;
    }


    //getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Ingredientes getIngrediente1() {
        return ingrediente1;
    }
    public void setIngrediente1(Ingredientes ingrediente1) {
        this.ingrediente1 = ingrediente1;
        funcionOlor();
    }
    public Ingredientes getIngrediente2() {
        return ingrediente2;
    }
    public void setIngrediente2(Ingredientes ingrediente2) {
        this.ingrediente2 = ingrediente2;
        funcionOlor();
    }
    public Ingredientes getIngrediente3() {
        return ingrediente3;
    }
    public void setIngrediente3(Ingredientes ingrediente3) {
        this.ingrediente3 = ingrediente3;
        funcionOlor();
    }
    public Olores getOlor() {
        return olor;
    }
    public void setOlor(Olores olor){
        this.olor = olor;
    }
}
