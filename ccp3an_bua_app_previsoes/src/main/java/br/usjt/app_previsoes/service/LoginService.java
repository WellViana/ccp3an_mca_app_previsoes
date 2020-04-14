package br.usjt.app_previsoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.usjt.app_previsoes.repository.*;
import br.usjt.app_previsoes.model.Usuario;

@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),
				usuario.getSenha()) != null;
	}
}