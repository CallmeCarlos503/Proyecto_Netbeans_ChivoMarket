
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

    private final static QName _ActualizarT_QNAME = new QName("http://Service/", "ActualizarT");
    private final static QName _ActualizarTResponse_QNAME = new QName("http://Service/", "ActualizarTResponse");
    private final static QName _BusquedaT_QNAME = new QName("http://Service/", "BusquedaT");
    private final static QName _BusquedaTResponse_QNAME = new QName("http://Service/", "BusquedaTResponse");
    private final static QName _Cancelar_QNAME = new QName("http://Service/", "Cancelar");
    private final static QName _CancelarResponse_QNAME = new QName("http://Service/", "CancelarResponse");
    private final static QName _Delete_QNAME = new QName("http://Service/", "Delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://Service/", "DeleteResponse");
    private final static QName _Generacion_QNAME = new QName("http://Service/", "Generacion");
    private final static QName _GeneracionResponse_QNAME = new QName("http://Service/", "GeneracionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarT }
     * 
     */
    public ActualizarT createActualizarT() {
        return new ActualizarT();
    }

    /**
     * Create an instance of {@link ActualizarTResponse }
     * 
     */
    public ActualizarTResponse createActualizarTResponse() {
        return new ActualizarTResponse();
    }

    /**
     * Create an instance of {@link BusquedaT }
     * 
     */
    public BusquedaT createBusquedaT() {
        return new BusquedaT();
    }

    /**
     * Create an instance of {@link BusquedaTResponse }
     * 
     */
    public BusquedaTResponse createBusquedaTResponse() {
        return new BusquedaTResponse();
    }

    /**
     * Create an instance of {@link Cancelar }
     * 
     */
    public Cancelar createCancelar() {
        return new Cancelar();
    }

    /**
     * Create an instance of {@link CancelarResponse }
     * 
     */
    public CancelarResponse createCancelarResponse() {
        return new CancelarResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Generacion }
     * 
     */
    public Generacion createGeneracion() {
        return new Generacion();
    }

    /**
     * Create an instance of {@link GeneracionResponse }
     * 
     */
    public GeneracionResponse createGeneracionResponse() {
        return new GeneracionResponse();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ActualizarT")
    public JAXBElement<ActualizarT> createActualizarT(ActualizarT value) {
        return new JAXBElement<ActualizarT>(_ActualizarT_QNAME, ActualizarT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ActualizarTResponse")
    public JAXBElement<ActualizarTResponse> createActualizarTResponse(ActualizarTResponse value) {
        return new JAXBElement<ActualizarTResponse>(_ActualizarTResponse_QNAME, ActualizarTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusquedaT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "BusquedaT")
    public JAXBElement<BusquedaT> createBusquedaT(BusquedaT value) {
        return new JAXBElement<BusquedaT>(_BusquedaT_QNAME, BusquedaT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusquedaTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "BusquedaTResponse")
    public JAXBElement<BusquedaTResponse> createBusquedaTResponse(BusquedaTResponse value) {
        return new JAXBElement<BusquedaTResponse>(_BusquedaTResponse_QNAME, BusquedaTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancelar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Cancelar")
    public JAXBElement<Cancelar> createCancelar(Cancelar value) {
        return new JAXBElement<Cancelar>(_Cancelar_QNAME, Cancelar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "CancelarResponse")
    public JAXBElement<CancelarResponse> createCancelarResponse(CancelarResponse value) {
        return new JAXBElement<CancelarResponse>(_CancelarResponse_QNAME, CancelarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "DeleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Generacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Generacion")
    public JAXBElement<Generacion> createGeneracion(Generacion value) {
        return new JAXBElement<Generacion>(_Generacion_QNAME, Generacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneracionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "GeneracionResponse")
    public JAXBElement<GeneracionResponse> createGeneracionResponse(GeneracionResponse value) {
        return new JAXBElement<GeneracionResponse>(_GeneracionResponse_QNAME, GeneracionResponse.class, null, value);
    }

}
