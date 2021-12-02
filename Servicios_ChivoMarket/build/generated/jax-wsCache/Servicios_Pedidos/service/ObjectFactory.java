
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

    private final static QName _ActualizarPedido_QNAME = new QName("http://Service/", "ActualizarPedido");
    private final static QName _ActualizarPedidoResponse_QNAME = new QName("http://Service/", "ActualizarPedidoResponse");
    private final static QName _BuscarCarrito_QNAME = new QName("http://Service/", "Buscar_Carrito");
    private final static QName _BuscarCarritoResponse_QNAME = new QName("http://Service/", "Buscar_CarritoResponse");
    private final static QName _Eliminar_QNAME = new QName("http://Service/", "Eliminar");
    private final static QName _EliminarResponse_QNAME = new QName("http://Service/", "EliminarResponse");
    private final static QName _InsertarCarro_QNAME = new QName("http://Service/", "Insertar_Carro");
    private final static QName _InsertarCarroResponse_QNAME = new QName("http://Service/", "Insertar_CarroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarPedido }
     * 
     */
    public ActualizarPedido createActualizarPedido() {
        return new ActualizarPedido();
    }

    /**
     * Create an instance of {@link ActualizarPedidoResponse }
     * 
     */
    public ActualizarPedidoResponse createActualizarPedidoResponse() {
        return new ActualizarPedidoResponse();
    }

    /**
     * Create an instance of {@link BuscarCarrito }
     * 
     */
    public BuscarCarrito createBuscarCarrito() {
        return new BuscarCarrito();
    }

    /**
     * Create an instance of {@link BuscarCarritoResponse }
     * 
     */
    public BuscarCarritoResponse createBuscarCarritoResponse() {
        return new BuscarCarritoResponse();
    }

    /**
     * Create an instance of {@link Eliminar }
     * 
     */
    public Eliminar createEliminar() {
        return new Eliminar();
    }

    /**
     * Create an instance of {@link EliminarResponse }
     * 
     */
    public EliminarResponse createEliminarResponse() {
        return new EliminarResponse();
    }

    /**
     * Create an instance of {@link InsertarCarro }
     * 
     */
    public InsertarCarro createInsertarCarro() {
        return new InsertarCarro();
    }

    /**
     * Create an instance of {@link InsertarCarroResponse }
     * 
     */
    public InsertarCarroResponse createInsertarCarroResponse() {
        return new InsertarCarroResponse();
    }

    /**
     * Create an instance of {@link Pedidos }
     * 
     */
    public Pedidos createPedidos() {
        return new Pedidos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ActualizarPedido")
    public JAXBElement<ActualizarPedido> createActualizarPedido(ActualizarPedido value) {
        return new JAXBElement<ActualizarPedido>(_ActualizarPedido_QNAME, ActualizarPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ActualizarPedidoResponse")
    public JAXBElement<ActualizarPedidoResponse> createActualizarPedidoResponse(ActualizarPedidoResponse value) {
        return new JAXBElement<ActualizarPedidoResponse>(_ActualizarPedidoResponse_QNAME, ActualizarPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCarrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Buscar_Carrito")
    public JAXBElement<BuscarCarrito> createBuscarCarrito(BuscarCarrito value) {
        return new JAXBElement<BuscarCarrito>(_BuscarCarrito_QNAME, BuscarCarrito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCarritoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Buscar_CarritoResponse")
    public JAXBElement<BuscarCarritoResponse> createBuscarCarritoResponse(BuscarCarritoResponse value) {
        return new JAXBElement<BuscarCarritoResponse>(_BuscarCarritoResponse_QNAME, BuscarCarritoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Eliminar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Eliminar")
    public JAXBElement<Eliminar> createEliminar(Eliminar value) {
        return new JAXBElement<Eliminar>(_Eliminar_QNAME, Eliminar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "EliminarResponse")
    public JAXBElement<EliminarResponse> createEliminarResponse(EliminarResponse value) {
        return new JAXBElement<EliminarResponse>(_EliminarResponse_QNAME, EliminarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCarro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Insertar_Carro")
    public JAXBElement<InsertarCarro> createInsertarCarro(InsertarCarro value) {
        return new JAXBElement<InsertarCarro>(_InsertarCarro_QNAME, InsertarCarro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCarroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Insertar_CarroResponse")
    public JAXBElement<InsertarCarroResponse> createInsertarCarroResponse(InsertarCarroResponse value) {
        return new JAXBElement<InsertarCarroResponse>(_InsertarCarroResponse_QNAME, InsertarCarroResponse.class, null, value);
    }

}
