package com.etudiant.mvc.services;

import java.util.List;

import com.etudiant.mvc.entites.contenir;


public interface I_Contenir_Service {
	public contenir save(contenir entity);
	public contenir update(contenir entity);
	public List<contenir> selectALL();
	public List<contenir> selectALL(String sortfield,String sort);
	public contenir getById(Long id);
	public void remove(Long id);
	public contenir findOne(String paramName, Object paramValue);
	public contenir findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
