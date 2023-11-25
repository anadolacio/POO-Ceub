package com.sistematizacao.reclamacoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistematizacao.reclamacoes.models.ReclamacoesModel;

@Repository
public interface ReclamacoesRepository extends JpaRepository<ReclamacoesModel, Integer> {

}
