package org.sid.hospitaldemo.repositoryy;

import org.sid.hospitaldemo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient ,Long> {
    Patient findByNom(String name);
}
