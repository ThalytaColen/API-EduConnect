package com.projeto.educonnect.dto;

import org.springframework.beans.BeanUtils;
import com.projeto.educonnect.entities.GrupoEstudo;

public class GrupoEstudoDTO {
	
	private Long id;
	private String nome;
	private String curso;
	private String disciplina;
	
	public GrupoEstudoDTO(GrupoEstudo grupoEstudo) {
		BeanUtils.copyProperties(grupoEstudo, this);
	}
	
	public GrupoEstudoDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
