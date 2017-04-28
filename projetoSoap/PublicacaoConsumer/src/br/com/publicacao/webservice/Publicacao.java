
package br.com.publicacao.webservice;

import java.text.ParseException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.publicacao.util.DateUtil;


/**
 * <p>Classe Java de publicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="publicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPublicacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pagFinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pagInicial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicacao", propOrder = {
    "dataPublicacao",
    "id",
    "pagFinal",
    "pagInicial",
    "titulo"
})
public class Publicacao {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPublicacao;
    protected Integer id;
    protected Integer pagFinal;
    protected Integer pagInicial;
    protected String titulo;

    /**
     * Obt�m o valor da propriedade dataPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * Define o valor da propriedade dataPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPublicacao(XMLGregorianCalendar value) {
        this.dataPublicacao = value;
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
     * Obt�m o valor da propriedade pagFinal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPagFinal() {
        return pagFinal;
    }

    /**
     * Define o valor da propriedade pagFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPagFinal(Integer value) {
        this.pagFinal = value;
    }

    /**
     * Obt�m o valor da propriedade pagInicial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPagInicial() {
        return pagInicial;
    }

    /**
     * Define o valor da propriedade pagInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPagInicial(Integer value) {
        this.pagInicial = value;
    }

    /**
     * Obt�m o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }
    
    public void setDataConverter(String s){
    	try {
			setDataPublicacao(DateUtil.stringToXMLGregorianCalendar(s));
		} catch (DatatypeConfigurationException | ParseException e) {
			e.printStackTrace();
		}
    }

	@Override
	public String toString() {
		return "Publicacao [dataPublicacao=" + dataPublicacao + ", id=" + id + ", pagFinal=" + pagFinal
				+ ", pagInicial=" + pagInicial + ", titulo=" + titulo + "]";
	}

}