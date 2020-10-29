package com.alexandreestevaos.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandreestevaos.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	boolean existsByEmail(String email);  //Query Methods
	
	Optional<Usuario> findByEmail(String email);

}
