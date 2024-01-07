package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfsseurRepository  extends JpaRepository<Professeur, Long> {
}
