package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Cours;
import ex.GCS.GCS.entity.Division;
import ex.GCS.GCS.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Long> {

    @Query("SELECT d FROM Division d WHERE :etudiant MEMBER OF d.etudiants")
    List<Division> findAllByEtudiant(Etudiant etudiant);


}
