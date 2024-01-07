package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Cours;
import ex.GCS.GCS.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {
    List<Cours> findAllByCours(Etudiant etudiant);
}
