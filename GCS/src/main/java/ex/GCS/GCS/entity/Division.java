package ex.GCS.GCS.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
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

    @ManyToMany
    @JoinTable(
            name = "etudiant_division",
            joinColumns = @JoinColumn(name = "division_id"),  // Corrected: "division_id" should be in joinColumns
            inverseJoinColumns = @JoinColumn(name = "etudiant_id"))  // Corrected: "etudiant_id" should be in inverseJoinColumns
    private List<Etudiant> etudiants = new ArrayList<>();

    @OneToMany(mappedBy = "division", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Cours> cours = new ArrayList<>();
}
