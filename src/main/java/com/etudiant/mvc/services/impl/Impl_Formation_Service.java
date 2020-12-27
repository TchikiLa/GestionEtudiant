package com.etudiant.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.etudiant.mvc.dao.I_formationDAO;
import com.etudiant.mvc.entites.formation;
import com.etudiant.mvc.services.I_Formation_Service;



@Transactional
public class Impl_Formation_Service implements I_Formation_Service{

	
	I_formationDAO dao;
	
	
	public void setDao(I_formationDAO dao) {
		this.dao = dao;
	}

	@Override
	public formation save(formation entity) {
		return dao.save(entity);
	}

	@Override
	public formation update(formation entity) {
		return dao.update(entity);
	}

	@Override
	public List<formation> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<formation> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public formation getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public formation findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public formation findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
