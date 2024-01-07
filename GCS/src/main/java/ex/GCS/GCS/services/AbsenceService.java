package ex.GCS.GCS.services;

import ex.GCS.GCS.entity.Absence;
import ex.GCS.GCS.entity.Etudiant;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AbsenceService {
    private List<Absence> absences;

    public AbsenceService() {
        this.absences = new ArrayList<>();
    }

    public void enregistrerAbsence(Etudiant etudiant, LocalDate date, String cours) {
        Absence absence = new Absence(etudiant, date, cours);
        absences.add(absence);
    }

    public List<Absence> getAbsences() {
        return absences;
    }
}
