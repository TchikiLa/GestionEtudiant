package com.etudiant.mvc.entites;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class quiz implements Serializable{
	@Id
	@GeneratedValue
	private long id_quiz;
	private float note_quiz;
	
	@ManyToOne
	@JoinColumn(name= "id_chapitre")
	private chapitre idChapitre;
	
	public quiz() {
		super();
	}
	public long getId_quiz() {
		return id_quiz;
	}
	public void setId_quiz(long id_quiz) {
		this.id_quiz = id_quiz;
	}
	public float getNote_quiz() {
		return note_quiz;
	}
	public void setNote_quiz(float note_quiz) {
		this.note_quiz = note_quiz;
	}
	public chapitre getIdChapitre() {
		return idChapitre;
	}
	public void setIdChapitre(chapitre idChapitre) {
		this.idChapitre = idChapitre;
	}
}
