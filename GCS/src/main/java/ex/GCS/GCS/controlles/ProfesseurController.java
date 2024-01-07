package ex.GCS.GCS.controllers;

import ex.GCS.GCS.entity.Division;
import ex.GCS.GCS.entity.Professeur;
import ex.GCS.GCS.repository.ProfesseurRepository;
import ex.GCS.GCS.services.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professeurs")
public class ProfesseurController {

    private  ProfesseurService professeurService;
    private ProfesseurRepository professeurRepository;


    @Autowired
    public ProfesseurController(ProfesseurService professeurService) {
        this.professeurService = professeurService;
    }

    @GetMapping
    public List<Professeur> getAllProfesseurs() {
        return professeurService.getAllProfesseurs();
    }

    @GetMapping("/{id}")
    public Professeur getProfesseurById(@PathVariable Integer id) {
        return professeurService.getProfesseurById(id);
    }

    @GetMapping("/findAllByDivision")
    public List<Professeur> findAllBySchool(@RequestBody Division division) {
        return professeurRepository.findAllByDivision(division);
    }

}
