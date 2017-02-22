package com.mitocode.dao;

import com.mitocode.model.DetalleVenta;
import com.mitocode.model.Venta;
import java.sql.PreparedStatement;
import java.util.List;

public class VentaDAO extends DAO {
    
    public void registrar( Venta venta, List<DetalleVenta> lista ) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.getCn().prepareStatement("INSERT INTO Venta (fecha, codPersona, monto) values(?,?,?)");
            st.setDate(1, venta.getFecha());
            st.setInt(2, venta.getPersona().getCodigo());
            st.setDouble(2, venta.getMonto());
            st.executeUpdate();
            
            PreparedStatement st2 = this.getCn().prepareStatement("INSERT INTO Venta (fecha, codPersona, monto) values(?,?,?)");
            st.setDate(1, venta.getFecha());
            st.setInt(2, venta.getPersona().getCodigo());
            st.setDouble(2, venta.getMonto());
            st.executeUpdate();
            
        } catch ( Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }
}
