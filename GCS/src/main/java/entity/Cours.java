package entity;

import jakarta.persistence.*;

@Entity
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
