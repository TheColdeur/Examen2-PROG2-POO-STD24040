package examen2;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Enseignant extends Utilisateur{
    private String specialite;
    public Enseignant(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String numerotelephone, String specialite){
        super(id, nom, prenom, dateDeNaissance, email, numerotelephone);
        this.specialite = specialite;
    }
}
