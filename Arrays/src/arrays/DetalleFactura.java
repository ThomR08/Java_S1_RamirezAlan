package arrays;

public class DetalleFactura {
    
    int cantidad;
    double subTotal;
    Producto producto;

    public DetalleFactura(int cantidad, double subTotal, Producto producto) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.producto = producto;
    }

    public DetalleFactura() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
