package com.company;

public class Main {

    public static void main(String[] args) {


        try {
            Masina masina=new Masina(1,"Dacia","model",1292);
            Persoana persoana=new Persoana(2,"Alex","Ciorba",20);
            Animal animal=new Animal(1,"Rexi","ciobanesc");
            String a = null;
            a.toString();
            int x = 3 / 0;
            int b=Integer.parseInt("sadas");
            String[] d={"a","b","c"};
            for(int i=0;i<d.length;i++){
                System.out.println(d[i]);
            }





        } catch (ArithmeticException e) {


            e.printStackTrace();

        }catch (NullPointerException e){


            e.printStackTrace();
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (CarException carException){
            carException.printStackTrace();
        }catch (PersonException personException){
            personException.printStackTrace();
        }catch (AnimalException animalException){
            animalException.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("asdsadasdsa");

    }


}
