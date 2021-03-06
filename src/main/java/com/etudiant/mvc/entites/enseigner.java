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
public class enseigner implements Serializable{
	@Id
	@GeneratedValue
	private long id_enseigner;
	
	@ManyToOne
	@JoinColumn(name= "id_formation")
	private formation idFormation;
	@ManyToOne
	@JoinColumn(name= "id_enseignant")
	private enseignant idEnseignant;
	
	
	public enseigner() {
		super();
	}


	public long getId_enseigner() {
		return id_enseigner;
	}


	public void setId_enseigner(long id_enseigner) {
		this.id_enseigner = id_enseigner;
	}


	public formation getIdFormation() {
		return idFormation;
	}


	public void setIdFormation(formation idFormation) {
		this.idFormation = idFormation;
	}


	public enseignant getIdEnseignant() {
		return idEnseignant;
	}


	public void setIdEnseignant(enseignant idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

}
