package br.com.publicacao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {
	  
	private static final String DRIVER = "com.mysql.jdbc.Driver";

	public static Connection createConnection() { 
	        String stringDeConexao = "jdbc:mysql://localhost:3306/gerenciador_tarefas"; //url do driver jdbc
	        String usuario = "root"; //seu usuario do banco de dados
	        String senha = "admin"; //sua senha do banco de dados
	        Connection conexao = null;
	         
	        try{
	        	 // Registrar o driver
	            Class.forName(DRIVER);
	            conexao = DriverManager.getConnection(stringDeConexao, usuario, senha); //cria uma conexão
	        } catch(Exception e ){
	            e.printStackTrace();
	        }
	        return conexao; //retorna a conexão
	}
		
		public static ResultSet Execute(Connection conexao, PreparedStatement cmd) throws SQLException {
			ResultSet resultado = cmd.executeQuery(); 
			return resultado;
		}
		public static int updade(Connection conexao, PreparedStatement cmd) throws SQLException {
			return cmd.executeUpdate();
		}
		 
}
