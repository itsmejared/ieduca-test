package com.ieduca.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DatosPersona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombres;
	private String apellidos;
	private String telefono;
	private String correo;
	private String direccion;

	@OneToMany(mappedBy = "datosPersona",
			cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<DatosFamilia> datosFamilia;
}
