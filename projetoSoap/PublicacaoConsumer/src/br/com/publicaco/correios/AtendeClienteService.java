package br.com.publicaco.correios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.16
 * 2017-04-13T13:15:54.628-03:00
 * Generated source version: 2.7.16
 * 
 */
@WebServiceClient(name = "AtendeClienteService", 
                  wsdlLocation = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl",
                  targetNamespace = "http://cliente.bean.master.sigep.bsb.correios.com.br/") 
public class AtendeClienteService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");
    public final static QName AtendeClientePort = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClientePort");
    static {
        URL url = null;
        try {
            url = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AtendeClienteService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AtendeClienteService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AtendeClienteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AtendeClienteService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AtendeClienteService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AtendeClienteService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AtendeClienteService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns AtendeCliente
     */
    @WebEndpoint(name = "AtendeClientePort")
    public AtendeCliente getAtendeClientePort() {
        return super.getPort(AtendeClientePort, AtendeCliente.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AtendeCliente
     */
    @WebEndpoint(name = "AtendeClientePort")
    public AtendeCliente getAtendeClientePort(WebServiceFeature... features) {
        return super.getPort(AtendeClientePort, AtendeCliente.class, features);
    }

}
