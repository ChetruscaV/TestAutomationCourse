package topic6;

public class Main {
    public static void main(String[] args) {
        ContulPersoanei contCurent = new ContulPersoanei();
            contCurent.setNumePersoana("Vica");
            contCurent.setSumaCurenta(15235.63);
            contCurent.setId(123);

            System.out.println("La moment clientul " + contCurent.getNumePersoana() + " cu id " + contCurent.getId() + " detine  la cont suma de  " + contCurent.getSumaCurenta());

            try {contCurent.sustragereDeBani(17000.00);}
            catch (RuntimeException e1){
                System.out.println("Suma introdusa este mai mare decit suma din contul curent");
            }
            System.out.println("Suma curenta dupa sustragere  este de " + contCurent.getSumaCurenta());


            try{contCurent.transferCatreOPersoana(null);}
            catch(NullPointerException e2){
                System.out.println("Numele beneficiarului nu poate fi null");
            }

            contCurent.setId(-135);

        }
    }

