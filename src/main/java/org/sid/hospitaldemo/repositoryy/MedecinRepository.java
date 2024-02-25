package org.sid.hospitaldemo.repositoryy;

import org.sid.hospitaldemo.entities.Medecin;
import org.sid.hospitaldemo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin  findByNom(String name);
}
