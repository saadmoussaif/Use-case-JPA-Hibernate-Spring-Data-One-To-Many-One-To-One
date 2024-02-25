package org.sid.hospitaldemo.repositoryy;

import org.sid.hospitaldemo.entities.Consultation;
import org.sid.hospitaldemo.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
