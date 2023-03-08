package com.badas.badasfoodsql.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.badas.badasfoodsql.BadasfoodsqlApplication;
import com.badas.badasfoodsql.domain.model.Cozinha;
import com.badas.badasfoodsql.domain.repository.CozinhaRepository;

public class AlteracaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(BadasfoodsqlApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		cozinha.setNome("Brasileira");
		
		cozinhaRepository.salvar(cozinha);
		
	}
	
}