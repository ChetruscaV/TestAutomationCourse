package topic7;



public class Main {
    public static void main(String[] args) {


        ContulPersoanei1 contVica = new ContulPersoanei1("Victoria", 1, 10000.00);
        ContulPersoanei1 contGheorghe=new ContulPersoanei1("Gheorghe",2,17062.35);


        FileManager.scriereaInformatieiTextInFisier("topic7/bazededate/"+ contVica.getId() + "txt", contVica.getNumePersoana());
        FileManager.alipireaInformatieiLaFisier("topic7/bazededate/",contVica.getNumePersoana());
        FileManager.citireDateDinFisier("topic7/bazededate/");
    }
}
