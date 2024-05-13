package model;
public class Ferramenta {
    private double saldoTotal;

    public Ferramenta(){
        this(0.0);     
    }
    public Ferramenta(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
}

