package ex.GCS.GCS.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity


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
    @ManyToMany
    @JoinTable(
            name = "ecole_etudiant",
            joinColumns = @JoinColumn(name = "etudiant_id"),
            inverseJoinColumns = @JoinColumn(name = "ecole_id")
    )
    private List<Division> division = new ArrayList<>();

    public void setId(Long etudiantId) {
    }
}
