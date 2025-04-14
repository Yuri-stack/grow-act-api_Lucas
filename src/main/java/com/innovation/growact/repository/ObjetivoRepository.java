package com.innovation.growact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovation.growact.model.Objetivo;

public interface ObjetivoRepository extends JpaRepository<Objetivo, Long>{
	List<Objetivo> findByUsuarioId(Long usuarioId);
}
