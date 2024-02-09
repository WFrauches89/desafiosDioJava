package com.esttudos.dio.desafio3;

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    String validando = null;
    public boolean validarSenha(int confirmacaoSenha) {
        if(confirmacaoSenha == this.senha){
           validando = "Cofre aberto!";
           return true;
        } else {
            validando = "Senha incorreta!";
            return false;
        }
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();

        System.out.println("Senha: " + validando);
    }



}
