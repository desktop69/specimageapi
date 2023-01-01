package com.intg.conference.service;

import java.util.List;

import com.intg.conference.entities.Participant;

public interface  ParticipantServiceImp {
	Participant saveParticipant(Participant p);
	Participant updateParticipant(Participant p);
	Participant getParticipantId(Long id);
	void deleteParticipant(Participant p);
	void deleteBandById(Long id);
	List<Participant> getAllParticipant();
	
}
