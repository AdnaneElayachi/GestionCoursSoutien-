package ex.GCS.GCS.services;

import ex.GCS.GCS.entity.Utilisateur;
import ex.GCS.GCS.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServicesImp implements UtilisateurServices {

    private final UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurServicesImp(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur user(long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    @Override
    public Utilisateur register(Utilisateur user) {

        return utilisateurRepository.save(user);
    }

    @Override
    public Utilisateur update(Utilisateur user) {

        return utilisateurRepository.save(user);
    }

    @Override
    public void delete(long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public Utilisateur changePassword(long userId, String password) {

        Utilisateur utilisateur = utilisateurRepository.findById(userId).orElse(null);
        if (utilisateur != null) {
            utilisateur.setMotDePasse(password);
            return utilisateurRepository.save(utilisateur);
        }
        return null;
    }
}
