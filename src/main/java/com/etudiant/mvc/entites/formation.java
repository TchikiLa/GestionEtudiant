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
public class formation implements Serializable{
	@Id
	@GeneratedValue
	private long id_formation;
	private String titre_formation;
	private String niveau_formation;
	private String description_formation;
	private int durée_formation;
	
	@OneToMany(mappedBy = "idFormation")
	private List<contenir> idContenir;
	
	@OneToMany(mappedBy = "idFormation")
	private List<enseigner> idEnseigner;
	
	@OneToMany(mappedBy = "idFormation")
	private List<assister> idAssister;
	
	public formation() {
		super();
	}
	public long getId_formation() {
		return id_formation;
	}
	public void setId_formation(long id_formation) {
		this.id_formation = id_formation;
	}
	public String getTitre_formation() {
		return titre_formation;
	}
	public void setTitre_formation(String titre_formation) {
		this.titre_formation = titre_formation;
	}
	public String getNiveau_formation() {
		return niveau_formation;
	}
	public void setNiveau_formation(String niveau_formation) {
		this.niveau_formation = niveau_formation;
	}
	public String getDescription_formation() {
		return description_formation;
	}
	public void setDescription_formation(String description_formation) {
		this.description_formation = description_formation;
	}
	public int getDurée_formation() {
		return durée_formation;
	}
	public void setDurée_formation(int durée_formation) {
		this.durée_formation = durée_formation;
	}
	public List<contenir> getIdContenir() {
		return idContenir;
	}
	public void setIdContenir(List<contenir> idContenir) {
		this.idContenir = idContenir;
	}
	public List<enseigner> getIdEnseigner() {
		return idEnseigner;
	}
	public void setIdEnseigner(List<enseigner> idEnseigner) {
		this.idEnseigner = idEnseigner;
	}
	public List<assister> getIdAssister() {
		return idAssister;
	}
	public void setIdAssister(List<assister> idAssister) {
		this.idAssister = idAssister;
	}
	
	

}
