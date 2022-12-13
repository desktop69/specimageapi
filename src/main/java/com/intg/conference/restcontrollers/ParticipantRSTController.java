package com.intg.conference.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.intg.conference.Emailservice.EmailSenderService;
import com.intg.conference.entities.Participant;
import com.intg.conference.service.ParticipantService;


@RestController
@RequestMapping("/api/part")
@CrossOrigin
public class ParticipantRSTController {
	
	@Autowired
	ParticipantService participantService;
	@Autowired
	private EmailSenderService senderservices;
	
	// select *
		@RequestMapping(method = RequestMethod.GET)
		public List<Participant> getAllParticipant() {
			return participantService.getAllParticipant();
		}
		
		// select with id
		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public Participant getParticipant(@PathVariable("id") Long id) {
			return participantService.getParticipantId(id);
		}
		// insert *
		@RequestMapping(method = RequestMethod.POST)
		public Participant saveParticipant(@RequestBody Participant part) {
			this.sendMail(part.getEmail());
			return participantService.saveParticipant(part);
		}
		
		// update *
		@RequestMapping(method = RequestMethod.PUT)
		public Participant updatePays(@RequestBody Participant part) {
			return participantService.updateParticipant(part);
		}
		
		// Delete id*
		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
		public void deleteParticipant(@PathVariable("id") Long id) {
			participantService.deleteBandById(id);
		}
		
		
		public void sendMail(String mailTarget) {
			senderservices.sendEmail(mailTarget, "Success", "Your participation has been approved");
			
		}

		
		
}
