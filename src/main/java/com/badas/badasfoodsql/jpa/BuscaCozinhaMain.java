package com.badas.badasfoodsql.jpa;



import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.badas.badasfoodsql.BadasfoodsqlApplication;
import com.badas.badasfoodsql.domain.model.Cozinha;
import com.badas.badasfoodsql.domain.repository.CozinhaRepository;

public class BuscaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContest = new SpringApplicationBuilder(BadasfoodsqlApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhaRepository = applicationContest.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = cozinhaRepository.porId(1L);
		
		System.out.println(cozinha.getNome());
		
	}
}
 