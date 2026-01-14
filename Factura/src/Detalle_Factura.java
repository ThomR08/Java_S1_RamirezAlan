/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
package factura;

/**
 *
 
@author camper*/
public class Detalle_Factura {
    String cedula;
    String nombre;
    String apellido;
    String productos;
    int dia;
    double total;

    public Detalle_Factura(String cedula, String nombre, String apellido, String productos, int dia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.productos = productos; // 50.000, 90.000, 150.000, 250.000
        this.dia = dia;
        this.total = calcularTotal();
    }

    double calcularTotal() {
        double total_aux = 0; 
        if(productos.split(",").length==1){
            total_aux = Double.parseDouble(productos);
        } else {
            for (int i = 0; i < productos.split(",").length; i++) {
                total_aux += Double.parseDouble(productos.split(",")[i]);
            }
        }
        return total_aux;

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getTotal() {
        return total;
    }

}