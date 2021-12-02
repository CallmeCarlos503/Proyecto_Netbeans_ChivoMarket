
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

    private final static QName _ActualizarCantidad_QNAME = new QName("http://Service/", "Actualizar_Cantidad");
    private final static QName _ActualizarCantidadResponse_QNAME = new QName("http://Service/", "Actualizar_CantidadResponse");
    private final static QName _AgregarProducto_QNAME = new QName("http://Service/", "Agregar_Producto");
    private final static QName _AgregarProductoResponse_QNAME = new QName("http://Service/", "Agregar_ProductoResponse");
    private final static QName _Buscar_QNAME = new QName("http://Service/", "Buscar");
    private final static QName _BuscarResponse_QNAME = new QName("http://Service/", "BuscarResponse");
    private final static QName _BusquedaIDProducto_QNAME = new QName("http://Service/", "Busqueda_ID_Producto");
    private final static QName _BusquedaIDProductoResponse_QNAME = new QName("http://Service/", "Busqueda_ID_ProductoResponse");
    private final static QName _CambiarDatosProductos_QNAME = new QName("http://Service/", "CambiarDatosProductos");
    private final static QName _CambiarDatosProductosResponse_QNAME = new QName("http://Service/", "CambiarDatosProductosResponse");
    private final static QName _EliminarP_QNAME = new QName("http://Service/", "EliminarP");
    private final static QName _EliminarPResponse_QNAME = new QName("http://Service/", "EliminarPResponse");
    private final static QName _ListarProducto_QNAME = new QName("http://Service/", "listarProducto");
    private final static QName _ListarProductoResponse_QNAME = new QName("http://Service/", "listarProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarCantidad }
     * 
     */
    public ActualizarCantidad createActualizarCantidad() {
        return new ActualizarCantidad();
    }

    /**
     * Create an instance of {@link ActualizarCantidadResponse }
     * 
     */
    public ActualizarCantidadResponse createActualizarCantidadResponse() {
        return new ActualizarCantidadResponse();
    }

    /**
     * Create an instance of {@link AgregarProducto }
     * 
     */
    public AgregarProducto createAgregarProducto() {
        return new AgregarProducto();
    }

    /**
     * Create an instance of {@link AgregarProductoResponse }
     * 
     */
    public AgregarProductoResponse createAgregarProductoResponse() {
        return new AgregarProductoResponse();
    }

    /**
     * Create an instance of {@link Buscar }
     * 
     */
    public Buscar createBuscar() {
        return new Buscar();
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link BusquedaIDProducto }
     * 
     */
    public BusquedaIDProducto createBusquedaIDProducto() {
        return new BusquedaIDProducto();
    }

    /**
     * Create an instance of {@link BusquedaIDProductoResponse }
     * 
     */
    public BusquedaIDProductoResponse createBusquedaIDProductoResponse() {
        return new BusquedaIDProductoResponse();
    }

    /**
     * Create an instance of {@link CambiarDatosProductos }
     * 
     */
    public CambiarDatosProductos createCambiarDatosProductos() {
        return new CambiarDatosProductos();
    }

    /**
     * Create an instance of {@link CambiarDatosProductosResponse }
     * 
     */
    public CambiarDatosProductosResponse createCambiarDatosProductosResponse() {
        return new CambiarDatosProductosResponse();
    }

    /**
     * Create an instance of {@link EliminarP }
     * 
     */
    public EliminarP createEliminarP() {
        return new EliminarP();
    }

    /**
     * Create an instance of {@link EliminarPResponse }
     * 
     */
    public EliminarPResponse createEliminarPResponse() {
        return new EliminarPResponse();
    }

    /**
     * Create an instance of {@link ListarProducto }
     * 
     */
    public ListarProducto createListarProducto() {
        return new ListarProducto();
    }

    /**
     * Create an instance of {@link ListarProductoResponse }
     * 
     */
    public ListarProductoResponse createListarProductoResponse() {
        return new ListarProductoResponse();
    }

    /**
     * Create an instance of {@link Productos }
     * 
     */
    public Productos createProductos() {
        return new Productos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCantidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Actualizar_Cantidad")
    public JAXBElement<ActualizarCantidad> createActualizarCantidad(ActualizarCantidad value) {
        return new JAXBElement<ActualizarCantidad>(_ActualizarCantidad_QNAME, ActualizarCantidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCantidadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Actualizar_CantidadResponse")
    public JAXBElement<ActualizarCantidadResponse> createActualizarCantidadResponse(ActualizarCantidadResponse value) {
        return new JAXBElement<ActualizarCantidadResponse>(_ActualizarCantidadResponse_QNAME, ActualizarCantidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Agregar_Producto")
    public JAXBElement<AgregarProducto> createAgregarProducto(AgregarProducto value) {
        return new JAXBElement<AgregarProducto>(_AgregarProducto_QNAME, AgregarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Agregar_ProductoResponse")
    public JAXBElement<AgregarProductoResponse> createAgregarProductoResponse(AgregarProductoResponse value) {
        return new JAXBElement<AgregarProductoResponse>(_AgregarProductoResponse_QNAME, AgregarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buscar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Buscar")
    public JAXBElement<Buscar> createBuscar(Buscar value) {
        return new JAXBElement<Buscar>(_Buscar_QNAME, Buscar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "BuscarResponse")
    public JAXBElement<BuscarResponse> createBuscarResponse(BuscarResponse value) {
        return new JAXBElement<BuscarResponse>(_BuscarResponse_QNAME, BuscarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusquedaIDProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Busqueda_ID_Producto")
    public JAXBElement<BusquedaIDProducto> createBusquedaIDProducto(BusquedaIDProducto value) {
        return new JAXBElement<BusquedaIDProducto>(_BusquedaIDProducto_QNAME, BusquedaIDProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusquedaIDProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "Busqueda_ID_ProductoResponse")
    public JAXBElement<BusquedaIDProductoResponse> createBusquedaIDProductoResponse(BusquedaIDProductoResponse value) {
        return new JAXBElement<BusquedaIDProductoResponse>(_BusquedaIDProductoResponse_QNAME, BusquedaIDProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarDatosProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "CambiarDatosProductos")
    public JAXBElement<CambiarDatosProductos> createCambiarDatosProductos(CambiarDatosProductos value) {
        return new JAXBElement<CambiarDatosProductos>(_CambiarDatosProductos_QNAME, CambiarDatosProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CambiarDatosProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "CambiarDatosProductosResponse")
    public JAXBElement<CambiarDatosProductosResponse> createCambiarDatosProductosResponse(CambiarDatosProductosResponse value) {
        return new JAXBElement<CambiarDatosProductosResponse>(_CambiarDatosProductosResponse_QNAME, CambiarDatosProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "EliminarP")
    public JAXBElement<EliminarP> createEliminarP(EliminarP value) {
        return new JAXBElement<EliminarP>(_EliminarP_QNAME, EliminarP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "EliminarPResponse")
    public JAXBElement<EliminarPResponse> createEliminarPResponse(EliminarPResponse value) {
        return new JAXBElement<EliminarPResponse>(_EliminarPResponse_QNAME, EliminarPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "listarProducto")
    public JAXBElement<ListarProducto> createListarProducto(ListarProducto value) {
        return new JAXBElement<ListarProducto>(_ListarProducto_QNAME, ListarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "listarProductoResponse")
    public JAXBElement<ListarProductoResponse> createListarProductoResponse(ListarProductoResponse value) {
        return new JAXBElement<ListarProductoResponse>(_ListarProductoResponse_QNAME, ListarProductoResponse.class, null, value);
    }

}
