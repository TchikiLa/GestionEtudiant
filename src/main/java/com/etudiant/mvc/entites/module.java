package com.etudiant.mvc.entites;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class module implements Serializable{
	@Id
	@GeneratedValue
	private long id_module;
	
	private String description_module;
	
	@OneToMany(mappedBy = "idModule")
	private List<chapitre> idChapitre;
	
	@OneToMany(mappedBy = "idModule")
	private List<contenir> idContenir;
	
	@OneToMany(mappedBy = "idModule")
	private List<examain> idExamain;
	
	public module() {
		super();
	}
	public long getId_module() {
		return id_module;
	}
	public void setId_module(long id_module) {
		this.id_module = id_module;
	}
	public String getDescription_module() {
		return description_module;
	}
	public void setDescription_module(String description_module) {
		this.description_module = description_module;
	}
	public List<chapitre> getIdChapitre() {
		return idChapitre;
	}
	public void setIdChapitre(List<chapitre> idChapitre) {
		this.idChapitre = idChapitre;
	}
	public List<contenir> getIdContenir() {
		return idContenir;
	}
	public void setIdContenir(List<contenir> idContenir) {
		this.idContenir = idContenir;
	}
	public List<examain> getIdExamain() {
		return idExamain;
	}
	public void setIdExamain(List<examain> idExamain) {
		this.idExamain = idExamain;
	}

	
}
