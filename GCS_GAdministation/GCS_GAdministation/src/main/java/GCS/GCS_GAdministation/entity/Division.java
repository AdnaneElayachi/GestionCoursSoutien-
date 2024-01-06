package GCS.GCS_GAdministation.entity;

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

    @ManyToOne
    @JoinColumn(name = "ecole_id")
    private Ecole ecole;

}
