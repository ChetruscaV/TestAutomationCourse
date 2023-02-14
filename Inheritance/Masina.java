package Inheritance;

public class Masina extends Vehicul {

    private String marca;

    public Masina(String marca) {
        super();
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void afiseazaDetaliiVehicul() {
        System.out.println("Vehiculul dat este de marca " + getMarca() + " are culoare " + getCuloare() + " si " + getNrRoti() + " roti.");


    }
}