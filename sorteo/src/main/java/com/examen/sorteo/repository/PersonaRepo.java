package com.examen.sorteo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.sorteo.entity.Persona;

public interface PersonaRepo extends JpaRepository<Persona, Integer>{

}
