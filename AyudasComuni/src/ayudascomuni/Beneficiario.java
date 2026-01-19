package ayudascomuni;

class Beneficiario extends Persona {
    private int ayudasMes;
    private static final int MAX_AYUDAS = 5;

    public Beneficiario(String documento, String nombre, String apellido, int edad, 
                        String direccion, int ayudasMes) {
        super(documento, nombre, apellido, edad, direccion);
        this.ayudasMes = Math.min(ayudasMes, MAX_AYUDAS);
    }

    @Override
    public void presentarse() {
        System.out.println("========================================");
        System.out.println("Soy " + nombre + " " + apellido);
        System.out.println("Recibo ayuda de la fundación");
        System.out.println("Ayudas mensuales: " + ayudasMes + " (máximo " + MAX_AYUDAS + ")");
        System.out.println("========================================");
    }

    @Override
    public String toString() {
        return "[BENEFICIARIO] " + super.toString() + 
               ", Ayudas/mes: " + ayudasMes;
    }
}