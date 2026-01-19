package ayudascomuni;

class Colaborador extends Persona {
    private int horasMes;
    private static final int PAGO_POR_HORA = 55000;
    private static final int MAX_HORAS = 25;

    public Colaborador(String documento, String nombre, String apellido, int edad, String direccion, int horasMes) {
        super(documento, nombre, apellido, edad, direccion);
        this.horasMes = Math.min(horasMes, MAX_HORAS);
    }

    public double calcularBonificacion() {
        return horasMes * PAGO_POR_HORA;
    }

    @Override
    public void presentarse() {
        System.out.println("========================================");
        System.out.println("Soy " + nombre + " " + apellido);
        System.out.println("Colaboro voluntariamente con la fundación");
        System.out.println("Horas mensuales: " + horasMes + " (máximo " + MAX_HORAS + ")");
        System.out.println("Bonificación mensual: $" + String.format("%,.0f", calcularBonificacion()));
        System.out.println("========================================");
    }

    @Override
    public String toString() {
        return "[COLABORADOR] " + super.toString() + 
               ", Horas/mes: " + horasMes + 
               ", Bonificación: $" + String.format("%,.0f", calcularBonificacion());
    }
}