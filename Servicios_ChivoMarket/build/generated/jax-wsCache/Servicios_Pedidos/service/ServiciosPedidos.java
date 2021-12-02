
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios_Pedidos", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiciosPedidos {


    /**
     * 
     * @param devuelto
     * @param idProducto
     * @param cantidad
     * @param idPedido
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ActualizarPedido")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ActualizarPedido", targetNamespace = "http://Service/", className = "service.ActualizarPedido")
    @ResponseWrapper(localName = "ActualizarPedidoResponse", targetNamespace = "http://Service/", className = "service.ActualizarPedidoResponse")
    @Action(input = "http://Service/Servicios_Pedidos/ActualizarPedidoRequest", output = "http://Service/Servicios_Pedidos/ActualizarPedidoResponse")
    public String actualizarPedido(
        @WebParam(name = "ID_Pedido", targetNamespace = "")
        int idPedido,
        @WebParam(name = "ID_Producto", targetNamespace = "")
        int idProducto,
        @WebParam(name = "Cantidad", targetNamespace = "")
        int cantidad,
        @WebParam(name = "Devuelto", targetNamespace = "")
        int devuelto);

    /**
     * 
     * @param id
     * @return
     *     returns java.util.List<service.Pedidos>
     */
    @WebMethod(operationName = "Buscar_Carrito")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Buscar_Carrito", targetNamespace = "http://Service/", className = "service.BuscarCarrito")
    @ResponseWrapper(localName = "Buscar_CarritoResponse", targetNamespace = "http://Service/", className = "service.BuscarCarritoResponse")
    @Action(input = "http://Service/Servicios_Pedidos/Buscar_CarritoRequest", output = "http://Service/Servicios_Pedidos/Buscar_CarritoResponse")
    public List<Pedidos> buscarCarrito(
        @WebParam(name = "ID", targetNamespace = "")
        int id);

    /**
     * 
     * @param precio
     * @param estado
     * @param idUsuario
     * @param cantidad
     * @param idProducto
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Insertar_Carro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Insertar_Carro", targetNamespace = "http://Service/", className = "service.InsertarCarro")
    @ResponseWrapper(localName = "Insertar_CarroResponse", targetNamespace = "http://Service/", className = "service.InsertarCarroResponse")
    @Action(input = "http://Service/Servicios_Pedidos/Insertar_CarroRequest", output = "http://Service/Servicios_Pedidos/Insertar_CarroResponse")
    public String insertarCarro(
        @WebParam(name = "Nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "Precio", targetNamespace = "")
        double precio,
        @WebParam(name = "cantidad", targetNamespace = "")
        int cantidad,
        @WebParam(name = "Estado", targetNamespace = "")
        int estado,
        @WebParam(name = "ID_Usuario", targetNamespace = "")
        int idUsuario,
        @WebParam(name = "ID_Producto", targetNamespace = "")
        int idProducto);

    /**
     * 
     * @param idUSER
     * @param idPedido
     * @return
     *     returns service.Pedidos
     */
    @WebMethod(operationName = "Eliminar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Eliminar", targetNamespace = "http://Service/", className = "service.Eliminar")
    @ResponseWrapper(localName = "EliminarResponse", targetNamespace = "http://Service/", className = "service.EliminarResponse")
    @Action(input = "http://Service/Servicios_Pedidos/EliminarRequest", output = "http://Service/Servicios_Pedidos/EliminarResponse")
    public Pedidos eliminar(
        @WebParam(name = "ID_Pedido", targetNamespace = "")
        int idPedido,
        @WebParam(name = "ID_USER", targetNamespace = "")
        int idUSER);

}
