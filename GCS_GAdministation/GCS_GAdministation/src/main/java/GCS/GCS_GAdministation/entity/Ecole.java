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
    private String name;
    private String type;
    private List<String> divisions = new ArrayList<>();
    private Integer professeur;






}
