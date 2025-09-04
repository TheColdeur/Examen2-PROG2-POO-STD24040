package examen2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Matiere {
    private int id;
    private String label;
    private int credit;
    private Enseignant enseignant;
}
