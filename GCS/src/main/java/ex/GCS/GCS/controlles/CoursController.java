package ex.GCS.GCS.controlles;

import ex.GCS.GCS.entity.Cours;
import ex.GCS.GCS.entity.Etudiant;
import ex.GCS.GCS.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Cours")
public class CoursController {

    private  EtudiantRepository etudiantRepository;

   /*blic CoursController(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }*/

}
