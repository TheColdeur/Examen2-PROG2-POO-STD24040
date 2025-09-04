package examen2;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Etudiant extends Utilisateur{
    private String groupe;
    private Tuteur tuteur;
    private List<Note> notes;
    public Etudiant(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String numeroTelephone, String groupe, Tuteur tuteur) {
        super(id, nom, prenom, dateDeNaissance, email, numeroTelephone, List<Note> notes);
        this.groupe = groupe;
        this.tuteur = tuteur;
        this.notes = notes;
    }
}
