package Unidad3.Tanda1.Ejercicio1;

import java.time.Year;

public class Coche {
    private String brand;
    private  String model;
    private int year;

    //Constructores
    public Coche(String brand, String model,int year){
        setBrand(brand);
        setModel(model);
        setYear(year);
    }
    public Coche(){
        this("Seat","A4",1998);
    }


    //Comportamientos
    @Override
    public String toString(){
        String salida = "Atributos[Marca: "+brand+", Modelo: "+model+", Año: "+year;
        return salida;
    }


    //Getter y Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= Year.now().getValue()){
            this.year = year;
        }else this.year = 2000;
    }
}
