package com.intg.spectacle.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.intg.spectacle.entities.Specatle;
import com.intg.spectacle.service.SpectacleServices;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SpectacleRESTController {
	
	@Autowired
	SpectacleServices spectacleservices;
	
	
	// select *
	@RequestMapping(method = RequestMethod.GET)
	public List<Specatle> getAllSpecale() {
		return spectacleservices.getAllSpectacle();
	}
	
	// select with id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Specatle getSpectacle(@PathVariable("id") Long id) {
		return spectacleservices.getSpectacleById(id);
	}
	
	// insert *
	@RequestMapping(method = RequestMethod.POST )
	public Specatle saveSpecatle(@RequestBody Specatle spec) {
		return spectacleservices.saveSpectacle(spec);
	}
	
	// update *
	@RequestMapping(method = RequestMethod.PUT)
	public Specatle updateSpectacle(@RequestBody Specatle spec) {
		return spectacleservices.updateSpectacle(spec);
	}
	
	// Delete id*
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteSpectacle(@PathVariable("id") Long id) {
		spectacleservices.DeleteSpectacleById(id);
	}


}
