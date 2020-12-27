package com.etudiant.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.etudiant.mvc.dao.I_contenirDAO;
import com.etudiant.mvc.entites.contenir;
import com.etudiant.mvc.services.I_Contenir_Service;


@Transactional
public class Impl_Contenir_Service implements I_Contenir_Service{

	
	I_contenirDAO dao;
	
	
	public void setDao(I_contenirDAO dao) {
		this.dao = dao;
	}

	@Override
	public contenir save(contenir entity) {
		return dao.save(entity);
	}

	@Override
	public contenir update(contenir entity) {
		return dao.update(entity);
	}

	@Override
	public List<contenir> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<contenir> selectALL(String sortfield, String sort) {
		return dao.selectALL(sortfield, sort);
	}

	@Override
	public contenir getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public contenir findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public contenir findOne(String[] paramName, Object[] paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
