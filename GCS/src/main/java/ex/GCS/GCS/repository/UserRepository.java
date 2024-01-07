package ex.GCS.GCS.repository;

import ex.GCS.GCS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByUsername(String username);

    User findOneByEmail(String email);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
}
