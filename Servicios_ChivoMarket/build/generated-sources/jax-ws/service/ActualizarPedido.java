
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActualizarPedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActualizarPedido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_Pedido" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ID_Producto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Devuelto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualizarPedido", propOrder = {
    "idPedido",
    "idProducto",
    "cantidad",
    "devuelto"
})
public class ActualizarPedido {

    @XmlElement(name = "ID_Pedido")
    protected int idPedido;
    @XmlElement(name = "ID_Producto")
    protected int idProducto;
    @XmlElement(name = "Cantidad")
    protected int cantidad;
    @XmlElement(name = "Devuelto")
    protected int devuelto;

    /**
     * Obtiene el valor de la propiedad idPedido.
     * 
     */
    public int getIDPedido() {
        return idPedido;
    }

    /**
     * Define el valor de la propiedad idPedido.
     * 
     */
    public void setIDPedido(int value) {
        this.idPedido = value;
    }

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     */
    public int getIDProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     */
    public void setIDProducto(int value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad devuelto.
     * 
     */
    public int getDevuelto() {
        return devuelto;
    }

    /**
     * Define el valor de la propiedad devuelto.
     * 
     */
    public void setDevuelto(int value) {
        this.devuelto = value;
    }

}
