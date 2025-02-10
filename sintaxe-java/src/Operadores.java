public class Operadores {
    public static void main(String[] args) {

        // Sistema de Pontuação de Jogo - Treino de Operadores Java

        // variaveis
        int pontoInicial = 50; // Pontuação inicial
        int vitorias = 20; 
        int derrotas = -10; 
        int bonus = 50; // Bônus por ter mais de 200 pontos

        // Perfil dos jogadores

        String jogador1 = "Daniela";
        int idade1 = 35;
        System.out.println(jogador1 + " tem " + idade1 + " anos.");

        String jogador2 = "Taimara";
        int idade2 = 37;
        System.out.println(jogador2 + " tem " + idade2 + " anos.");


        // Inicialização: Os jogadores começam com 50 pontos.
        // Vitórias e Derrotas: Vitoria + 20 pontos | Derrota - 10 pontos.

        System.out.println("Jogador 1 (" + jogador1 + ") tem " + pontoInicial + " pontos iniciais");
        System.out.println("Jogador 2 (" + jogador2 + ") tem " + pontoInicial + " pontos iniciais");

        // Calcula pontos após as vitórias e derrotas
        int pontosJogador1 = pontoInicial + (vitorias * 8) + (derrotas * 2);
        int pontosJogador2 = pontoInicial + (vitorias * 18) + (derrotas * 4);

        // Imprimir resultados
        System.out.println("Jogador 1 (" + jogador1 + ") pontuação após jogos: " + pontosJogador1 + " pontos.");// 190
        System.out.println("Jogador 2 (" + jogador2 + ") pontuação após jogos: " + pontosJogador2 + " pontos.");// 370

        // Bônus: Se o jogador tiver mais de 200 pontos, bônus + 50

        String calculoBonus = "";

        if (pontosJogador1 >= 200 && pontosJogador2 >= 200) {
            calculoBonus = "Sim, os dois!";

        } else {
            // Caso um ou ambos não atinjam os 200 pontos
            calculoBonus = "Não, apenas um";
        }
        
        System.out.println("Ambos os jogadores ganharam bônus?: " + calculoBonus);
        

        // Soma do bônus
        if (pontosJogador1 >= 200) {
            pontosJogador1 += bonus;
            System.out.println(jogador1 + " agora tem " + pontosJogador1 + " pontos após bônus.");
        }

        if (pontosJogador2 >= 200) {
            pontosJogador2 += bonus;
            System.out.println(jogador2 + " agora tem " + pontosJogador2 + " pontos após bônus.");
        }
        
        // Definindo jogador vencedor

        if (pontosJogador1 > pontosJogador2) {
            System.out.println(jogador1 + " é a vencedora com " + pontosJogador1 + " pontos!");
        } else if (pontosJogador2 > pontosJogador1) {
            System.out.println(jogador2 + " é a vencedora com " + pontosJogador2 + " pontos!");
        } else {
            System.out.println("Empate! Ambass as jogadoras têm a mesma pontuação.");
        }


    }
}