package com.etudiant.mvc.services;

import java.util.List;
import com.etudiant.mvc.entites.formation;

public interface I_Formation_Service {
	public formation save(formation entity);
	public formation update(formation entity);
	public List<formation> selectALL();
	public List<formation> selectALL(String sortfield,String sort);
	public formation getById(Long id);
	public void remove(Long id);
	public formation findOne(String paramName, Object paramValue);
	public formation findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
