package ex.GCS.GCS.services;

import ex.GCS.GCS.entity.Professeur;
import ex.GCS.GCS.repository.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurService {

    private final ProfesseurRepository professeurRepository;

    @Autowired
    public ProfesseurService(ProfesseurRepository professeurRepository) {
        this.professeurRepository = professeurRepository;
    }

    public List<Professeur> getAllProfesseurs() {
        return professeurRepository.findAll();
    }

    public Professeur getProfesseurById(Integer id) {
        return professeurRepository.findById(Long.valueOf(id)).orElse(null);
    }

}
