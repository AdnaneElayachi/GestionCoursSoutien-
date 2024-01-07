package ex.GCS.GCS.controlles;

import ex.GCS.GCS.entity.Cours;
import ex.GCS.GCS.entity.Division;
import ex.GCS.GCS.entity.Etudiant;  // Ajout de l'importation pour Etudiant
import ex.GCS.GCS.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/divisions")
public class DivisionController {

    private final DivisionRepository divisionRepository;

    @Autowired
    public DivisionController(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }
    @GetMapping("/byEtudiant")
    public List<Division> findAllByEtudiant(@RequestParam Long etudiantId) {
        Etudiant etudiant = new Etudiant();
        etudiant.setId(etudiantId);
        return divisionRepository.findAllByEtudiant(etudiant);
    }
}
