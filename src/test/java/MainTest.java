
import org.junit.jupiter.api.BeforeEach;

import examen2.Etudiant;
import examen2.Examen;
import examen2.Note;

public class MainTest {
    private Etudiant etudiant;
    private Examen examen;
    private Note note;
    
    @BeforeEach
    void setup(){
        Note note1 = new Note(etudiant, 0, null);
    }
}
