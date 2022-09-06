package br.com.viagem.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.viagem.factory.ConnectionFactory;
import br.com.viagem.model.Usuario;

  public class UsuarioDAO {
	  
	  
	public void save(Usuario usuario) {


		String sql = "INSET INTO usuario (id, nome, CPF, email) VALUES (?,?,?,?)";
		Connection  conn = null;
		PreparedStatement pstm = null;
		
		try {
		 conn = ConnectionFactory.createConnectionToMySQL();
		 pstm = (PreparedStatement) conn.prepareStatement(sql);
		 pstm.setId(1, usuario.getId());
		 pstm.setString(2, usuario.getNome());
		 pstm.setInt(3, usuario.getCPF());
		 pstm.setString(4,usuario.getEmail());
		 
		 pstm.execute();
		 System.out.println("Contato Salvo com sucesso.");
		 
		 
		 {catch (Exception e ) {
			 e.printStackTrace ();
			 {finally {
				 
		 try {
			if (pstm!=null) {
				pstm.close();
			 }
			if (conn!=null) {
				 pstm.close();
			}
				 }catch (Exception e ) {
					 e.printStackTrace ();
				 }
			 }

			public List<Usuario> getUsuario(){
		    	 String sql = "SELECT * FROM contatos";
		    	 List<Usuario> usuario = new ArrayList<Usuario>();
		    	 Connection conn = null;
		    	 PreparedStatement pstm = null;
		    	 
		    	 ResultSet rset = null;
		    	 
		    	 try {
		    		 conn = ConnectionFactory.createConnectionToMySQL();
		    		 pstm= (PreparedStatement) conn.prepareStatement(sql);
		    		 rset = pstm.executeQuery();
		    		 
		    		 while (rset .next())) {
		    			 Usuario usuario1 = new Usuario();
		    			 ((Usuario) usuario).setId(rset.getInt("id"));
		    			 usuario.setNome(rset.getString("Nome"));
		    			 usuario.setInt(rset.getInt("CPF"));
		    			 usuario.setEmail(rset.getString("Email"));
		    			 
		    			 usuario.add(usuario);
		    		 }
		    			 
		    		 
		    		 catch (Exception e) {
		    			 e.printStackTrace();
		    			 
		    		 }finally {
		    			 
		    			 try {
		    				 
		    			 if (rset!=null) {
		    				 rset.close();
		    			 }
		    			 if (pstm!=null) {
		    				 pstm.close();
		    			 }
		    			 if (conn!=null) {
		    				 conn.close();
		    			 }
		    			 
		    		 try {
						
					} catch (Exception e) {
				       e.printStackTrace();
		    		 }
		    			 
						
		    		 {
		    	 return usuario;
		    		 }
		    			 
		    	
		    
		    	 
		    
		    		 
		    		 
		    		 
	public void update(Usuario usuario) {
		String sql = "UPDATE usuario SET nome = ?, CPF = ?, Email= ? WHERE id =?";
		Connection conn =  null;
		PreparedStatement pstm = null;
		 try {
			 conn= ConnectionFactory.createConnectionToMySQL();
			 pstm= (PreparedStament) conn.prepareStatement(sql);
			 pstm.setString(1, usuario.getNome());
			 pstm.setInt(2, usuario.getCPF());
			 pstm.setString(3, usuario.getEmail());
			 pstm.setInt(4, usuario.getId());
			 
			 pstm.execute();
			 
		 }catch (Exception e ) {
			 e.printStackTrace();
		 }finally {
			 try {
				 if (pstm!=null) {
					 pstm.close();
				 }
				 if (conn!=null) {
					 conn.close();
				 }
			 }catch (Exception e ) {
				 e.printStackTrace();
			 }
					 
					 
									 
				 }
			 }
		 
		 }
		    			 
    public void deleteById(int id) {
    	String sql = "DELETE FROM usuario WHERE id = ?";
    	Connection conn = null;
    	PreparedStatement pstm = null;
    	
    	try {
    		conn = ConnectionFactory.createConnectionToMySQL();
    		pstm = conn.prepareStatement(sql);
    		pstm.setInt (1, id);
    		pstm.execute();
    		
    	}catch (Exception e) {
    		e.printStackTrace();
    	}finally {
    		try {
    			if (pstm! = null) {
    				pstm.close();
    			}
    			if (conn! = null) {
    				conn.close();
    			}
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	}
    	
    }
	