package GCS.GCS_GAdministation.repository;

import ex.GCS.GCS.entity.Ecole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcoleRepository extends JpaRepository<Ecole, Long> {
}
