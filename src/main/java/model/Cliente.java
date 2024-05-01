package model;
public abstract class Cliente {
private String nome;
private int cpf;
private String telefone;
private int idade;
private int dias;

public Cliente(){
    this("", 0, "", 0, 0);
}
    public Cliente(String nome, int cpf, String telefone, int idade, int dias) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.dias = dias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", idade=" + idade + ", dias=" + dias + '}';
    }
}
