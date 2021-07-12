package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Discente;

@Repository
public interface IDiscenteRepository extends CrudRepository<Discente, Serializable> {

	public List<Discente> findByNomeContainingIgnoreCase(Pageable pageable, String query);

	public Discente findByCpfContainingIgnoreCase(String cpf);

	public Discente findById(Integer id);

	public List<Discente> findByOrderByIdDesc();

}
