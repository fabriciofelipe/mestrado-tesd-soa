/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import br.com.publicacao.connection.ConnectionFactory;
import br.com.publicacao.vo.Publicacao;

/**
 *
 * @author labccet
 */
@Repository
public class PublicacaoDaoImpl implements PublicacaoDao{


	private static String CONSULTA_PUBLICACAO = "select * from publicacao";
	private static String INSERIR_PUBLICACAO = "insert into publicacao(titulo,pagina_inicial,pagina_final,data_publicacao) values(?,?,?,?)";
	private static String ALTERAR_PUBLICACAO = "UPDATE publicacao SET titulo=?,pagina_inicial=?,pagina_final=?,data_publicacao=? WHERE id = ?";
	private static String DELETAR_PUBLICACAO = "delete from publicacao WHERE id = ?";

	public Publicacao buscarListaPiblicacoes(String titulo){
		Publicacao publicacao = new Publicacao();
		try {
			//abrindo uma conexão
			Connection conexao = ConnectionFactory.createConnection();
			//criar o SQL para extrai dados do banco
			StringBuilder sql = new StringBuilder();
			sql.append(CONSULTA_PUBLICACAO);
			sql.append(" WHERE titulo LIKE ? ");
			//criando comando...
			PreparedStatement cmd = conexao.prepareStatement(sql.toString());
			cmd.setString(1, "%" + titulo + "%");
			ResultSet resultado = ConnectionFactory.Execute(conexao, cmd);
			 while (resultado.next()) {
				 publicacao.setId(resultado.getInt("id"));
				 publicacao.setTitulo(resultado.getString("titulo"));
				 publicacao.setPagInicial(resultado.getInt("pagina_inicial"));
				 publicacao.setPagFinal(resultado.getInt("pagina_final"));
				 publicacao.setDataPublicacao(resultado.getDate("data_publicacao"));
			 }
			conexao.close(); //fecha a conexão
		} catch (Exception e) {

		}
		return publicacao;
	}
	
	public int incluirPublicacao(Publicacao publicacao){
		
		try {
			//abrindo uma conexão
			Connection conexao = ConnectionFactory.createConnection();
			//criar o SQL para extrai dados do banco
			StringBuilder sql = new StringBuilder();
			sql.append(INSERIR_PUBLICACAO);
			//criando comando...
			PreparedStatement cmd = conexao.prepareStatement(sql.toString());
			cmd.setString(1, publicacao.getTitulo());
			cmd.setInt(2, publicacao.getPagInicial());
			cmd.setInt(3, publicacao.getPagFinal());
			cmd.setObject(4, publicacao.getDataPublicacao());
			int ret = ConnectionFactory.updade(conexao, cmd);
			System.out.println("Retonoro na inclusao " + ret);
			conexao.close(); //fecha a conexão
			
			return ret;
			
		} catch (Exception e) {
				new RuntimeException(e.getMessage());
		}
		return 0;
	}
	
	public int alterarPublicacao(Publicacao publicacao){
		try {
			//abrindo uma conexão
			Connection conexao = ConnectionFactory.createConnection();
			//criar o SQL para extrai dados do banco
			StringBuilder sql = new StringBuilder();
			sql.append(ALTERAR_PUBLICACAO);
			//criando comando...
			PreparedStatement cmd = conexao.prepareStatement(sql.toString());
			cmd.setString(1, publicacao.getTitulo());
			cmd.setInt(2, publicacao.getPagInicial());
			cmd.setInt(3, publicacao.getPagFinal());
			cmd.setObject(4, publicacao.getDataPublicacao());
			cmd.setInt(5, publicacao.getId());
			int ret = ConnectionFactory.updade(conexao, cmd);
			System.out.println("Retonoro na Alteracao " + ret);
			conexao.close(); //fecha a conexão
			return ret;
		} catch (Exception e) {
			new RuntimeException(e.getMessage());
		}
		return 0;
	}
	public int excluirPublicacao(int id){
		try {
			//abrindo uma conexão
			Connection conexao = ConnectionFactory.createConnection();
			//criar o SQL para extrai dados do banco
			StringBuilder sql = new StringBuilder();
			sql.append(DELETAR_PUBLICACAO);
			//criando comando...
			PreparedStatement cmd = conexao.prepareStatement(sql.toString());
			cmd.setInt(1, id);
			int ret = ConnectionFactory.updade(conexao, cmd);
			System.out.println("Retonoro na Exclusao " + ret);
			conexao.close(); //fecha a conexão
			return ret;
		} catch (Exception e) {
			new RuntimeException(e.getMessage());
		}
		return 0;
	}

	//	private JdbcTemplate jdbcTemplate;
	//
	//	public final void setDataSource(DataSource dataSource) {
	//		this.jdbcTemplate = new JdbcTemplate(dataSource);
	//	}


	//	@Override
	//	public Publicacao buscarListaPiblicacoes(String titulo){
	//		String sql = "select * from publicacao";// titulo LIKE ':titulo'";
	//		MapSqlParameterSource params = new MapSqlParameterSource();
	//		params.addValue("titulo", titulo);
	//		return this.jdbcTemplate.queryForObject(sql, new ListaPublicacaoRowMapper());
	//	};
	//
	//
	//	/**
	//	 * Metodo para gerar rowmaper
	//	 */
	//	public static class ListaPublicacaoRowMapper implements RowMapper<Publicacao> {  
	//		public Publicacao mapRow(ResultSet rs, int rowNum) throws SQLException {
	//			Publicacao publicacao = new Publicacao();
	//			publicacao.setId(rs.getInt("id"));
	//			publicacao.setTitulo(rs.getString("titulo"));
	//			publicacao.setPagInicial(rs.getInt("pagina_inicial")); 
	//			publicacao.setPagFinal(rs.getInt("pagina_final")); 
	//			publicacao.setDataPublicacao(rs.getDate("data_publicacao")); 
	//			return publicacao;
	//
	//		}
	//	}

	//	@Override
	//	     public Publicacao buscarListaPiblicacoes(String titulo){
	//	         for (Publicacao object : mock()) {
	//	             if(object.getTitulo().contains(titulo)){
	//	                 return object;
	//	             }
	//	         }
	//	         return null;
	//	     };
	//
	//
	//	private List<Publicacao> mock(){
	//		Publicacao publicacao1 = new Publicacao();
	//		publicacao1.setId(1);
	//		publicacao1.setTitulo("A Cloud-based Architecture for the Internet of Things Targeting Industrial Engine Remote Monitoring. In: Sensors to Cloud Architectures Workshop (SCAW 2015)");
	//		publicacao1.setPagInicial(1);
	//		publicacao1.setPagInicial(100);
	//		publicacao1.setDataPublicacao(new Date());
	//
	//		Publicacao publicacao2 = new Publicacao();
	//		publicacao2.setId(2);
	//		publicacao2.setTitulo("The case for DevOps in scientific applications. In: 2015 IFIP/IEEE International Symposium on Integrated Network Management (IM), 2015, Ottawa. 2015 IFIP/IEEE International Symposium on Integrated Network Management (IM).");
	//		publicacao2.setPagInicial(1398);
	//		publicacao2.setPagInicial(1404);
	//		publicacao2.setDataPublicacao(new Date());
	//
	//		List<Publicacao> list = new ArrayList<Publicacao>();
	//		list.add(publicacao1);
	//		list.add(publicacao2);
	//
	//		return list;
	//
	//
	//	};   


}
