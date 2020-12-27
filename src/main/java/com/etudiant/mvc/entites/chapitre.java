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
public class chapitre implements Serializable{
	@Id
	@GeneratedValue
	private long id_chapitre;
	private String titre_chapitre;
	private String description_chapitre;
	
	@OneToMany(mappedBy = "idChapitre")
	private List<cours> idCours;
	
	@OneToMany(mappedBy = "idChapitre")	
	private List<quiz> idQuiz;
	
	@ManyToOne
	@JoinColumn(name= "id_module")
	private module idModule;
	
	public chapitre() {
		super();
	}
	public long getId_chapitre() {
		return id_chapitre;
	}
	public void setId_chapitre(long id_chapitre) {
		this.id_chapitre = id_chapitre;
	}
	public String getTitre_chapitre() {
		return titre_chapitre;
	}
	public void setTitre_chapitre(String titre_chapitre) {
		this.titre_chapitre = titre_chapitre;
	}
	public String getDescription_chapitre() {
		return description_chapitre;
	}
	public void setDescription_chapitre(String description_chapitre) {
		this.description_chapitre = description_chapitre;
	}
	public List<cours> getIdCours() {
		return idCours;
	}
	public void setIdCours(List<cours> idCours) {
		this.idCours = idCours;
	}
	public List<quiz> getIdQuiz() {
		return idQuiz;
	}
	public void setIdQuiz(List<quiz> idQuiz) {
		this.idQuiz = idQuiz;
	}
	public module getIdModule() {
		return idModule;
	}
	public void setIdModule(module idModule) {
		this.idModule = idModule;
	}

}
