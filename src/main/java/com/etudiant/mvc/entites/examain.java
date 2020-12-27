package com.etudiant.mvc.entites;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class examain implements Serializable{
	@Id
	@GeneratedValue
	private long id_examain;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_examain;
	
	private float Note_examain;
	
	@ManyToOne
	@JoinColumn(name= "id_module")
	private module idModule;
	
	public examain() {
		super();
	}
	public long getId_examain() {
		return id_examain;
	}
	public void setId_examain(long id_examain) {
		this.id_examain = id_examain;
	}
	public float getNote_examain() {
		return Note_examain;
	}
	public void setNote_examain(float note_examain) {
		Note_examain = note_examain;
	}
	public Date getDate_examain() {
		return date_examain;
	}
	public void setDate_examain(Date date_examain) {
		this.date_examain = date_examain;
	}
	public module getIdModule() {
		return idModule;
	}
	public void setIdModule(module idModule) {
		this.idModule = idModule;
	}


}
