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
    private Long id;

    private String name;
    private String type;

    private Integer professeur;
}
