package Unidad4.Tanda2.Ej1;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int edad;
    private final ArrayList<Usuario> amigos;
    private final ArrayList<String> publicaciones;
    // Constructor
    public Usuario(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);
        this.amigos = new ArrayList<>();
        this.publicaciones = new ArrayList<>();
    }

    // Metodos
    public void agregarAmigo(Usuario amigo){
        amigos.add(amigo);
    }
    public void publicarMensaje(String mensaje){
        publicaciones.add(mensaje);
    }
    public void mostrarPerfil(){
        System.out.println("Perfil de "+nombre+",");
        System.out.println("Edad: "+edad);

        if (!amigos.isEmpty()) {
            System.out.println("¡Tienes " + amigos.size() + " amigos!");
            for (Usuario amigo : amigos) {
                System.out.println("\t" + amigo.getNombre());
            }
        } else {
            System.out.println("¡Buscate amigos!");
        }

        if (!publicaciones.isEmpty()) {
            System.out.println("Tus publicaciones: ");
            for (String publicacion : publicaciones){
                System.out.println("\t -"+publicacion);
            }
        } else {
            System.out.println("¡Crea mensajes!");
        }
    }


    //Getter y setters
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
