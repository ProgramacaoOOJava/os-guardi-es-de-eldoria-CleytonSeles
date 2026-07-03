public class Guerreiro extends Personagem {
    private int forca;

    // Inicializa os dados herdados e o atributo especifico do guerreiro.
    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    // Complementa o status comum com os dados exclusivos do guerreiro.
    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Classe: Guerreiro");
        System.out.println("Forca: " + forca);
    }

    // Define a habilidade especial propria desta subclasse.
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + getNome() + " ataca com Espada Flamejante!");
    }
}
