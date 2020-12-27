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
public class etudiant implements Serializable{
	@Id
	@GeneratedValue
	private long id_etudiant;
	
	private String nom_etudiant;
	private String prenom_etudiant;
	private String Username_etudiant;
	private String mot_pass_etudiant;
	private Date date_anis_etudiant;
	private String email_etudiant;
	private int tel_etudiant;
	private String pays_etudiant;
	private String niveau_etude;
	private String diplome;
	
	@OneToMany(mappedBy = "idEtudiant")
	private List<assister> idAssister;
	
	public etudiant() {
		super();
	}

	public long getId_etudiant() {
		return id_etudiant;
	}

	public void setId_etudiant(long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}

	public String getNom_etudiant() {
		return nom_etudiant;
	}

	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}

	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}

	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}

	public String getMot_pass_etudiant() {
		return mot_pass_etudiant;
	}

	public void setMot_pass_etudiant(String mot_pass_etudiant) {
		this.mot_pass_etudiant = mot_pass_etudiant;
	}

	public Date getDate_anis_etudiant() {
		return date_anis_etudiant;
	}

	public void setDate_anis_etudiant(Date date_anis_etudiant) {
		this.date_anis_etudiant = date_anis_etudiant;
	}

	public String getEmail_etudiant() {
		return email_etudiant;
	}

	public void setEmail_etudiant(String email_etudiant) {
		this.email_etudiant = email_etudiant;
	}

	public int getTel_etudiant() {
		return tel_etudiant;
	}

	public void setTel_etudiant(int tel_etudiant) {
		this.tel_etudiant = tel_etudiant;
	}

	public String getPays_etudiant() {
		return pays_etudiant;
	}

	public void setPays_etudiant(String pays_etudiant) {
		this.pays_etudiant = pays_etudiant;
	}

	public String getNiveau_etude() {
		return niveau_etude;
	}

	public void setNiveau_etude(String niveau_etude) {
		this.niveau_etude = niveau_etude;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	
	
	public String getUsername_etudiant() {
		return Username_etudiant;
	}

	public void setUsername_etudiant(String username_etudiant) {
		Username_etudiant = username_etudiant;
	}

	public List<assister> getIdAssister() {
		return idAssister;
	}

	public void setIdAssister(List<assister> idAssister) {
		this.idAssister = idAssister;
	}

	
}
