package com.badas.badasfoodsql.jpa;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.badas.badasfoodsql.BadasfoodsqlApplication;
import com.badas.badasfoodsql.domain.model.Cozinha;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContest = new SpringApplicationBuilder(BadasfoodsqlApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContest.getBean(CadastroCozinha.class);
		
		List<Cozinha> cozinhas = cadastroCozinha.listar();
		
		for (Cozinha cozinha : cozinhas){
			System.out.println(cozinha.getNome());
			
		}
		
	}
}
 