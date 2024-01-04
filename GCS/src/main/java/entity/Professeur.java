package entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String compte;

    private String nom;

    private Date tempsEnseignement;

    private String motDePasse;

    private String sel;

    @ManyToOne
    @JoinColumn(name = "ecole_id")
    private Ecole ecole;

    @OneToOne(mappedBy = "professeur")
    private Cours cours;

}
