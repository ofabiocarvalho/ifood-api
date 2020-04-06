package com.fiap.ifood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.ifood.domain.model.Restaurante;
import com.fiap.ifood.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {
	
	@Autowired
	RestauranteRepository restauranteRepository;
	
	public List<Restaurante> findAll(){
		return restauranteRepository.findAll();
	}

	public Restaurante findById(Long restauranteId) {
		return restauranteRepository.findById(restauranteId);
	}

}
