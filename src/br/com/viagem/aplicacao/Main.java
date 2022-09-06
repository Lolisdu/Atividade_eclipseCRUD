package br.com.viagem.aplicacao;

import br.com.viagem.DAO.UsuarioDAO;
import br.com.viagem.model.Usuario;

public class Main {

	public static void main(String[] args) {
		
		UsuarioDAO usuarioDAO = new UsuarioDAO(); 
		
		Usuario usuario = new Usuario();
		usuario.setNome("Maria Clara");
		usuario.setCPF(37);
		usuario.setEmail ("vamos@gmail.com");
		
		UsuarioDAO usuarioDAO2 = new UsuarioDAO();
		usuarioDAO2.save(usuario);
		
			//atualização;
		
			Usuario c1 = new Usuario();
			c1.setNome("Maria Clara Ramos");
			c1.setCPF(123456789);
			c1.setEmail("clarinha@gmail.com");
			c1.getId(1);
			
			//usuarioDAO.update(c1);
			
			//Visualização do banco de dados
			for (Usuario c: UsuarioDAO.getUsuario()) {
				System.out.println("Usuario: "+c.getNome());
			}
			
			//Deletar numero do contato pelo ID
			//UsuarioDAO.deleteById(1);
			
			
			
			
			
			
			

	}

}
