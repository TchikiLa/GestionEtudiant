package com.etudiant.mvc.services;

import java.util.List;
import com.etudiant.mvc.entites.module;

public interface I_Module_Service {
	public module save(module entity);
	public module update(module entity);
	public List<module> selectALL();
	public List<module> selectALL(String sortfield,String sort);
	public module getById(Long id);
	public void remove(Long id);
	public module findOne(String paramName, Object paramValue);
	public module findOne(String[] paramName, Object[] paramValue);
	public int findCountBy(String paramName, Object paramValue);
	
}
