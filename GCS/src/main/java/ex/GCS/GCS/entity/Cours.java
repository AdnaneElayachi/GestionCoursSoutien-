package ex.GCS.GCS.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity

@Table(name = "Cours")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom_cours")
    private String nomCours;

    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
}
