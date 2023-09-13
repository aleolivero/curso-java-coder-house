import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Main{

    public static class Persona{
        private String nombre;
        private String apellido;
        
        public String getNombre(){
            return nombre;
        }
        
        public String getApellido(){
            return apellido;
        }

        public void  setNombre(String nombre){
            this.nombre = nombre;
        }

        public void  setApellido(String apellido){
            this.apellido = apellido;
        }
    }

    public static void printListaPersonas(List<Persona> listaPersonas){
        for (Persona persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
        }

    }

    public static void main(String[] args) {
        
        Persona primeraPersona = new Persona();
        Persona segundaPersona = new Persona();
        Persona terceraPersona = new Persona();
        Persona cuartaPersona = new Persona();
        Persona quintaPersona = new Persona();

        primeraPersona.setNombre("Cedric");
        primeraPersona.setApellido("Bergandi");

        segundaPersona.setNombre("Aylen");
        segundaPersona.setApellido("Torres");

        terceraPersona.setNombre("Alexis");
        terceraPersona.setApellido("Olivero");
        
        cuartaPersona.setNombre("Magali");
        cuartaPersona.setApellido("Gerbaldo");

        quintaPersona.setNombre("Lucas");
        quintaPersona.setApellido("Gonzalez");

        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(primeraPersona);
        listaPersonas.add(segundaPersona);
        listaPersonas.add(terceraPersona);
        listaPersonas.add(cuartaPersona);
        listaPersonas.add(quintaPersona);


        // Imprimir la lista de personas
        System.out.println("Lista original:");

        printListaPersonas(listaPersonas);

        // Ordenar por nombre
        Collections.sort(listaPersonas, (personaUno, personaDos) -> personaUno.getNombre().compareTo(personaDos.getNombre()));
        System.out.println("Lista ordenada por nombre:");
        printListaPersonas(listaPersonas);

        // Ordenar por apellido
        Collections.sort(listaPersonas, (personaUno, personaDos) -> personaUno.getApellido().compareTo(personaDos.getApellido()));
        System.out.println("Lista ordenada por apellido:");
        printListaPersonas(listaPersonas);

        // Ordenar por apellido inverso
        Collections.sort(listaPersonas, (personaUno, personaDos) -> personaDos.getApellido().compareTo(personaUno.getApellido()));
        System.out.println("Lista ordenada inversamente por apellido:");
        printListaPersonas(listaPersonas);




    }

}