package entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity

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
