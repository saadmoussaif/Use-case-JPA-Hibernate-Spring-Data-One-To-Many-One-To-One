package org.sid.hospitaldemo.service;

import jakarta.transaction.Transactional;
import org.sid.hospitaldemo.entities.Consultation;
import org.sid.hospitaldemo.entities.Medecin;
import org.sid.hospitaldemo.entities.Patient;
import org.sid.hospitaldemo.entities.RendezVous;
import org.sid.hospitaldemo.repositoryy.ConsultationRepository;
import org.sid.hospitaldemo.repositoryy.MedecinRepository;
import org.sid.hospitaldemo.repositoryy.PatientRepository;
import org.sid.hospitaldemo.repositoryy.RendezVousRepository;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private ConsultationRepository  consultationRepository;
    private RendezVousRepository  rendezVousRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, ConsultationRepository consultationRepository, RendezVousRepository rendezVousRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezVousRepository = rendezVousRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
