package com.projeto.educonnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.educonnect.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
