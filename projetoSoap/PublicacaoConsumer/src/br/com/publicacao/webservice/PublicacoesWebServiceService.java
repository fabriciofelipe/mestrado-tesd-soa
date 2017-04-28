package br.com.publicacao.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.16
 * 2017-04-17T12:33:41.088-03:00
 * Generated source version: 2.7.16
 * 
 */
@WebServiceClient(name = "PublicacoesWebServiceService", 
                  wsdlLocation = "http://localhost:8080/PublicacaoProducer/services/PublicacoesWebServicePort?wsdl",
                  targetNamespace = "http://webservice.publicacao.com.br/") 
public class PublicacoesWebServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.publicacao.com.br/", "PublicacoesWebServiceService");
    public final static QName PublicacoesWebServicePort = new QName("http://webservice.publicacao.com.br/", "PublicacoesWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/PublicacaoProducer/services/PublicacoesWebServicePort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PublicacoesWebServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/PublicacaoProducer/services/PublicacoesWebServicePort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PublicacoesWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PublicacoesWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PublicacoesWebServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PublicacoesWebServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PublicacoesWebServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PublicacoesWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PublicacoesWebService
     */
    @WebEndpoint(name = "PublicacoesWebServicePort")
    public PublicacoesWebService getPublicacoesWebServicePort() {
        return super.getPort(PublicacoesWebServicePort, PublicacoesWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PublicacoesWebService
     */
    @WebEndpoint(name = "PublicacoesWebServicePort")
    public PublicacoesWebService getPublicacoesWebServicePort(WebServiceFeature... features) {
        return super.getPort(PublicacoesWebServicePort, PublicacoesWebService.class, features);
    }

}
