package ex.GCS.GCS.controlles;

import ex.GCS.GCS.entity.Paiements;
import ex.GCS.GCS.services.PaimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaiementsController {
    private  PaimentService paimentService;

    @Autowired
    public PaiementsController(PaimentService paimentService) {
        this.paimentService = paimentService;
    }

    @PostMapping("/process")
    public Paiements processPaiements(@RequestBody Double montant) {
        return paimentService.processPayment(montant);
    }

    @GetMapping("/all")
    public List<Paiements> getAllPaiements() {
        return paimentService.getAllPayments();
    }

}
