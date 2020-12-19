package com.examen.sorteo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.sorteo.entity.Numero;

public interface NumeroRepo extends JpaRepository<Numero, Integer> {

}
