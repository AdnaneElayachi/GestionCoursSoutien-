package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Division;
import ex.GCS.GCS.entity.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
    @Query("SELECT p FROM Professeur p WHERE p.specialite = :specialite")
    List<Professeur> findAllBySpecialite(String specialite);

}
