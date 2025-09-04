package examen2;

import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Examen {
    private int id;
    private String titre;
    private Matiere matiere;
    private Instant dateHeure;
    private int coefficient;
    private List<Note> notes;
}
