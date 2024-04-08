package punto3;

import java.util.ArrayList;
import java.util.List;

public class Personas {
    private ArrayList<Persona> personas;

    public Personas(ArrayList<Persona> personas) {
        this.personas = personas;
    }


    public List<Persona> filtrarPor(Filtro filtro) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : this.personas) {
            if (filtro.filtrar(persona)) {
                resultado.add(persona);
            }
        }
        return resultado;
    }
}
