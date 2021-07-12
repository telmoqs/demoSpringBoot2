package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Discente;

public interface IDiscenteService {

	public void save(Discente discente);

	public void update(Discente discente);

	public void deleteById(Integer id);

	public Discente findById(Integer id);
	
	public List<Discente> findByOrderByIdDesc();


}
