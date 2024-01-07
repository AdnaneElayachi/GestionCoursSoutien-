package GCS.GCS_Etudiant.entites;

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



    @ManyToMany(mappedBy = "divisions", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Etudiant> etudiants = new ArrayList<>();

    @OneToMany(mappedBy = "division", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Cours> cours = new ArrayList<>();


}
