package ex.GCS.GCS.services;

import ex.GCS.GCS.entity.Utilisateur;

public interface UtilisateurServices {

    Utilisateur user(long id);

    Utilisateur register(Utilisateur user);

    Utilisateur update(Utilisateur user);

    void delete(long id);

    Utilisateur changePassword(long userId, String password);
}
