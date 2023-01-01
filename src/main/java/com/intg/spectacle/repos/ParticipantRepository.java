package com.intg.spectacle.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.intg.spectacle.entities.Participant;


@RepositoryRestResource(path = "participant")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular
public interface  ParticipantRepository extends JpaRepository<Participant, Long> {

}
