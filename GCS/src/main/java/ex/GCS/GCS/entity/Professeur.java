package ex.GCS.GCS.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
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
    private List<Cours> cours;
}
