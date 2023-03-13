package topic6;

public class ContulPersoanei {

    private String numePersoana;
    private Integer id;
    private Double sumaCurenta;

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {

    this.numePersoana = numePersoana;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) throws IllegalArgumentException{
        if(id<0){
            System.out.println(" Id-ul nu poate sa fie un numar negativ");
        }
        this.id = id;
    }

    public Double getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(Double sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    public double sustragereDeBani(Double sumaSustrasa){
        if (sumaSustrasa>sumaCurenta){
            throw new RuntimeException(" Suma sustrasa nu poate sa fie mai mare decit suma curenta pe cont!");
        }
        sumaCurenta=sumaCurenta-sumaSustrasa;

        return getSumaCurenta();
    };


     public void transferCatreOPersoana(String numeBeneficiar){
         if (numeBeneficiar==null){
             throw new NullPointerException("Numele beneficiarului este obligatoriu");
         }
         System.out.println("Ati transferat o suma  de bani lui " + numeBeneficiar );
     }
}
