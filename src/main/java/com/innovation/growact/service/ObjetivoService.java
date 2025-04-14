package com.innovation.growact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovation.growact.model.Objetivo;
import com.innovation.growact.repository.ObjetivoRepository;

@Service
public class ObjetivoService {

	@Autowired
	private ObjetivoRepository objetivoRepository;
	
	public List<Objetivo> buscarObjetivosPorUsuario(Long usuarioId) {
	    return objetivoRepository.findByUsuarioId(usuarioId);
	}
}
