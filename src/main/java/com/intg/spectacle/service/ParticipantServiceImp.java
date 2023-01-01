package com.intg.spectacle.service;

import java.util.List;

import com.intg.spectacle.entities.Participant;

public interface  ParticipantServiceImp {
	Participant saveParticipant(Participant p);
	Participant updateParticipant(Participant p);
	Participant getParticipantId(Long id);
	void deleteParticipant(Participant p);
	void deleteBandById(Long id);
	List<Participant> getAllParticipant();
	
}
