public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        // tipos primitivos
        // estudo de classes

        String meuNome = "Daniela";
        final int IDADE = 35; //valor que não pode ser alterado
        String idadeCompleta = IDADE + "/anos";
        int anoNascimento = 1989;
        String mesNascimento = "Fevereiro";
        int diaNascimento = 23;
        double salario = 10597.89;

        // Imprimindo as variáveis
        System.out.println("Nome: " + meuNome);
        System.out.println("Idade: " + idadeCompleta);
        System.out.println("Mês: " + mesNascimento);
        System.out.println("Dia: " + diaNascimento + "de" + anoNascimento);
        System.out.println("Salario da sorte: R$ " + salario);
    }
}
