package repository;

import entity.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfsseurRepository  extends JpaRepository<Professeur, Long> {
}
