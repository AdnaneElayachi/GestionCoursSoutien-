package GCS.GCS_GAdministation.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class EcoleDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String type;


    @ManyToMany
    @JoinTable(
            name = "ecole_etudiant",
            joinColumns = @JoinColumn(name = "ecole_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )


    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;

}
