package GCS.GCS_Etudiant.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Professeur")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "compte")
    private String compte;

    @Column(name = "nom")
    private String nom;

    @Column(name = "temps_enseignement")
    private Date tempsEnseignement;

    @Column(name = "mot_de_passe")
    private String motDePasse;

    @Column(name = "specialite")
    private String specialite;


    @OneToMany(mappedBy = "professeur")
    private Cours cours;
}