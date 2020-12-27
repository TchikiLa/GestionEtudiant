package com.etudiant.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.etudiant.mvc.dao.I_etudiantDAO;
import com.etudiant.mvc.entites.etudiant;
import com.etudiant.mvc.services.I_Etudiant_Service;



@Transactional
public class Impl_Etudiant_Service implements I_Etudiant_Service{

	
	I_etudiantDAO dao;
	
	
	public void setDao(I_etudiantDAO dao) {
		this.dao = dao;
	}

	@Override
	public etudiant save(etudiant entity) {
		return dao.save(entity);
	}

	@Override
	public etudiant update(etudiant entity) {
		return dao.update(entity);
	}

	@Override
	public List<etudiant> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<etudiant> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public etudiant getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public etudiant findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public etudiant findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
