package GCS.GCS_GAdministation.repository;

import ex.GCS.GCS.entity.Division;
import ex.GCS.GCS.entity.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Long> {

    List<Division> trouverToutesParIdEcoleEstNul();
    List<Division> trouverToutesParIdEcole(long idEcole);
    List<Division> trouverToutesParEcole(Ecole ecole);
}
