package Inheritance;

public class Application {
    public static void main(String[] args) {
        Vehicul masinaIon=new Vehicul();
        Masina masinaVica=new Masina("Volvo");

           masinaIon.setCuloare("galbena");
           masinaIon.setNrRoti(4);
           masinaIon.afiseazaDetaliiVehicul();


          masinaVica.setNrRoti(4);
          masinaVica.setMarca("Kia");
          masinaVica.setCuloare("oranj");
          masinaVica.afiseazaDetaliiVehicul();






    }
}
