package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Division;
import ex.GCS.GCS.entity.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {

    List<Professeur> findAllByDivision(Division division);
}
