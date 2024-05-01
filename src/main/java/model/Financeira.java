package model;
public class Financeira {
    private double saldoTotal;

    public Financeira(){
        this(0.0);     
    }
    public Financeira(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
    
}

