package com.intg.spectacle.service;

import java.util.List;

import com.intg.spectacle.entities.Specatle;

public interface SpectacleServicesImp {
 List<Specatle> getAllSpectacle ();
 Specatle saveSpectacle( Specatle s) ;
 Specatle updateSpectacle ( Specatle s);
 void DeleteSpectacleById (Long id);
 Specatle getSpectacleById (Long id );
	
	
	
}
