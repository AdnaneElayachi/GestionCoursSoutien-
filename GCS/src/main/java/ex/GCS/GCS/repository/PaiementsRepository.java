package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Etudiant;
import ex.GCS.GCS.entity.Paiements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementsRepository  extends JpaRepository<Paiements, Long> {
}
