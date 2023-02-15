package Abstraction;

public class Patrat extends FormaGeometrica {

   private double latura;

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }
    public Patrat(Double latura){
      setLatura(latura);
    }
    @Override
    Double calculArie() {
        return latura*latura;
    }
}
