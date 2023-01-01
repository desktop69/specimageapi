package com.intg.conference.repos;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.intg.conference.entities.Conference;
@RepositoryRestResource(path = "con")
@CrossOrigin("http://localhost:4200/")
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
	
	
}
