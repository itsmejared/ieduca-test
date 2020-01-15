package com.ieduca.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ieduca.entity.DatosPersona;
import com.ieduca.entity.DatosPersonaRepository;

@Service
public class DatosPersonaService {

	private DatosPersonaRepository repository;

	public DatosPersonaService(DatosPersonaRepository datosRepository) {
		this.repository = datosRepository;
	}

	public void insertaDatosPersona(DatosPersona obj) {
		repository.save(obj);
	}

	public List<DatosPersona> listaDatosPersona() {
		return repository.findAll();
	}

	public ResponseEntity<Object> eliminaDatosPersona(Long id) {
		return repository.findById(id)

				.map(record -> {

					repository.deleteById(id);

					return ResponseEntity.ok().build();

				}).orElse(ResponseEntity.notFound().build());
	}

}
