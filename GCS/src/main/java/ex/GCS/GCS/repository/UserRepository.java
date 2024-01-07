package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByUsername(String nom);

    User findOneByEmail(String nom);

    boolean existsByEmail(String email);

    boolean existsByUsername(String nom);
}
