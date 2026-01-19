package arrays;

import java.util.ArrayList;

public class Factura {
    
    String nombre, cedula, fecha;
    double total;
    ArrayList<DetalleFactura> dtllFactura = new ArrayList<>();

    public Factura() {
    }

    public Factura(String nombre, String cedula, String fecha, double total) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fecha = fecha;
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<DetalleFactura> getDtllFactura() {
        return dtllFactura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDtllFactura(ArrayList<DetalleFactura> dtllFactura) {
        this.dtllFactura = dtllFactura;
    }
    
}
