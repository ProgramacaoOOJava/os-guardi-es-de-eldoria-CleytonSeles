import java.util.ArrayList;
import java.util.Collections;

public class Arena {
    // Organiza batalhas em pares entre os membros dos dois grupos.
    public void batalharGrupos(Grupo grupoUm, Grupo grupoDois) {
        ArrayList<Personagem> membrosGrupoUm = grupoUm.getMembros();
        ArrayList<Personagem> membrosGrupoDois = grupoDois.getMembros();

        Collections.sort(membrosGrupoUm);
        Collections.sort(membrosGrupoDois);

        int quantidadeDeBatalhas = Math.min(membrosGrupoUm.size(), membrosGrupoDois.size());

        System.out.println("Arena: " + grupoUm.getNome() + " x " + grupoDois.getNome());
        for (int indice = 0; indice < quantidadeDeBatalhas; indice++) {
            Personagem primeiro = membrosGrupoUm.get(indice);
            Personagem segundo = membrosGrupoDois.get(indice);

            System.out.println("Batalha " + (indice + 1) + ":");
            grupoUm.batalhar(primeiro, segundo);
            System.out.println();
        }
    }
}

