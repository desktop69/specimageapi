package com.intg.spectacle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intg.spectacle.entities.Specatle;
import com.intg.spectacle.repos.SpectacleRepository;



@Service
public class SpectacleServices  implements SpectacleServicesImp{

	@Autowired
	SpectacleRepository spectaclerepository;
	
	@Override
	public List<Specatle> getAllSpectacle() {
		// TODO Auto-generated method stub
		return spectaclerepository.findAll();
	}

	@Override
	public Specatle saveSpectacle(Specatle s) {
		// TODO Auto-generated method stub
		return spectaclerepository.save(s);
	}

	@Override
	public Specatle updateSpectacle(Specatle s) {
		// TODO Auto-generated method stub
		return spectaclerepository.save(s);
	}

	@Override
	public void DeleteSpectacleById(Long id) {
		// TODO Auto-generated method stub
		 spectaclerepository.deleteById(id);
	}

	@Override
	public Specatle getSpectacleById(Long id) {
		// TODO Auto-generated method stub
		return spectaclerepository.findById(id).get();
	}

}
