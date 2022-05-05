package com.company;

public class Persoana {
   private int id;
   private String nume;
   private String prenum;
   private int varsta ;


    public Persoana(int id, String nume, String prenum, int varsta) throws PersonException {
        this.id = id;
        setNume(nume);
        this.prenum = prenum;
        this.varsta = varsta;
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

    public void setNume(String nume) throws PersonException {
        if (nume.equals("Alex")) {

            throw new PersonException("numele este Alex");
        }
        this.nume = nume;
    }

        public String getPrenum () {
            return prenum;
        }

        public void setPrenum (String prenum){
            this.prenum = prenum;
        }

        public int getVarsta () {
            return varsta;
        }

        public void setVarsta ( int varsta){
            this.varsta = varsta;
        }
    }
