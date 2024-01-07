package ex.GCS.GCS.controlles;
import ex.GCS.GCS.services.AbsenceService;
import ex.GCS.GCS.entity.Division;
import ex.GCS.GCS.entity.Etudiant;
import ex.GCS.GCS.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;@RestController
@RequestMapping("/api/Etudiants")
public class EtudiantControllers {

    private final EtudiantRepository etudiantRepository;
    private final AbsenceService absenceService;

    @Autowired
    public EtudiantControllers(EtudiantRepository etudiantRepository, AbsenceService absenceService) {
        this.etudiantRepository = etudiantRepository;
        this.absenceService = absenceService;
    }

    @PostMapping("/Etu")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @GetMapping
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @GetMapping("/byDivision/{division}")
    public List<Etudiant> findAllByDivision(@PathVariable Division division) {
        return etudiantRepository.findAllByDivision(division);
    }

    @PostMapping("/enregistrerAbsence")
    public void enregistrerAbsence(@RequestBody Etudiant etudiant, @RequestParam LocalDate date, @RequestParam String cours) {
        absenceService.enregistrerAbsence(etudiant, date, cours);
    }
}

