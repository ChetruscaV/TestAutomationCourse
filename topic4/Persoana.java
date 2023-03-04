package topic4;

public class Persoana {

    String nume;
    int virsta;

    public Persoana(String nume,int virsta){
        this.nume=nume;
        this.virsta=virsta;
    }
    public void categoriaDeVirsta(){
        if (virsta<14 && virsta>0){
            System.out.println("Aceasta persoana este copil");
        } else if (virsta>=14 && virsta<18){
            System.out.println("Aceasta persoana este adolescent");
        }
        else if (virsta>=18 && virsta<60){
            System.out.println("Aceasta persoana este matur");
        }
        else if (virsta>=60){
            System.out.println("Aceasta persoana este virstnica");
        }
        else {
            System.out.println("Nu este corect introdusa virsta");
        }
    }
}
