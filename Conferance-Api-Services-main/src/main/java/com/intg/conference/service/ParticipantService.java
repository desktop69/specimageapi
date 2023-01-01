package com.intg.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intg.conference.entities.Participant;
import com.intg.conference.repos.ParticipantRepository;

@Service
public class ParticipantService implements ParticipantServiceImp {
	
	@Autowired
	ParticipantRepository participantRepository;

	@Override
	public Participant saveParticipant(Participant p) {
		// TODO Auto-generated method stub
		return participantRepository.save(p);
	}

	@Override
	public Participant updateParticipant(Participant p) {
		// TODO Auto-generated method stub
		return participantRepository.save(p);
	}

	@Override
	public void deleteParticipant(Participant p) {
		 participantRepository.delete(p);
		
	}

	@Override
	public void deleteBandById(Long id) {
		// TODO Auto-generated method stub
		participantRepository.deleteById(id);
	}

	@Override
	public List<Participant> getAllParticipant() {
		// TODO Auto-generated method stub
		return participantRepository.findAll();
	}

	@Override
	public Participant getParticipantId(Long id) {
		// TODO Auto-generated method stub
		return participantRepository.findById(id).get();
	}

}
