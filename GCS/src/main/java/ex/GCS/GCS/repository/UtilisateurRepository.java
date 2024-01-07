package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findOneByUsername(String nom);

    Utilisateur findOneByEmail(String nom);
    Utilisateur findByFonction(String fonction);  // Correction ici

    boolean existsByEmail(String email);

    boolean existsByUsername(String nom);

}
