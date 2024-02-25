package org.sid.hospitaldemo.repositoryy;

import org.sid.hospitaldemo.entities.Medecin;
import org.sid.hospitaldemo.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
