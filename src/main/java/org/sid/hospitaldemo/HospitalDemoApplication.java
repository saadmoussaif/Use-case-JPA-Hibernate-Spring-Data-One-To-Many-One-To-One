package org.sid.hospitaldemo;

import org.sid.hospitaldemo.entities.*;
import org.sid.hospitaldemo.repositoryy.ConsultationRepository;
import org.sid.hospitaldemo.repositoryy.MedecinRepository;
import org.sid.hospitaldemo.repositoryy.PatientRepository;
import org.sid.hospitaldemo.repositoryy.RendezVousRepository;
import org.sid.hospitaldemo.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.logging.StreamHandler;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalDemoApplication.class, args);
    }
    @Bean
CommandLineRunner start(IHospitalService hospitalService,
                        PatientRepository  patientRepository,
                        RendezVousRepository rendezVousRepository,
                        ConsultationRepository consultationRepository,
                        MedecinRepository medecinRepository){
        return args -> {
            Stream.of("mohamed","hassan","Saad")
                    .forEach(name->{
                        Patient patient=new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(false);
                       hospitalService.savePatient(patient);

                    });

            Stream.of("Mounir","Anouar","Aymane")
                    .forEach(name->{
                        Medecin medecin=new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(Math.random()>0.4?"saad@gmail.com":"mouad@gmail.com");
                        medecin.setSpecialiste(Math.random()>0.5?"Cadiologue":"Dentiste");
                        hospitalService.saveMedecin(medecin);
                    });
            Patient  patient=patientRepository.findById(1L).orElse(null);
            Patient patient1=patientRepository.findByNom("mohamed");

            Medecin medecin=medecinRepository.findByNom("Yassmine");

            RendezVous rendezVous=new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            rendezVousRepository.save(rendezVous);

            Consultation consultation=new Consultation();
            consultation.setId(null);
            consultation.setDateConsultation(new Date());
            consultation.setRapport("rapport de consultaton");
            consultation.setRendezVous(rendezVous);
           hospitalService.saveConsultation(consultation);


        };
    }
}
