package com.intg.conference.entities;


import java.util.List;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Conference {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private String location;
	private String guest;
	private Long nbPlace;
	
	@JsonIgnore
	@OneToMany(mappedBy = "conferences")
	private List<Participant> participants;
	
	@ManyToOne
	private Image image;

	@Override
	public String toString() {
		return "Conference [id=" + id + ", title=" + title + ", description=" + description + ", location=" + location
				+ ", guest=" + guest + ", nbPlace=" + nbPlace + ", participants=" + participants + ", image=" + image
				+ "]";
	}

	public Conference() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conference(Long id, String title, String description, String location, String guest, Long nbPlace,
			List<Participant> participants, Image image) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.location = location;
		this.guest = guest;
		this.nbPlace = nbPlace;
		this.participants = participants;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}

	public Long getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(Long nbPlace) {
		this.nbPlace = nbPlace;
	}

	public List<Participant> getParticipant() {
		return participants;
	}

	public void setParticipant(List<Participant> participant) {
		this.participants = participant;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
	
}





