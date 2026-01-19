package ayudascomuni;

class Empleado extends Persona {
    private double salario;
    private String cargo;
    private String horario;

    public Empleado(String documento, String nombre, String apellido, int edad, String direccion, double salario, String cargo, String horario) {
        super(documento, nombre, apellido, edad, direccion);
        this.salario = salario;
        this.cargo = cargo;
        this.horario = horario;
    }

    @Override
    public void presentarse() {
        System.out.println("========================================");
        System.out.println("Soy " + nombre + " " + apellido);
        System.out.println("Trabajo como " + cargo);
        System.out.println("Mi horario es: " + horario);
        System.out.println("Salario: $" + String.format("%,.0f", salario));
        System.out.println("========================================");
    }

    @Override
    public String toString() {
        return "[EMPLEADO] " + super.toString() + 
               ", Cargo: " + cargo + ", Horario: " + horario + 
               ", Salario: $" + String.format("%,.0f", salario);
    }
}