package Unidad4.MazmorraMatriz;

import java.util.Arrays;
import java.util.Locale;

enum TIPO_CORRECTO{
    ESBIRRO, DESCANSO, TESORO, COMERCIANTE, EVENTO, TRAMPA, AMO;
}
public class Carta {
    private TIPO_CORRECTO tipo;
    private final String[] informacion = new String[3];

    // Constructor
    public Carta(String tipo){
        setTipo(tipo);
        setInformacion();
    }





    // getter y setters
    public String[] getInformacion() {
        return informacion;
    }
    public void setTipo(String tipo) {
        try {
            this.tipo = TIPO_CORRECTO.valueOf(tipo.toUpperCase());
        } catch (IllegalArgumentException e) {
            this.tipo = TIPO_CORRECTO.ESBIRRO;
        }
    }
    public void setInformacion() {
        switch (tipo){
            case ESBIRRO:
                informacion[0] = "Soldado esqueleto; Daño 2; 1PX";
                informacion[1] = "Espectro oscuro; Daño 4; 1PX";
                informacion[2] = "Acólito del vacío; Daño 6; 2PX";
                break;
            case AMO:
                informacion[0] = "Lord Esqueleto; H: 10; D: 2; 2 oro + 2PX + Item";
                informacion[1] = "Señor Espectral; H: 15; D: 4; 2 oro + 3PX + Item";
                informacion[2] = "Demonio del Vacío; H: 20; D: 6; 3 oro + 4PX + Item";
                break;
            case DESCANSO:
                informacion[0] = "Reforzar Arma: 1PX";
                informacion[1] = "Buscar una ración: +1 Comida";
                informacion[2] = "Curación +2 Heridas";
                break;
            case EVENTO:
                informacion[0] = "Ración Encontrada: +1 Comida";
                informacion[1] = "Poción de Salud: +2 Heridas";
                informacion[2] = "Botín Encontrado: +2 Oro";
                break;
            case TRAMPA:
                informacion[0] = "Miasma de Moho: -1 Comida";
                informacion[1] = "Cuerda Trampa: -1 Oro";
                informacion[2] = "Lluvia Ácida: -1 Armadura";
                break;
            case COMERCIANTE:
                informacion[0] = "1 Oro - Ración: +1 Comida";
                informacion[1] = "1 Oro - Poción de Salud: +1H";
                informacion[2] = "3 Oro - Grande Poción de Salud: +4H";
                break;
            case TESORO:
                informacion[0] = "Armadura: +1 Armadura";
                informacion[1] = "Arma: +2 Puntos de Experiencia";
                informacion[2] = "Hechizo de Fuego: -8 Heridas Enemigo";
        }
    }
    @Override
    public String toString() {
        return "Carta{" +
                "tipo='" + tipo + '\'' +
                ", informacion=" + Arrays.toString(informacion) +
                '}';
    }
    public TIPO_CORRECTO getTipo() {
        return tipo;
    }
}
