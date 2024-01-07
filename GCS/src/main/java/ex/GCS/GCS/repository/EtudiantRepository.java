package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Cours;
import ex.GCS.GCS.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findAllByCours(Cours cours);
}
