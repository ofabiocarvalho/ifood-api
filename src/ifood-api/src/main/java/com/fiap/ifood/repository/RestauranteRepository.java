package com.fiap.ifood.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fiap.ifood.domain.model.Restaurante;

@Repository
public interface RestauranteRepository {
	
	List<Restaurante> findAll();

	Restaurante findById(Long restauranteId);
	
}
