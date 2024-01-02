package entity;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ecole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String type;

    @OneToMany(mappedBy = "ecole", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Division> divisions = new ArrayList<>();

    @ManyToMany(mappedBy = "ecoles")
    private List<Etudiant> etudiants;
    @ManyToOne
    @JoinColumn(name = "ecole_id")
    private Ecole ecole;

}
