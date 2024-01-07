package ex.GCS.GCS.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;

    public Absence(Etudiant etudiant, LocalDate date, String cours) {
    }
}
