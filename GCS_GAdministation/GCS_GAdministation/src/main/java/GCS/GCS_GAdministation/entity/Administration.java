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

    private Integer ecole;



}