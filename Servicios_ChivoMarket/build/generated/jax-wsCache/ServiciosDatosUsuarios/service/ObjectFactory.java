
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Registrarse_QNAME = new QName("http://Service/", "Registrarse");
    private final static QName _RegistrarseResponse_QNAME = new QName("http://Service/", "RegistrarseResponse");
    private final static QName _ValidarUsuario_QNAME = new QName("http://Service/", "ValidarUsuario");
    private final static QName _ValidarUsuarioResponse_QNAME = new QName("http://Service/", "ValidarUsuarioResponse");
    private final static QName _Verificar_QNAME = new QName("http://Service/", "Verificar");
    private final static QName _VerificarResponse_QNAME = new QName("http://Service/", "VerificarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Registrarse }
     * 
     */
    public Registrarse createRegistrarse() {
        return new Registrarse();
    }

    /**
     * Create an instance of {@link RegistrarseResponse }
     * 
     */
    public RegistrarseResponse createRegistrarseResponse() {
        return new RegistrarseResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuario }
     * 
     */
    public ValidarUsuario createValidarUsuario() {
        return new ValidarUsuario();
    }

    /**
     * Create an instance of {@link ValidarUsuarioResponse }
     * 
     */
    public ValidarUsuarioResponse createValidarUsuarioResponse() {
        return new ValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link Verificar }
     * 
     */
    public Verificar createVerificar() {
        return new Verificar();
    }

    /**
     * Create an instance of {@link VerificarResponse }
     * 
     */
    public VerificarResponse createVerificarResponse() {
        return new VerificarResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registrarse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Registrarse")
    public JAXBElement<Registrarse> createRegistrarse(Registrarse value) {
        return new JAXBElement<Registrarse>(_Registrarse_QNAME, Registrarse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "RegistrarseResponse")
    public JAXBElement<RegistrarseResponse> createRegistrarseResponse(RegistrarseResponse value) {
        return new JAXBElement<RegistrarseResponse>(_RegistrarseResponse_QNAME, RegistrarseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ValidarUsuario")
    public JAXBElement<ValidarUsuario> createValidarUsuario(ValidarUsuario value) {
        return new JAXBElement<ValidarUsuario>(_ValidarUsuario_QNAME, ValidarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ValidarUsuarioResponse")
    public JAXBElement<ValidarUsuarioResponse> createValidarUsuarioResponse(ValidarUsuarioResponse value) {
        return new JAXBElement<ValidarUsuarioResponse>(_ValidarUsuarioResponse_QNAME, ValidarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verificar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Verificar")
    public JAXBElement<Verificar> createVerificar(Verificar value) {
        return new JAXBElement<Verificar>(_Verificar_QNAME, Verificar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "VerificarResponse")
    public JAXBElement<VerificarResponse> createVerificarResponse(VerificarResponse value) {
        return new JAXBElement<VerificarResponse>(_VerificarResponse_QNAME, VerificarResponse.class, null, value);
    }

}
