package com.fiap.ifood.infrastructure.repository;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fiap.ifood.domain.model.Restaurante;
import com.fiap.ifood.repository.RestauranteRepository;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepository {
	
	private List<Restaurante> restaurantes;
	
	private void loadData() {
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			restaurantes = objectMapper.readValue(new File(getClass().getClassLoader().getResource("restaurante-data.json").getFile()), new TypeReference<List<Restaurante>>(){});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Restaurante> findAll() {
		loadData();
		return restaurantes;
	}

	@Override
	public Restaurante findById(Long restauranteId) {
		loadData();
		return restaurantes.stream()
				.filter((r) -> restauranteId.equals(r.getId()))
				.findAny()
				.orElse(null);
	}
	
	

}
