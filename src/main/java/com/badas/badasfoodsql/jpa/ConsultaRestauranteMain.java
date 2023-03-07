package com.badas.badasfoodsql.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.badas.badasfoodsql.BadasfoodsqlApplication;
import com.badas.badasfoodsql.domain.model.Restaurante;
import com.badas.badasfoodsql.domain.repository.RestauranteRepository;

public class ConsultaRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContest = new SpringApplicationBuilder(BadasfoodsqlApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository Restaurantes = applicationContest.getBean(RestauranteRepository.class);
		
		List<Restaurante> todosRestaurantes = Restaurantes.listar();
		
		for (Restaurante restaurante : todosRestaurantes){
			System.out.printf("%s - %f - %s\n", restaurante.getNome(),
					restaurante.getTaxaFrete(), restaurante.getCozinha().getNome());
			
		}
		
	}
}
 