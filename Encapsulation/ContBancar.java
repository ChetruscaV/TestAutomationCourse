package Encapsulation;

public class ContBancar {

    private Long numarCont;
    private Double sold;

    public ContBancar(Long numarCont,Double sold){
        this.numarCont=numarCont;
        this.sold=sold;
    }
    public Long getNumarCont(){
        return numarCont;
    }
    public void setNumarCont(Long numarCont){
        this.numarCont=numarCont;
    }
    public Double getSold(){
        return sold;
    }
    public void setSold(Double sold){
        this.sold=sold;
    }
}

