
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Delete complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Delete"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_Ticket" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ID_Producto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delete", propOrder = {
    "idTicket",
    "idProducto",
    "cantidad"
})
public class Delete {

    @XmlElement(name = "ID_Ticket")
    protected int idTicket;
    @XmlElement(name = "ID_Producto")
    protected int idProducto;
    @XmlElement(name = "Cantidad")
    protected int cantidad;

    /**
     * Obtiene el valor de la propiedad idTicket.
     * 
     */
    public int getIDTicket() {
        return idTicket;
    }

    /**
     * Define el valor de la propiedad idTicket.
     * 
     */
    public void setIDTicket(int value) {
        this.idTicket = value;
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

}
