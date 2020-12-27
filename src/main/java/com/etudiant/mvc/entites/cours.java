package com.etudiant.mvc.entites;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class cours implements Serializable{
	@Id
	@GeneratedValue
	private long id_cours;
	private String titre_cours;
	private String description_cours;
	
	@ManyToOne
	@JoinColumn(name= "id_chapitre")
	private chapitre idChapitre;
	


	public cours() {
		super();
	}
	public long getId_cours() {
		return id_cours;
	}
	public void setId_cours(long id_cours) {
		this.id_cours = id_cours;
	}
	public String getTitre_cours() {
		return titre_cours;
	}
	public void setTitre_cours(String titre_cours) {
		this.titre_cours = titre_cours;
	}
	public String getDescription_cours() {
		return description_cours;
	}
	public void setDescription_cours(String description_cours) {
		this.description_cours = description_cours;
	}
	public chapitre getIdChapitre() {
		return idChapitre;
	}
	public void setIdChapitre(chapitre idChapitre) {
		this.idChapitre = idChapitre;
	}

}
