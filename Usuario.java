package com.br.provas.semestre1.av2.qst1;

public class Usuario {

    private int idade;
    private int anoNasc;
    private int mesNasc;
    private String nome;

    public Usuario (){}

    public Usuario(int idade, int anoNasc, int mesNasc, String nome) {
        this.idade = idade;
        this.anoNasc = anoNasc;
        this.mesNasc = mesNasc;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idade=" + idade +
                ", anoNasc=" + anoNasc +
                ", mesNasc=" + mesNasc +
                ", nome='" + nome + '\'' +
                '}';
    }
}
