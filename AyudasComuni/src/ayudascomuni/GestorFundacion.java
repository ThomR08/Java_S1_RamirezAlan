package ayudascomuni;

import java.util.ArrayList;
import java.util.List;

class GestorFundacion extends Funciones {
    private List<Persona> personas;

    public GestorFundacion() {
        this.personas = new ArrayList<>();
    }

    @Override
    public void registrarPersona(Persona persona) {
        personas.add(persona);
        System.out.println("\n✓ Persona registrada exitosamente!");
    }

    @Override
    public void verPersonas() {
        if (personas.isEmpty()) {
            System.out.println("\nNo hay personas registradas.");
            return;
        }

        
        System.out.println("""
                           ========================================
                           LISTADO DE PERSONAS REGISTRADAS
                           ========================================""");
        
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("\n" + (i + 1) + ". " + personas.get(i));
        }
    }

    public Persona buscarPersona(String documento) {
        for (Persona p : personas) {
            if (p.getDocumento().equals(documento)) {
                return p;
            }
        }
        return null;
    }

    public int totalPersonas() {
        return personas.size();
    }
}