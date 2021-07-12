package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Discente;
import com.example.demo.repository.IDiscenteRepository;
import com.example.demo.service.IDiscenteService;

@Service
@Transactional
public class DiscenteServiceImpl implements IDiscenteService {

	@Autowired
	private IDiscenteRepository discenteRepository;

	@Override
	public void save(Discente Discente) {
		discenteRepository.save(Discente);
	}

	@Override
	public void update(Discente Discente) {
		discenteRepository.save(Discente);
	}

	@Override
	public void deleteById(Integer id) {
		discenteRepository.deleteById(id);
	}

	@Override
	public Discente findById(Integer id) {
		return discenteRepository.findById(id);
	}

	@Override
	public List<Discente> findByOrderByIdDesc() {
		return discenteRepository.findByOrderByIdDesc();
	}

}
