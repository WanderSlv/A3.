package model;
public class FerramentaDAO extends Amigo{
private boolean atraso;
private double juros;

public FerramentaDAO(){
    this(true,0.0, "", 0, "", 0, 0);
}

    public FerramentaDAO(boolean atraso, double juros, String nome, int cpf, String telefone, int idade, int dias) {
        super(nome, cpf, telefone, idade, dias);
        this.atraso = atraso;
        this.juros = juros;
    }

    public boolean isAtraso() {
        return atraso;
    }

    public void setAtraso(boolean atraso) {
        this.atraso = atraso;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public String toString() {
        return "ClienteEmAtraso{" + "atraso=" + atraso + ", juros=" + juros + '}';
    }
    
}
