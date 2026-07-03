public class Mago extends Personagem {
    private int inteligencia;

    // Inicializa os dados herdados e o atributo especifico do mago.
    public Mago(String nome, int nivel, int inteligencia) {
        super(nome, nivel);
        this.inteligencia = inteligencia;
    }

    // Complementa o status comum com os dados exclusivos do mago.
    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Classe: Mago");
        System.out.println("Inteligencia: " + inteligencia);
    }

    // Define a habilidade especial propria desta subclasse.
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + getNome() + " lanca Bola de Fogo!");
    }
}
