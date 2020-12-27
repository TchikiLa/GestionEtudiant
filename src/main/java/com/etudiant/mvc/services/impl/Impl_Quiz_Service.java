package com.etudiant.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.etudiant.mvc.dao.I_quizDAO;
import com.etudiant.mvc.entites.quiz;
import com.etudiant.mvc.services.I_Quiz_Service;

@Transactional
public class Impl_Quiz_Service implements I_Quiz_Service{

	
	I_quizDAO dao;
	
	
	public void setDao(I_quizDAO dao) {
		this.dao = dao;
	}

	@Override
	public quiz save(quiz entity) {
		return dao.save(entity);
	}

	@Override
	public quiz update(quiz entity) {
		return dao.update(entity);
	}

	@Override
	public List<quiz> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<quiz> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public quiz getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public quiz findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public quiz findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
