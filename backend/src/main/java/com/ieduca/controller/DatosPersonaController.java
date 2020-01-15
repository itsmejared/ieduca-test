package com.ieduca.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ieduca.entity.DatosPersona;
import com.ieduca.service.DatosPersonaService;

@RestController
@RequestMapping({ "/datos" })
public class DatosPersonaController {

	private DatosPersonaService service;

	public DatosPersonaController(DatosPersonaService datosService) {
		this.service = datosService;
	}

	@GetMapping
	public List<DatosPersona> listaDatosPersona() {
		return service.listaDatosPersona();
	}

	@DeleteMapping(path = { "/{id}" })
	public void borraDatosPersona(@PathVariable("id") long id) {

		service.eliminaDatosPersona(id);
	}

	@PostMapping
	public boolean creaPersona(@RequestBody DatosPersona datos) {

		boolean creado = false;
		if (datos != null && datos.getNombres()!=null && datos.getApellidos()!=null) {
			service.insertaDatosPersona(datos);
			creado = !creado;
		}
		return creado;
	}

}