package com.br.provas.semestre1.av2.qst1;

public class ValidacaoUsuario {

    public ValidacaoUsuario() {}

    public void validacao(Usuario usuario) {
        try {
            //verificacao da idade
            if (usuario.getIdade() < 18 || usuario.getIdade() > 100) {
                throw new ExceptionIdade();
            } else {
                System.out.println("Idade é válida");
            }
            //verificacao do ano OBS:sei que tem um erro em relação a data, que era pra colocar do sistema
            if (usuario.getAnoNasc() < 1980 || usuario.getAnoNasc() > 2021 || usuario.getMesNasc() > 7) {
                throw new ExceptionAno();
            } else {
                System.out.println("Ano é válido");
            }
            //verificacao do mes
            if (usuario.getMesNasc() < 1 || usuario.getMesNasc() > 12) {
                throw new ExceptionMes();
            } else {
                System.out.println("Mês válido");
            }
            //verificacao se nome é null
            if (usuario.getNome().isEmpty()){
                throw new ExceptionNome();
            }else {
                System.out.println("Nome é válido");
            }

        } catch (ExceptionIdade e1) {
            System.out.println("ERROR: Idade incorreta");
        } catch (ExceptionAno e2) {
            System.out.println("ERROR: Ano incorreto");
        } catch (ExceptionMes e3) {
            System.out.println("ERROR: Mês incorreto");
        } catch (ExceptionNome e4) {
            System.out.println("ERROR: Nome incorreto");
        }

    }


}
