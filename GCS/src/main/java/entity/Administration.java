package entity;

import jakarta.persistence.*;

@Entity
public class Administration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nom;
    private String prenom;
    private String fonction;
    private String email;

    @OneToOne
    @JoinColumn(name = "ecole_id")
    private Ecole ecole;



}