package com.company;

public class Animal {

    private int id;
    private String nume;
    private String rasa;

    public Animal(int id, String nume, String rasa) throws AnimalException{
        this.id = id;
        setNume(nume);
        this.rasa = rasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) throws AnimalException{
        if (nume.equals("Rexi")) {

            throw new AnimalException("numele cainelui este Rexi");
        }
        this.nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}
