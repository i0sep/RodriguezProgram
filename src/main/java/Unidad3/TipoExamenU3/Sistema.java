package Unidad3.TipoExamenU3;

import java.util.Scanner;

public class Sistema {
    private int id;
    private eProteccionSistema PROTECCION1;
    private eProteccionSistema PROTECCION2;
    private eProteccionSistema PROTECCION3;
    private int dificultad;
    private String estado;

    public Sistema(int id, eProteccionSistema PROTECCION1, eProteccionSistema PROTECCION2){
        setId(id);
        setPROTECCION1(PROTECCION1);
        setPROTECCION2(PROTECCION2);
        setEstado("Protegido");
    }
    public Sistema(int id, eProteccionSistema PROTECCION1){
        this(id, PROTECCION1,null);
    }



    // Metodos
    public boolean comprobarProteccion(eProteccionSistema proteccion){
        for (eProteccionSistema proteccionAux : eProteccionSistema.values()){
            if (proteccionAux == proteccion){
                return true;
            }
        }
        return false;
    }
    public void InstalarProtecciones(eProteccionSistema PROTECCION3){
        int count = 0; int aux;
        if (comprobarProteccion(PROTECCION3)){
            setProteccion3(PROTECCION3);
            for (eProteccionSistema sistema : eProteccionSistema.values()){
                if (sistema == PROTECCION1){
                    count++;
                } else if (sistema == PROTECCION2) {
                    count++;
                } else if (sistema == PROTECCION3) {
                    count++;
                }
                aux = count;
                if (aux <= count){
                    switch (aux){
                        case 1:
                            setDificultad(100);
                            break;
                        case 2:
                            setDificultad(50);
                            break;
                        case 3:
                            setDificultad(20);
                            break;
                    }
                }
            }
        }
    }



    // Getter y setter

    public void setId(int id) {
        this.id = id;
    }
    public void setPROTECCION1(eProteccionSistema PROTECCION1) {
        if (PROTECCION1 == null){
            return;
        }else if (comprobarProteccion(PROTECCION1)){
            this.PROTECCION1 = PROTECCION3;
        }else {
            this.PROTECCION1 = null;
        }
    }
    public void setPROTECCION2(eProteccionSistema PROTECCION2) {
        if (PROTECCION2 == null){
            return;
        }else if (comprobarProteccion(PROTECCION2)){
            this.PROTECCION2 = PROTECCION2;
        }else {
            this.PROTECCION2 = null;
        }
    }
    public void setProteccion3(eProteccionSistema PROTECCION3) {
        if (PROTECCION3 == null){
            return;
        }else if (comprobarProteccion(PROTECCION3)){
            this.PROTECCION3 = PROTECCION3;
        }else {
            this.PROTECCION3 = null;
        }
    }
    public void pedirProteccion(eProteccionSistema PROTECCION){
        Scanner scanner = new Scanner(System.in);
        while (comprobarProteccion(PROTECCION)){
            System.out.println("Introduceme una proteccion correcta ('Antivirus','Firewall,'IDS'): ");
            String respuesta = scanner.nextLine();
            PROTECCION = eProteccionSistema.valueOf(respuesta.toUpperCase());
        }
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setDificultad(int dificultad) {
        if (dificultad < 0){
            this.dificultad = 0;
        } else if (dificultad <= 100) {
            this.dificultad = dificultad;
        } else {
            this.dificultad = 100;
        }
    }
    public String getEstado() {
        return estado;
    }
    public int getDificultad() {
        return dificultad;
    }
    @Override
    public String toString() {
        return "Sistema{" +
                "id=" + id +
                ", proteccion1='" + PROTECCION1 + '\'' +
                ", proteccion2='" + PROTECCION2 + '\'' +
                ", proteccion3='" + PROTECCION3 + '\'' +
                ", dificultad=" + dificultad +
                ", estado='" + estado + '\'' +
                '}';
    }
    public eProteccionSistema getPROTECCION1() {
        return PROTECCION1;
    }
    public eProteccionSistema getPROTECCION2() {
        return PROTECCION2;
    }
    public eProteccionSistema getPROTECCION3() {
        return PROTECCION3;
    }
}

