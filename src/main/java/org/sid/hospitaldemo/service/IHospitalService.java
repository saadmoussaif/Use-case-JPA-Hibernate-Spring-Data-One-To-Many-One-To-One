package org.sid.hospitaldemo.service;

import org.sid.hospitaldemo.entities.Consultation;
import org.sid.hospitaldemo.entities.Medecin;
import org.sid.hospitaldemo.entities.Patient;
import org.sid.hospitaldemo.entities.RendezVous;

public interface IHospitalService  {
     Patient savePatient(Patient patient);
     Medecin saveMedecin(Medecin medecin );
     RendezVous saveRDV(RendezVous  rendezVous);
     Consultation saveConsultation(Consultation  consultation);


}
