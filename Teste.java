public class Teste {
    public static void main(String[] args) {
        // Armazena diferentes personagens em uma estrutura polimorfica.
        Personagem[] personagens = {
            new Guerreiro("Arthus", 10, 85),
            new Mago("Elenara", 12, 95)
        };

        // Percorre a lista chamando os mesmos metodos de forma generica.
        for (Personagem personagem : personagens) {
            personagem.exibirStatus();
            personagem.usarHabilidadeEspecial();
            System.out.println();
        }
    }
}
