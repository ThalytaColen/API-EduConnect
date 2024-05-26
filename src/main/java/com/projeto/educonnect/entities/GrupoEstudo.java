package com.projeto.educonnect.entities;

import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Column;
import org.springframework.beans.BeanUtils;
import com.projeto.educonnect.dto.GrupoEstudoDTO;


@Entity
@Table(name = "tb_grupo_estudo")
public class GrupoEstudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String curso;
	
	@Column(nullable = false)
	private String disciplina;
	
	@ManyToMany(mappedBy = "grupoEstudo")
	private Set <Usuario> usuario;
	
	public GrupoEstudo(GrupoEstudoDTO grupoEstudo) {
		BeanUtils.copyProperties(grupoEstudo, this);
	}
	
	public GrupoEstudo() {
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrupoEstudo other = (GrupoEstudo) obj;
		return Objects.equals(id, other.id);
	}	
	
}
