package com.br.provas.semestre1.av2.qst1;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(-1,2000,11,"João");
        Usuario usuario2 = new Usuario(17,2004,1,"Paulo");
        Usuario usuario3 = new Usuario(101,1920,5,"Fábio");
        Usuario usuario4 = new Usuario(42,1979,2,"Aline");
        Usuario usuario5 = new Usuario(20,2022,11,"Norberto");
        Usuario usuario6 = new Usuario(21,2000,0,"José");
        Usuario usuario7 = new Usuario(22,1999,13,"Maria");
        Usuario usuario8 = new Usuario(30,1991,7,"");
        Usuario usuario9 = new Usuario(35,1986,3,"Marcelo");

        ValidacaoUsuario verificacao = new ValidacaoUsuario();

        System.out.println("Teste com idade negativa");
        System.out.println(usuario1);
        verificacao.validacao(usuario1);
        System.out.println("");
        System.out.println("Teste com idade menor que 18");
        System.out.println(usuario2);
        verificacao.validacao(usuario2);
        System.out.println("");
        System.out.println("Teste com idade maior que 100");
        System.out.println(usuario3);
        verificacao.validacao(usuario3);
        System.out.println("");
        System.out.println("Teste com ano de nascimento menor que 1980");
        System.out.println(usuario4);
        verificacao.validacao(usuario4);
        System.out.println("");
        System.out.println("Teste com ano de nascimento acima do ano atual");
        System.out.println(usuario5);
        verificacao.validacao(usuario5);
        System.out.println("");
        System.out.println("Teste com mês menor que o mês 1 (Janeiro)");
        System.out.println(usuario6);
        verificacao.validacao(usuario6);
        System.out.println("");
        System.out.println("Teste com mês maior que o mês 12 (Dezembro)");
        System.out.println(usuario7);
        verificacao.validacao(usuario7);
        System.out.println("");
        System.out.println("Teste com nome vazio");
        System.out.println(usuario8);
        verificacao.validacao(usuario8);
        System.out.println("");
        System.out.println("Teste Perfeito");
        System.out.println(usuario9);
        verificacao.validacao(usuario9);
    }
}
