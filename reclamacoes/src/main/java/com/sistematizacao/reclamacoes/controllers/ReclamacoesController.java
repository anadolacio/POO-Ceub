package com.sistematizacao.reclamacoes.controllers;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sistematizacao.reclamacoes.dtos.ReclamacoesDto;
import com.sistematizacao.reclamacoes.models.ReclamacoesModel;
import com.sistematizacao.reclamacoes.repositories.ReclamacoesRepository;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
public class ReclamacoesController {
	@Autowired
	ReclamacoesRepository reclamacoesRepository;
	
	@GetMapping("/reclamacoes")
	public ResponseEntity<List<ReclamacoesModel>> listar(){
		List<ReclamacoesModel> reclamacoesList = reclamacoesRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(reclamacoesList);
	}
	
	@PostMapping("/reclamacoes")
	public ResponseEntity<ReclamacoesModel> salvar(@RequestBody @Valid ReclamacoesDto reclamacoesDto){
		var reclamacoesModel = new ReclamacoesModel();
		BeanUtils.copyProperties(reclamacoesDto,  reclamacoesModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(reclamacoesRepository.save(reclamacoesModel));
	}
	
	@GetMapping("/reclamacoes/{id}")
	public ResponseEntity<Object> detalhar(@PathVariable(value="id")  Integer id){
		Optional<ReclamacoesModel> reclamacao = reclamacoesRepository.findById(id);
		if(reclamacao.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Reclamação não encontrada!");
		}
		return ResponseEntity.status(HttpStatus.OK).body(reclamacao.get());
	}
	
	@PutMapping("/reclamacoes/{id}")
	public ResponseEntity<Object> atualizarFilme(@PathVariable(value="id")  Integer id, 
			@RequestBody @Valid ReclamacoesDto reclamacoesDto){
		Optional<ReclamacoesModel> reclamacao = reclamacoesRepository.findById(id);
		if(reclamacao.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Reclamação não encontrada para edição!");
		}
		var reclamacoesModel = reclamacao.get();
		BeanUtils.copyProperties(reclamacoesDto,  reclamacoesModel);
		return ResponseEntity.status(HttpStatus.OK).body(reclamacoesRepository.save(reclamacoesModel));
	}
	
	@DeleteMapping("/reclamacoes/{id}")
	public ResponseEntity<Object> deletaRecalmacao(@PathVariable(value="id")  Integer id){
		Optional<ReclamacoesModel> reclamacao = reclamacoesRepository.findById(id);
		if(reclamacao.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Reclamação não encontrada para deletar!");
		}
		reclamacoesRepository.delete(reclamacao.get());
		return ResponseEntity.status(HttpStatus.OK).body("A reclamação foi deletada!");
	}
}
