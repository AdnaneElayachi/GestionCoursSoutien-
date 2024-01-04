package entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ecole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String type;

    @OneToMany(mappedBy = "ecole", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Division> divisions = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "ecole_etudiant",
            joinColumns = @JoinColumn(name = "ecole_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )
    private List<Etudiant> etudiants = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;

    @OneToMany(mappedBy = "ecole")
    private List<Cours> cours = new ArrayList<>();




}
