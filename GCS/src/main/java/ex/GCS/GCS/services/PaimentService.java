package ex.GCS.GCS.services;

import ex.GCS.GCS.entity.Paiements;
import ex.GCS.GCS.repository.PaiementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaimentService {

   private  PaiementsRepository paiementsRepository;
    @Autowired
    public PaimentService(PaiementsRepository paiementsRepository) {
        this.paiementsRepository = paiementsRepository;
    }

    public Paiements processPayment(Double montant) {

        Paiements paiements = new Paiements();
        paiements.setMontant(montant);
        return paiementsRepository.save(paiements);
    }

    public List<Paiements> getAllPayments() {
        return paiementsRepository.findAll();
    }

}
