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
public class contenir implements Serializable{
	@Id
	@GeneratedValue
	private long id_contenir;
	
	@ManyToOne
	@JoinColumn(name= "id_formation")
	private formation idFormation;
	@ManyToOne
	@JoinColumn(name= "id_module")
	private module idModule;
	

	
	public contenir() {
		super();
	}



	public long getId_contenir() {
		return id_contenir;
	}



	public void setId_contenir(long id_contenir) {
		this.id_contenir = id_contenir;
	}



	public formation getIdFormation() {
		return idFormation;
	}



	public void setIdFormation(formation idFormation) {
		this.idFormation = idFormation;
	}



	public module getIdModule() {
		return idModule;
	}



	public void setIdModule(module idModule) {
		this.idModule = idModule;
	}

}
