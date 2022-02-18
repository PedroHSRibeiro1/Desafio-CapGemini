package br.com.capgemini.desafios.pedro.segundo;

public class Senha {

    private static final String MSG_SENHA_INCOMPLETA = "Senha incompleta: ";
    private static final String MSG_SENHA_MINIMO = "A senha deve conter no minimo 6 caracteres.";
    private static final String MSG_SENHA_MAIUSCULA = "A senha deve conter no minimo uma letra maiuscula.";
    private static final String MSG_SENHA_MINUSCULA = "A senha deve conter no minimo uma letra minuscula.";
    private static final String MSG_SENHA_CARACTER = "A senha deve conter no minimo um caracter especial.";
    private static final String MSG_SENHA_NUMERO = "A senha deve conter no minimo um numero.";

    public void validarSenha(String senha) {
        boolean senhaValida = true;

        if (senha.length() < 6) {
            senhaValida = false;
            System.out.println(MSG_SENHA_INCOMPLETA+MSG_SENHA_MINIMO);
        }

        if (!senha.matches(".*[A-Z].*")) {
            senhaValida = false;
            System.out.println(MSG_SENHA_INCOMPLETA+MSG_SENHA_MAIUSCULA);
        }

        if (!senha.matches(".*[a-z].*")) {
            senhaValida = false;
            System.out.println(MSG_SENHA_INCOMPLETA+MSG_SENHA_MINUSCULA);
        }
        if (!senha.matches(".*[!@#$%^&()-+].*")) {
            senhaValida = false;
            System.out.println(MSG_SENHA_INCOMPLETA+MSG_SENHA_CARACTER);

        }
        if (!senha.matches(".*[0-9].*")) {
            senhaValida = false;
            System.out.println(MSG_SENHA_INCOMPLETA+MSG_SENHA_NUMERO);

        }
        if(senhaValida == true){
            System.out.println("Sua senha está ok");
        }
    }

}
