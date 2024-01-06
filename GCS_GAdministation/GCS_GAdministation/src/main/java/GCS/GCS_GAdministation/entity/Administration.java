package GCS.GCS_GAdministation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity

@Table(name = "Administration")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Administration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @OneToOne
    @JoinColumn(name = "ecole_id")
    private Ecole ecole;
    @OneToMany
    private List<User> userAdminstartion;




}