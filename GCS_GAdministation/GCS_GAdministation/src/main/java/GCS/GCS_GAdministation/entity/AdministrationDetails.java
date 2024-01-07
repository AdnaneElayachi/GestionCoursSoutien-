package GCS.GCS_GAdministation.entity;

import ex.GCS.GCS.entity.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    @OneToMany
    private List<User> userAdminstartion;
}
