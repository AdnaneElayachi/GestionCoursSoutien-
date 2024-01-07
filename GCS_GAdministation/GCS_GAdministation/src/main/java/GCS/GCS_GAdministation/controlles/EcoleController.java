package GCS.GCS_GAdministation.controlles;

import GCS.GCS_GAdministation.repository.EcoleRepository;
import ex.GCS.GCS.entity.Ecole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/ecole")
public class EcoleController {
    @Autowired
    private EcoleRepository ecoleRepository;

    @GetMapping
    public List<Ecole> findAll() {
        return ecoleRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ecole> findById(@PathVariable Long id) throws Exception {
        return ecoleRepository.findById(id);
    }
    @PostMapping
    public void save(@RequestBody Ecole ecole) {
        ecoleRepository.save(ecole);
    }
}
