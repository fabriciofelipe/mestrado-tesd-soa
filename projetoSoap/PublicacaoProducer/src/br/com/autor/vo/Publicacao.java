/*
 * To change this license header, choose License Headers in Project Propertie
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.autor.vo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author labccet
 */
public class Publicacao implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String titulo;
    private Integer pagInicial;
    private Integer pagFinal;
    private Date dataPublicacao;

    public Publicacao(){}
    
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the pagInicial
     */
    public Integer getPagInicial() {
        return pagInicial;
    }

    /**
     * @param pagInicial the pagInicial to set
     */
    public void setPagInicial(Integer pagInicial) {
        this.pagInicial = pagInicial;
    }

    /**
     * @return the pagFinal
     */
    public Integer getPagFinal() {
        return pagFinal;
    }

    /**
     * @param pagFinal the pagFinal to set
     */
    public void setPagFinal(Integer pagFinal) {
        this.pagFinal = pagFinal;
    }

    /**
     * @return the dataPublicacao
     */
    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * @param dataPublicacao the dataPublicacao to set
     */
    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

	@Override
	public String toString() {
		return "Publicacao [id=" + id + ", titulo=" + titulo + ", pagInicial=" + pagInicial + ", pagFinal=" + pagFinal
				+ ", dataPublicacao=" + dataPublicacao + "]";
	}

   
    
    
}
