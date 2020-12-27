package com.etudiant.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.etudiant.mvc.dao.I_chapitreDAO;
import com.etudiant.mvc.entites.chapitre;
import com.etudiant.mvc.services.I_Chapitre_Service;

@Transactional
public class Impl_Chapitre_Service implements I_Chapitre_Service{

	
	I_chapitreDAO dao;
	
	
	public void setDao(I_chapitreDAO dao) {
		this.dao = dao;
	}

	@Override
	public chapitre save(chapitre entity) {
		return dao.save(entity);
	}

	@Override
	public chapitre update(chapitre entity) {
		return dao.update(entity);
	}

	@Override
	public List<chapitre> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<chapitre> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public chapitre getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public chapitre findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public chapitre findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
