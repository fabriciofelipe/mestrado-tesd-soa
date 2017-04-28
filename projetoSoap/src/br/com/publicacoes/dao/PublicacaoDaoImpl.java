/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.publicacoes.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.publicacoes.vo.Publicacao;

/**
 *
 * @author labccet
 */
@Repository
public class PublicacaoDaoImpl implements PublicacaoDao{

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
	
	@Override
	     public Publicacao buscarListaPiblicacoes(String titulo){
	         for (Publicacao object : mock()) {
	             if(object.getTitulo().contains(titulo)){
	                 return object;
	             }
	         }
	         return null;
	     };


	private List<Publicacao> mock(){
		Publicacao publicacao1 = new Publicacao();
		publicacao1.setId(1);
		publicacao1.setTitulo("A Cloud-based Architecture for the Internet of Things Targeting Industrial Engine Remote Monitoring. In: Sensors to Cloud Architectures Workshop (SCAW 2015)");
		publicacao1.setPagInicial(1);
		publicacao1.setPagInicial(100);
		publicacao1.setDataPublicacao(new Date());

		Publicacao publicacao2 = new Publicacao();
		publicacao2.setId(2);
		publicacao2.setTitulo("The case for DevOps in scientific applications. In: 2015 IFIP/IEEE International Symposium on Integrated Network Management (IM), 2015, Ottawa. 2015 IFIP/IEEE International Symposium on Integrated Network Management (IM).");
		publicacao2.setPagInicial(1398);
		publicacao2.setPagInicial(1404);
		publicacao2.setDataPublicacao(new Date());

		List<Publicacao> list = new ArrayList<Publicacao>();
		list.add(publicacao1);
		list.add(publicacao2);

		return list;


	};   


}
