
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Eliminar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Eliminar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_Pedido" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ID_USER" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eliminar", propOrder = {
    "idPedido",
    "iduser"
})
public class Eliminar {

    @XmlElement(name = "ID_Pedido")
    protected int idPedido;
    @XmlElement(name = "ID_USER")
    protected int iduser;

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
     * Obtiene el valor de la propiedad iduser.
     * 
     */
    public int getIDUSER() {
        return iduser;
    }

    /**
     * Define el valor de la propiedad iduser.
     * 
     */
    public void setIDUSER(int value) {
        this.iduser = value;
    }

}
