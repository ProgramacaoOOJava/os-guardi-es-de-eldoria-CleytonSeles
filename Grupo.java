import java.util.ArrayList;

public class Grupo {
    private String nome;
    private ArrayList<Personagem> membros;

    // Cada grupo gerencia sua propria lista de personagens.
    public Grupo(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Personagem> getMembros() {
        return new ArrayList<>(membros);
    }

    public void adicionarPersonagem(Personagem personagem) {
        membros.add(personagem);
    }

    // Exibe um resumo dos membros cadastrados no grupo.
    public void listarPersonagens() {
        System.out.println("Grupo: " + nome);
        for (Personagem membro : membros) {
            membro.exibirStatus();
            System.out.println("Poder Total: " + membro.calcularPoderTotal());
            System.out.println();
        }
    }

    // Compara dois personagens pela formula do desafio e mostra o vencedor.
    public void batalhar(Personagem primeiro, Personagem segundo) {
        int poderPrimeiro = primeiro.calcularPoderTotal();
        int poderSegundo = segundo.calcularPoderTotal();

        if (poderPrimeiro > poderSegundo) {
            System.out.println(
                primeiro.getClass().getSimpleName() + " " + primeiro.getNome()
                    + " venceu! Poder total: " + poderPrimeiro
            );
        } else if (poderSegundo > poderPrimeiro) {
            System.out.println(
                segundo.getClass().getSimpleName() + " " + segundo.getNome()
                    + " venceu! Poder total: " + poderSegundo
            );
        } else {
            System.out.println(
                "Empate entre " + primeiro.getNome() + " e " + segundo.getNome()
                    + "! Poder total: " + poderPrimeiro
            );
        }
    }
}
