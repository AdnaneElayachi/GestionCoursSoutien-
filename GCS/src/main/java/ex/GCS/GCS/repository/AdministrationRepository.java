package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Administration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrationRepository extends JpaRepository<Administration, Long> {


}
