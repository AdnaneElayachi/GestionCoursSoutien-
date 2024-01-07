package GCS.GCS_GAdministation.controlles;

import GCS.GCS_GAdministation.repository.AdministrationRepository;
import GCS.GCS_GAdministation.repository.UserRepository;
import ex.GCS.GCS.entity.Ecole;
import ex.GCS.GCS.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/adminstration")
public class AdministrationController {
    @Autowired
    private AdministrationRepository administrationRepository;
    @Autowired
    private UserRepository userRepository;


    public AdministrationController(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.administrationRepository = administrationRepository;
    }
    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) throws Exception {
        return userRepository.findById(id);
    }
    @GetMapping("/{fonction}")
    public Optional<User> findByFonction(@PathVariable String fonction) {
        return Optional.ofNullable(userRepository.findByFonction(fonction));
    }
    @PostMapping
    public void save(@RequestBody User user) {
        userRepository.save(user);
    }
    @GetMapping("/existsByEmail/{email}")
    public boolean existsByEmail(@PathVariable String email) {
        return userRepository.existsByEmail(email);
    }


}
