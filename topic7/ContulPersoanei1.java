package topic7;

public class ContulPersoanei1 {

    private String numePersoana;
    private Integer id;
    private Double sumaCurenta;



    public ContulPersoanei1(String numePersoana, Integer id, Double sumaCurenta){
                this.id=id;
                this.sumaCurenta=sumaCurenta;
                this.numePersoana=numePersoana;

    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(Double sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }
}
