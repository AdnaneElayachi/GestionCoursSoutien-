package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository  extends JpaRepository<Cours, Long> {
}
