package examen2;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Tuteur extends Utilisateur{
    private String lienEtudiant;

    public Tuteur(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String numeroTelephone, String lienEtudiant) {
        super(id, nom, prenom, dateDeNaissance, email, numeroTelephone);
        this.lienEtudiant = lienEtudiant;
    }
    
}
