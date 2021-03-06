
package br.com.publicacao.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de autor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="autor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://webservice.publicacao.com.br/}endereco" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autor", propOrder = {
    "cpf",
    "endereco",
    "id",
    "nome",
    "nomeCitacao"
})
public class Autor {

    protected String cpf;
    protected Endereco endereco;
    protected Integer id;
    protected String nome;
    protected String nomeCitacao;

    /**
     * Obt�m o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obt�m o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link Endereco }
     *     
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link Endereco }
     *     
     */
    public void setEndereco(Endereco value) {
        this.endereco = value;
    }

    /**
     * Obt�m o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obt�m o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obt�m o valor da propriedade nomeCitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCitacao() {
        return nomeCitacao;
    }

    /**
     * Define o valor da propriedade nomeCitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCitacao(String value) {
        this.nomeCitacao = value;
    }

	@Override
	public String toString() {
		return "Autor [cpf=" + cpf + ", endereco=" + endereco + ", id=" + id + ", nome=" + nome + ", nomeCitacao="
				+ nomeCitacao + "]";
	}

    
    
}
