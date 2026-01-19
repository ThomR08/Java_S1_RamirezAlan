package ayudascomuni;

abstract class Persona {
    protected String documento;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String direccion;

    public Persona(String documento, String nombre, String apellido, int edad, String direccion) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public abstract void presentarse();

    public String getDocumento() {
        return documento;
    }

    @Override
    public String toString() {
        return "Documento: " + documento + ", Nombre: " + nombre + " " + apellido + 
               ", Edad: " + edad + ", Dirección: " + direccion;
    }
}