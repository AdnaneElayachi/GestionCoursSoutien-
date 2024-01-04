package repository;

import entity.Administration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdministrationRepository extends JpaRepository<Administration, Long> {

    Optional<Administration> findByUsername(String username);

    Boolean existsByUsername(String nom);

    Boolean existsByEmail(String email);

    @Query("SELECT a.id FROM Administration a WHERE a.nom=:nom")
    long getIdByUsername(@Param("nom") String nom);

}
