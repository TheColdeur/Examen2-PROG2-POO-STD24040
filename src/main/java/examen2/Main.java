package examen2;

import java.time.Instant;

public class Main {
    public double getExamGrade(Examen examen, Etudiant etudiant, Instant t){
        return examen.getNotes().stream()
        .filter(e -> e.getEtudiant() == etudiant)
        .map(v -> v.getHistoriqueValeur().stream()
        .filter(i -> i.getDateHeure() == t)
        ).mapToDouble(d -> ((HistoriqueValeur) d).getValeur()).sum();
    }
    
    public double getCourseGrade(Matiere matiere, Etudiant etudiant, Instant t){
        
        return 0;
    }
}
