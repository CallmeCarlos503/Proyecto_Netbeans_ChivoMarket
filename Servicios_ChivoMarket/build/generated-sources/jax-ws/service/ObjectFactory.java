
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

    private final static QName _ActualizarTrabajador_QNAME = new QName("http://Service/", "ActualizarTrabajador");
    private final static QName _ActualizarTrabajadorResponse_QNAME = new QName("http://Service/", "ActualizarTrabajadorResponse");
    private final static QName _EliminarT_QNAME = new QName("http://Service/", "EliminarT");
    private final static QName _EliminarTResponse_QNAME = new QName("http://Service/", "EliminarTResponse");
    private final static QName _InsertarTrabajador_QNAME = new QName("http://Service/", "Insertar_Trabajador");
    private final static QName _InsertarTrabajadorResponse_QNAME = new QName("http://Service/", "Insertar_TrabajadorResponse");
    private final static QName _Listar_QNAME = new QName("http://Service/", "Listar");
    private final static QName _ListarEspecifico_QNAME = new QName("http://Service/", "ListarEspecifico");
    private final static QName _ListarEspecificoResponse_QNAME = new QName("http://Service/", "ListarEspecificoResponse");
    private final static QName _ListarResponse_QNAME = new QName("http://Service/", "ListarResponse");
    private final static QName _ValidarTrabajador_QNAME = new QName("http://Service/", "ValidarTrabajador");
    private final static QName _ValidarTrabajadorResponse_QNAME = new QName("http://Service/", "ValidarTrabajadorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarTrabajador }
     * 
     */
    public ActualizarTrabajador createActualizarTrabajador() {
        return new ActualizarTrabajador();
    }

    /**
     * Create an instance of {@link ActualizarTrabajadorResponse }
     * 
     */
    public ActualizarTrabajadorResponse createActualizarTrabajadorResponse() {
        return new ActualizarTrabajadorResponse();
    }

    /**
     * Create an instance of {@link EliminarT }
     * 
     */
    public EliminarT createEliminarT() {
        return new EliminarT();
    }

    /**
     * Create an instance of {@link EliminarTResponse }
     * 
     */
    public EliminarTResponse createEliminarTResponse() {
        return new EliminarTResponse();
    }

    /**
     * Create an instance of {@link InsertarTrabajador }
     * 
     */
    public InsertarTrabajador createInsertarTrabajador() {
        return new InsertarTrabajador();
    }

    /**
     * Create an instance of {@link InsertarTrabajadorResponse }
     * 
     */
    public InsertarTrabajadorResponse createInsertarTrabajadorResponse() {
        return new InsertarTrabajadorResponse();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarEspecifico }
     * 
     */
    public ListarEspecifico createListarEspecifico() {
        return new ListarEspecifico();
    }

    /**
     * Create an instance of {@link ListarEspecificoResponse }
     * 
     */
    public ListarEspecificoResponse createListarEspecificoResponse() {
        return new ListarEspecificoResponse();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link ValidarTrabajador }
     * 
     */
    public ValidarTrabajador createValidarTrabajador() {
        return new ValidarTrabajador();
    }

    /**
     * Create an instance of {@link ValidarTrabajadorResponse }
     * 
     */
    public ValidarTrabajadorResponse createValidarTrabajadorResponse() {
        return new ValidarTrabajadorResponse();
    }

    /**
     * Create an instance of {@link Trabajador }
     * 
     */
    public Trabajador createTrabajador() {
        return new Trabajador();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarTrabajador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ActualizarTrabajador")
    public JAXBElement<ActualizarTrabajador> createActualizarTrabajador(ActualizarTrabajador value) {
        return new JAXBElement<ActualizarTrabajador>(_ActualizarTrabajador_QNAME, ActualizarTrabajador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarTrabajadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ActualizarTrabajadorResponse")
    public JAXBElement<ActualizarTrabajadorResponse> createActualizarTrabajadorResponse(ActualizarTrabajadorResponse value) {
        return new JAXBElement<ActualizarTrabajadorResponse>(_ActualizarTrabajadorResponse_QNAME, ActualizarTrabajadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "EliminarT")
    public JAXBElement<EliminarT> createEliminarT(EliminarT value) {
        return new JAXBElement<EliminarT>(_EliminarT_QNAME, EliminarT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "EliminarTResponse")
    public JAXBElement<EliminarTResponse> createEliminarTResponse(EliminarTResponse value) {
        return new JAXBElement<EliminarTResponse>(_EliminarTResponse_QNAME, EliminarTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTrabajador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Insertar_Trabajador")
    public JAXBElement<InsertarTrabajador> createInsertarTrabajador(InsertarTrabajador value) {
        return new JAXBElement<InsertarTrabajador>(_InsertarTrabajador_QNAME, InsertarTrabajador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarTrabajadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Insertar_TrabajadorResponse")
    public JAXBElement<InsertarTrabajadorResponse> createInsertarTrabajadorResponse(InsertarTrabajadorResponse value) {
        return new JAXBElement<InsertarTrabajadorResponse>(_InsertarTrabajadorResponse_QNAME, InsertarTrabajadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEspecifico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ListarEspecifico")
    public JAXBElement<ListarEspecifico> createListarEspecifico(ListarEspecifico value) {
        return new JAXBElement<ListarEspecifico>(_ListarEspecifico_QNAME, ListarEspecifico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEspecificoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ListarEspecificoResponse")
    public JAXBElement<ListarEspecificoResponse> createListarEspecificoResponse(ListarEspecificoResponse value) {
        return new JAXBElement<ListarEspecificoResponse>(_ListarEspecificoResponse_QNAME, ListarEspecificoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ListarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarTrabajador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ValidarTrabajador")
    public JAXBElement<ValidarTrabajador> createValidarTrabajador(ValidarTrabajador value) {
        return new JAXBElement<ValidarTrabajador>(_ValidarTrabajador_QNAME, ValidarTrabajador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarTrabajadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ValidarTrabajadorResponse")
    public JAXBElement<ValidarTrabajadorResponse> createValidarTrabajadorResponse(ValidarTrabajadorResponse value) {
        return new JAXBElement<ValidarTrabajadorResponse>(_ValidarTrabajadorResponse_QNAME, ValidarTrabajadorResponse.class, null, value);
    }

}
