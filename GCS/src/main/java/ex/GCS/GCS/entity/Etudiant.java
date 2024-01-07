package ex.GCS.GCS.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Etudiant")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;

    private Integer genre;

    @Column(name = "id_classe")
    private Integer idClasse;

    private String nationalite;

    private String specialite;

    @Temporal(TemporalType.DATE)
    private Date anniversaire;

    @Column(name = "jour_debut_ecole")
    private Date jourDebutEcole;

}
