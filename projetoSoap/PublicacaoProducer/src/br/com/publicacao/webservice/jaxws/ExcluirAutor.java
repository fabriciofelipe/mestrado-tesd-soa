
package br.com.publicacao.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.16
 * Mon Apr 17 12:25:05 BRT 2017
 * Generated source version: 2.7.16
 */

@XmlRootElement(name = "excluirAutor", namespace = "http://webservice.publicacao.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "excluirAutor", namespace = "http://webservice.publicacao.com.br/")

public class ExcluirAutor {

    @XmlElement(name = "arg0")
    private br.com.autor.vo.Autor arg0;

    public br.com.autor.vo.Autor getArg0() {
        return this.arg0;
    }

    public void setArg0(br.com.autor.vo.Autor newArg0)  {
        this.arg0 = newArg0;
    }

}

