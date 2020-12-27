package com.etudiant.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.etudiant.mvc.dao.I_coursDAO;
import com.etudiant.mvc.entites.cours;
import com.etudiant.mvc.services.I_Cours_Service;


@Transactional
public class Impl_Cours_Service implements I_Cours_Service{

	
	I_coursDAO dao;
	
	
	public void setDao(I_coursDAO dao) {
		this.dao = dao;
	}

	@Override
	public cours save(cours entity) {
		return dao.save(entity);
	}

	@Override
	public cours update(cours entity) {
		return dao.update(entity);
	}

	@Override
	public List<cours> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<cours> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public cours getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public cours findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public cours findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
