package Unidad3.EjercicioDefensaUT3.Ejercicio3;

public class Equipo {
    Animal slot1;
    Animal slot2;
    Animal slot3;

    //Constructor
    public Equipo(Animal animal1,Animal animal2,Animal animal3){
        setSlot1(animal1);
        setSlot2(animal2);
        setSlot3(animal3);
    }
    //metodos
    public int atacar(){
        return mascotaAlFrente().atacar();
    }
    public void recibirAtaque(int damage){
        if (isAlive()){
            Animal frente = mascotaAlFrente();
            frente.recibirDano(damage);
            System.out.println("---------------------------");
            System.out.println(frente.getNombre()+" ha recibido "+damage+" de daño.");
            System.out.println("    Vida restante de "+frente.getNombre()+": "+frente.getVida());
            if (!frente.isAlive()){
                System.out.println(frente.getNombre()+" ha fallecido.");
            }
        }
    }

    public Animal mascotaAlFrente(){
        if (slot1.isAlive()){
            return slot1;
        } else if (slot2.isAlive()){
            return slot2;
        } else{
            return slot3;
        }
    }
    public boolean isAlive(){
        return slot1.isAlive() || slot2.isAlive() || slot3.isAlive();
    }

    //getters y setters
    public void setSlot1(Animal slot1) {
        this.slot1 = slot1;
    }
    public void setSlot2(Animal slot2) {
        this.slot2 = slot2;
    }
    public void setSlot3(Animal slot3) {
        this.slot3 = slot3;
    }
}
