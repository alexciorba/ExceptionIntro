package com.company;

public class Masina {

    private int id;
    private String marca;
    private String model;
    private int an;

    public Masina(int id, String marca, String model, int an) throws CarException{
        this.id = id;

        setMarca(marca);
        this.model = model;
        this.an = an;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca)throws CarException {

        if(marca.equals("Dacia")){

            throw   new CarException("brand .....");
        }
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }
}
