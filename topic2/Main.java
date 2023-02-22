package topic2;

public class Main {
    public static void main(String[] args) {
   Persona omulet=new Persona();

   omulet.nume="Fabian";
   omulet.prenume="Manole";
   omulet.gen= 'M';


   omulet.setVirsta(10);
   omulet.setGreutate(68);

   System.out.println("Domnul " + omulet.nume +" " +  omulet.prenume + " are virsta de " +  omulet.getVirsta() + " ani, si greutatea de "+  omulet.getGreutate() + " kg.");



    }
}
