package repository;

import entity.Cours;
import entity.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository  extends JpaRepository<Cours, Long> {
}
