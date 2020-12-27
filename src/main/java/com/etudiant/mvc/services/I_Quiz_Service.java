package com.etudiant.mvc.services;

import java.util.List;
import com.etudiant.mvc.entites.quiz;

public interface I_Quiz_Service {
	public quiz save(quiz entity);
	public quiz update(quiz entity);
	public List<quiz> selectALL();
	public List<quiz> selectALL(String sortfield,String sort);
	public quiz getById(Long id);
	public void remove(Long id);
	public quiz findOne(String paramName, Object paramValue);
	public quiz findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
