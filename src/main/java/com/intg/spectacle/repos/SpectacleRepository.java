package com.intg.spectacle.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.intg.spectacle.entities.Specatle;
@CrossOrigin("http://localhost:4200/")
public interface SpectacleRepository extends JpaRepository<Specatle, Long> {

}
