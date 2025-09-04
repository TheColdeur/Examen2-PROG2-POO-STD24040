package examen2;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String email;
    private String numeroTelephone;
}
