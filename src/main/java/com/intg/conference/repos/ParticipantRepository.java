package com.intg.conference.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.intg.conference.entities.Participant;


@RepositoryRestResource(path = "participant")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular
public interface  ParticipantRepository extends JpaRepository<Participant, Long> {

}
