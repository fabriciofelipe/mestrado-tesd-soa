
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

@XmlRootElement(name = "isCPFResponse", namespace = "http://webservice.publicacao.com.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "isCPFResponse", namespace = "http://webservice.publicacao.com.br/")

public class IsCPFResponse {

    @XmlElement(name = "return")
    private boolean _return;

    public boolean getReturn() {
        return this._return;
    }

    public void setReturn(boolean new_return)  {
        this._return = new_return;
    }

}

