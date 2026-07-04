public abstract class Personagem implements Comparable<Personagem> {
    private String nome;
    private int nivel;
    private double poderBase;

    // Inicializa os atributos comuns que serao herdados pelas subclasses.
    public Personagem(String nome, int nivel, double poderBase) {
        this.nome = nome;
        this.nivel = nivel;
        this.poderBase = poderBase;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public double getPoderBase() {
        return poderBase;
    }

    // Mantem a formula de batalha centralizada em um unico lugar.
    public int calcularPoderTotal() {
        return (int) (nivel * poderBase);
    }

    // Reaproveita a exibicao dos dados compartilhados por todos os personagens.
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Poder Base: " + poderBase);
    }

    // Obriga cada subclasse a definir sua propria habilidade especial.
    public abstract void usarHabilidadeEspecial();

    // Permite ordenar personagens pelo nivel antes das batalhas.
    @Override
    public int compareTo(Personagem outro) {
        return Integer.compare(this.nivel, outro.nivel);
    }
}
