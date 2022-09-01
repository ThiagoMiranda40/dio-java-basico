// Acrescentando um comentário como teste de commit, para testar a sincronização com o GitHub.

package AprendendoASintaxeJava;
public class MinhaClasse {
    
public static void main(String[] args) {
    String primeiroNome = "Thiago";
    String segundoNome = "Miranda";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome); 

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método:" + primeiroNome.concat(" ").concat(segundoNome);

}

}
