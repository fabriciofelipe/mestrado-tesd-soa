
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

@XmlRootElement(name = "alterarPublicacaoResponse", namespace = "http://webservice.publicacao.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarPublicacaoResponse", namespace = "http://webservice.publicacao.com.br/")

public class AlterarPublicacaoResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}
