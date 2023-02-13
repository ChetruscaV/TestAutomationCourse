package Encapsulation;

public class Application {
    public static void main(String[] args) {


        ContBancar contVica=new ContBancar(22591234567L,14085.32);

        System.out.println(contVica.getNumarCont());
        contVica.setSold(18052.63);
        System.out.println(contVica.getSold());
    }
}
