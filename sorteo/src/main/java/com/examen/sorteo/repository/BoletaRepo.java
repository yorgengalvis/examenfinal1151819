package com.examen.sorteo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.sorteo.entity.Boleta;


public interface BoletaRepo extends JpaRepository<Boleta,Integer> {

}
