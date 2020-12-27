package com.etudiant.mvc.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class enseignant implements Serializable{

	@Id
	@GeneratedValue
	private long id_enseignant;
	
	private String nom_enseignant;
	private String prenom_enseignant;
	private String Username_enseignant;
	
	@OneToMany(mappedBy = "idEnseignant")
	private List<enseigner> idEnseigner;
	
	public String getUsername_enseignant() {
		return Username_enseignant;
	}

	public void setUsername_enseignant(String username_enseignant) {
		Username_enseignant = username_enseignant;
	}

	private String mot_pass_enseignant;
	private Date date_anis_enseignant;
	private String email_enseignant;
	private int tel_enseignant;
	private String pays_enseignant;
	private String grade;
	private String specialite;
	
	public enseignant() {
		super();
	}

	public long getId_enseignant() {
		return id_enseignant;
	}

	public void setId_enseignant(long id_enseignant) {
		this.id_enseignant = id_enseignant;
	}

	public String getNom_enseignant() {
		return nom_enseignant;
	}

	public void setNom_enseignant(String nom_enseignant) {
		this.nom_enseignant = nom_enseignant;
	}

	public String getPrenom_enseignant() {
		return prenom_enseignant;
	}

	public void setPrenom_enseignant(String prenom_enseignant) {
		this.prenom_enseignant = prenom_enseignant;
	}

	public String getMot_pass_enseignant() {
		return mot_pass_enseignant;
	}

	public void setMot_pass_enseignant(String mot_pass_enseignant) {
		this.mot_pass_enseignant = mot_pass_enseignant;
	}

	public Date getDate_anis_enseignant() {
		return date_anis_enseignant;
	}

	public void setDate_anis_enseignant(Date date_anis_enseignant) {
		this.date_anis_enseignant = date_anis_enseignant;
	}

	public String getEmail_enseignant() {
		return email_enseignant;
	}

	public void setEmail_enseignant(String email_enseignant) {
		this.email_enseignant = email_enseignant;
	}

	public int getTel_enseignant() {
		return tel_enseignant;
	}

	public void setTel_enseignant(int tel_enseignant) {
		this.tel_enseignant = tel_enseignant;
	}

	public String getPays_enseignant() {
		return pays_enseignant;
	}

	public void setPays_enseignant(String pays_enseignant) {
		this.pays_enseignant = pays_enseignant;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public List<enseigner> getIdEnseigner() {
		return idEnseigner;
	}

	public void setIdEnseigner(List<enseigner> idEnseigner) {
		this.idEnseigner = idEnseigner;
	}

	

	
}
