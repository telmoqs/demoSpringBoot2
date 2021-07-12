package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Discente;
import com.example.demo.service.IDiscenteService;

@RestController
class DiscenteResource {
	private static final String URL = "/discente";

	@Autowired
	private IDiscenteService discenteService;

	@GetMapping(URL)
	public List<Discente> findAll() {
		return discenteService.findByOrderByIdDesc();
	}

	@GetMapping(URL + "/{id}")
	public Discente findById(@PathVariable Integer id) {
		return discenteService.findById(id);
	}

	@PostMapping(URL)
	public void save(@RequestBody Discente projetoEnsino) {
		discenteService.save(projetoEnsino);
	}

	@PutMapping(URL)
	public void update(@RequestBody Discente projetoEnsino) {
		discenteService.update(projetoEnsino);
	}

	@DeleteMapping(URL + "/{id}")
	public void delete(@PathVariable Integer id) {
		discenteService.deleteById(id);
	}

}
