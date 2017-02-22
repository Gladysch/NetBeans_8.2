package com.mitocode.bean;

import com.mitocode.model.DetalleVenta;
import com.mitocode.model.Producto;
import com.mitocode.model.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class VentaBean {
    private Venta venta = new Venta();
    private Producto producto = new Producto();
    private int cantidad;
    private List<DetalleVenta> lista = new ArrayList();

    public List<DetalleVenta> getLista() {
        return lista;
    }

    public void setLista(List<DetalleVenta> lista) {
        this.lista = lista;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    public void agregar(){
        DetalleVenta det = new DetalleVenta();
        det.setCantidad(cantidad);
        det.setProducto(producto);
        this.lista.add(det);
    }
    
    public void registrar(){
        
    }
}
