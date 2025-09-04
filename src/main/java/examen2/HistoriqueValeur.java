package examen2;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HistoriqueValeur {
    private double valeur;
    private String motif;
    private Instant dateHeure;
}
