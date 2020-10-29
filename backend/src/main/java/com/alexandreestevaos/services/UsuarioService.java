package com.alexandreestevaos.services;

import java.util.Optional;

import com.alexandreestevaos.entities.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);
	
	Optional<Usuario> obterPorId(Long id);

}
