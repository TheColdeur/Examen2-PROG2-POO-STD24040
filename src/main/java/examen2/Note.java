package examen2;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Note {
    private Etudiant etudiant;
    private double valeurInitiale;
    private List<HistoriqueValeur> historiqueValeur;
}
