package com.examen.sorteo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.sorteo.entity.Sorteo;

public interface SorteoRepo extends JpaRepository<Sorteo, Integer>{

}
