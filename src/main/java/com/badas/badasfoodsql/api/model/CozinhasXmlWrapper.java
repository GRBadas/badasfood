package com.badas.badasfoodsql.api.model;

import java.util.List;

import com.badas.badasfoodsql.domain.model.Cozinha;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.NonNull;

public class CozinhasXmlWrapper {
	
	@JsonProperty("cozinha")
//	@JacksonXmlProperty(localName = "cozinha")
//	@JacksonXmlElementWrapper(useWrapping = false)
	@NonNull
	private List<Cozinha> cozinhas;

}
