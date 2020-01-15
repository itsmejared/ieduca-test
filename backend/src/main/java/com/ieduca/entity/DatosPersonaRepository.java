package com.ieduca.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosPersonaRepository extends JpaRepository<DatosPersona, Long> {

}