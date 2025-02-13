public class ResultadoEscolar {
    public static void main(String[] args) {

        //opção1
        int nota = 7;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) //ou true ou false
		System.out.println("Recuperação");

        else
            System.out.println("Reprovado");

        //opção2
        int notaFinal = 7;
		String resultado = notaFinal >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        //opção3
        int notaInicial = 7;
		String resultadoFinal = notaInicial >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultadoFinal);



    }
}
