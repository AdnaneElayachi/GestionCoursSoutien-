package ex.GCS.GCS.controllers;

import ex.GCS.GCS.entity.Utilisateur;
import ex.GCS.GCS.repository.AdministrationRepository;
import ex.GCS.GCS.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/administration") // Updated the base path
public class AdministrationController {

    private final UtilisateurRepository userRepository;

    @Autowired
    public AdministrationController(UtilisateurRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/admin") // Updated the endpoint path
    public List<Utilisateur> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Utilisateur> findById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @GetMapping("/byFonction/{fonction}")
    public List<Utilisateur> findByFonction(@PathVariable String fonction) {
        return (List<Utilisateur>) userRepository.findByFonction(fonction);
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
