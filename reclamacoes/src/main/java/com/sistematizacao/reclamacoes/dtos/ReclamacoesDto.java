package com.sistematizacao.reclamacoes.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReclamacoesDto (@NotBlank String nome_reclamante,
		@NotNull Integer telefone,
		@NotBlank String descricao_reclamacao,
		@NotNull Integer codigo_rastreamento,
		@NotBlank String solucao) {
	
}


