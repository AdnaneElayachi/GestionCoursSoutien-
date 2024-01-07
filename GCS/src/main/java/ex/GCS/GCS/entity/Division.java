package ex.GCS.GCS.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity

@Table(name = "Division")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nom;


    private String description;

    @ManyToOne
    @JoinColumn(name = "ecole_id")
    private Ecole ecole;

    @ManyToMany(mappedBy = "divisions", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Etudiant> etudiants = new ArrayList<>();

    @OneToMany(mappedBy = "division", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Cours> cours = new ArrayList<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Cours> getCours() {
        return cours;
    }

    public void setCours(List<Cours> cours) {
        this.cours = cours;
    }

    public Ecole getEcole() {
        return ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
