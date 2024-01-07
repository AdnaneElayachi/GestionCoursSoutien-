package GCS.GCS_GAdministation.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "AdministrationDetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AdministrationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "ecole_id")
    private  Ecole ecole;
}
