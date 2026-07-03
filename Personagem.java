public abstract class Personagem {
    private String nome;
    private int nivel;

    // Inicializa os atributos comuns que serao herdados pelas subclasses.
    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    // Reaproveita a exibicao dos dados compartilhados por todos os personagens.
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
    }

    // Obriga cada subclasse a definir sua propria habilidade especial.
    public abstract void usarHabilidadeEspecial();
}
