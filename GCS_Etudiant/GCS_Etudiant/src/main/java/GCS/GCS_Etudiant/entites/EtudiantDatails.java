package GCS.GCS_Etudiant.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class EtudiantDatails {
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
