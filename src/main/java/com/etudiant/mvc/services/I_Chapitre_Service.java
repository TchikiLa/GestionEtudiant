package com.etudiant.mvc.services;

import java.util.List;

import com.etudiant.mvc.entites.chapitre;

public interface I_Chapitre_Service {
	public chapitre save(chapitre entity);
	public chapitre update(chapitre entity);
	public List<chapitre> selectALL();
	public List<chapitre> selectALL(String sortfield,String sort);
	public chapitre getById(Long id);
	public void remove(Long id);
	public chapitre findOne(String paramName, Object paramValue);
	public chapitre findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
