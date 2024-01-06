package GCS.GCS_GAdministation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity

@Table(name = "Ecole")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
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


    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Professeur professeur;





}
