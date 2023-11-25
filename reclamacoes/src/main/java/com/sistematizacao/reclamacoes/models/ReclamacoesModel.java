package com.sistematizacao.reclamacoes.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_RECLAMACOES")
public class ReclamacoesModel implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id;
	private String nome_reclamante;
	private Integer telefone;
	private String descricao_reclamacao;
	private Integer codigo_rastreamento;
	private String solucao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome_reclamante() {
		return nome_reclamante;
	}
	public void setNome_reclamante(String nome_reclamante) {
		this.nome_reclamante = nome_reclamante;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public String getDescricao_reclamacao() {
		return descricao_reclamacao;
	}
	public void setDescricao_reclamacao(String descricao_reclamacao) {
		this.descricao_reclamacao = descricao_reclamacao;
	}
	public Integer getCodigo_rastreamento() {
		return codigo_rastreamento;
	}
	public void setCodigo_rastreamento(Integer codigo_rastreamento) {
		this.codigo_rastreamento = codigo_rastreamento;
	}
	public String getSolucao() {
		return solucao;
	}
	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
}
