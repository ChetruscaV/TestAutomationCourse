package topic4;

public class ExecuteMethods {
    public static void main(String[] args) {
        Methods.sum(4,8);
        Methods.sum(5);


        Persoana cetateanMoldova=new Persoana("Vica",10);
        Persoana cetateanRomania=new Persoana("Elena",34);
        Persoana cetateanItalia=new Persoana("Erika",65);
        Persoana cetateanCanada=new Persoana("Jane",-139);

        cetateanMoldova.categoriaDeVirsta();
        cetateanRomania.categoriaDeVirsta();
        cetateanItalia.categoriaDeVirsta();
        cetateanCanada.categoriaDeVirsta();


    }
}
