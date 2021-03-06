
package br.com.publicaco.correios;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.16
 * 2017-04-13T13:15:54.519-03:00
 * Generated source version: 2.7.16
 */

@WebFault(name = "AutenticacaoException", targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/")
public class AutenticacaoException extends java.lang.Exception {
    
    private java.lang.String autenticacaoException;

    public AutenticacaoException() {
        super();
    }
    
    public AutenticacaoException(String message) {
        super(message);
    }
    
    public AutenticacaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutenticacaoException(String message, java.lang.String autenticacaoException) {
        super(message);
        this.autenticacaoException = autenticacaoException;
    }

    public AutenticacaoException(String message, java.lang.String autenticacaoException, Throwable cause) {
        super(message, cause);
        this.autenticacaoException = autenticacaoException;
    }

    public java.lang.String getFaultInfo() {
        return this.autenticacaoException;
    }
}
