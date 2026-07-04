public class Teste {
    public static void main(String[] args) {
        // Cria personagens com nivel e poder base para o calculo de batalha.
        Personagem arthus = new Guerreiro("Arthus", 10, 12.0, 85);
        Personagem borin = new Guerreiro("Borin", 8, 11.0, 78);
        Personagem elenara = new Mago("Elenara", 12, 25.0, 95);
        Personagem lyra = new Mago("Lyra", 9, 14.0, 88);

        // Organiza os personagens em dois grupos distintos.
        Grupo guardioesDoNorte = new Grupo("Guardioes do Norte");
        guardioesDoNorte.adicionarPersonagem(arthus);
        guardioesDoNorte.adicionarPersonagem(lyra);

        Grupo ordemArcana = new Grupo("Ordem Arcana");
        ordemArcana.adicionarPersonagem(elenara);
        ordemArcana.adicionarPersonagem(borin);

        // Exibe a composicao dos grupos e as habilidades especiais.
        guardioesDoNorte.listarPersonagens();
        ordemArcana.listarPersonagens();

        System.out.println("Habilidades especiais:");
        Personagem[] personagens = {arthus, borin, elenara, lyra};
        for (Personagem personagem : personagens) {
            personagem.usarHabilidadeEspecial();
        }

        System.out.println();
        System.out.println("Batalha direta:");
        guardioesDoNorte.batalhar(arthus, elenara);

        System.out.println();
        Arena arena = new Arena();
        arena.batalharGrupos(guardioesDoNorte, ordemArcana);
    }
}

