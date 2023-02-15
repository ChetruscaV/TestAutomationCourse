package Abstraction;

public class Triunghi extends FormaGeometrica {

    private Double baza;
    private Double inaltime;

    public Double getBaza(Double baza) {
        return baza;
    }

    public void setBaza(Double baza) {
        this.baza = baza;
    }

    public Double getInaltime(Double inaltime) {
        return this.inaltime;
    }

    public void setInaltime(Double inaltime) {
        this.inaltime = inaltime;
    }
    public Triunghi (Double baza,Double inaltime){
        setBaza(baza);
        setInaltime(inaltime);
    }
    @Override
    Double calculArie() {
        return  (baza*inaltime)/2;
    }
}
