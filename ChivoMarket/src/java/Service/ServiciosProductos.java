/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Modelo.Pedidos;
import Modelo.PedidosDAO;
import Modelo.Productos;
import Modelo.ProductosDAO;
import java.sql.ResultSet;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carlo
 */
@WebService(serviceName = "ServiciosProductos")
public class ServiciosProductos {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarProducto")
    public List<Productos> listarProducto() {
       ProductosDAO DAO= new ProductosDAO();
       List datos=DAO.ListarProductos();
       return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Buscar")
    public List<Productos> Buscar(@WebParam(name = "ID_Categoria") int ID_Categoria) {
         ProductosDAO DAO= new ProductosDAO();
       List datos=DAO.Busqueda(ID_Categoria);
       
       return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Actualizar_Cantidad")
    public String Actualizar_Cantidad(@WebParam(name = "ID") int ID, @WebParam(name = "Cantidad") int Cantidad) {
       ProductosDAO DAO= new ProductosDAO();
       String datos=DAO.Cambiar_Cantidad(ID, Cantidad);
       return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Busqueda_ID_Producto")
    public List<Productos> Busqueda_ID_Producto(@WebParam(name = "ID") int ID) {
       ProductosDAO DAO= new ProductosDAO();
       List datos=DAO.BusquedaporPorducto(ID);
       
       return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CambiarDatosProductos")
    public String CambiarDatosProductos(@WebParam(name = "Nombre_Producto") String Nombre_Producto, @WebParam(name = "ID") int ID, @WebParam(name = "Cantidad") int Cantidad, @WebParam(name = "precio") double precio, @WebParam(name = "ID_CAT") int ID_CAT, @WebParam(name = "IMAGEN") String IMAGEN, @WebParam(name = "Descripcion") String Descripcion) {
        ProductosDAO DAO= new ProductosDAO();
        String Datos=DAO.Actualzar_Producto(Nombre_Producto, ID, Cantidad, precio, ID_CAT, IMAGEN,Descripcion);
        return Datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarP")
    public Productos EliminarP(@WebParam(name = "ID_Producto") int ID_Producto){
        Productos pe= new Productos();
        ProductosDAO D= new ProductosDAO();
        pe=D.EliminarP(ID_Producto);
        return pe;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Agregar_Producto")
    public String Agregar_Producto(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "Imagen") String Imagen, @WebParam(name = "precio") double precio, @WebParam(name = "cantidad") int cantidad, @WebParam(name = "ID_Categoria") int ID_Categoria, @WebParam(name = "Descripcion") String Descripcion) {
        ProductosDAO D= new ProductosDAO();
        String Datos;
        Datos=D.AgregarP(Nombre, Imagen, precio, cantidad, ID_Categoria,Descripcion);
        return Datos;
    }








}
