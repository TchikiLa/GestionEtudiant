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
public class assister implements Serializable{
	@Id
	@GeneratedValue
	private long id_assister;
	
	@ManyToOne
	@JoinColumn(name= "id_formation")
	private formation idFormation;
	
	@ManyToOne
	@JoinColumn(name= "id_etudiant")
	private etudiant idEtudiant;	
	
	public assister() {
		super();
	}

	public long getId_assister() {
		return id_assister;
	}

	public void setId_assister(long id_assister) {
		this.id_assister = id_assister;
	}

	public formation getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(formation idFormation) {
		this.idFormation = idFormation;
	}

	public etudiant getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(etudiant idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	
	
}
