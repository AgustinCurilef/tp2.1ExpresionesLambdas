package punto3;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Eduardo", "López");
        Persona persona2 = new Persona("Fernando", "Martínez");
        Persona persona3 = new Persona("Juan", "Pérez");
        Persona persona4 = new Persona("Emilia", "García");
        Persona persona5 = new Persona("María", "Rodríguez");
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        Personas personas = new Personas(listaPersonas);
        var pares = personas.filtrarPor(p -> p.nombre().length() % 2 == 0);
        var withE = personas.filtrarPor(p -> p.nombre().startsWith("E"));
        System.out.println("Personas con nombre par\n");
        pares.forEach(persona -> System.out.println(persona.toString() + "\n"));
        System.out.println("Personas con nombre que comienza con E\n");
        withE.forEach(persona -> System.out.println(persona.toString() + "\n"));
    }
}
