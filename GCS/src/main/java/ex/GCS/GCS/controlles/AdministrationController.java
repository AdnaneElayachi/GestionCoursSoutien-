package ex.GCS.GCS.controlles;

import ex.GCS.GCS.entity.Utilisateur;
import ex.GCS.GCS.repository.AdministrationRepository;
import ex.GCS.GCS.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/administration")
public class AdministrationController {

    private final AdministrationRepository administrationRepository;
    private final UtilisateurRepository userRepository;

    @Autowired
    public AdministrationController(AdministrationRepository administrationRepository, UtilisateurRepository userRepository) {
        this.administrationRepository = administrationRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/Admin")
    public List<Utilisateur> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Utilisateur> findById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @GetMapping("/byFonction/{fonction}")
    public Optional<Utilisateur> findByFonction(@PathVariable String fonction) {
        return Optional.ofNullable(userRepository.findByFonction(fonction));
    }

    @PostMapping
    public void save(@RequestBody Utilisateur user) {
        userRepository.save(user);
    }

    @GetMapping("/existsByEmail/{email}")
    public boolean existsByEmail(@PathVariable String email) {
        return userRepository.existsByEmail(email);
    }
}