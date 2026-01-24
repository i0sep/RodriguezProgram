package Unidad4.Tanda2.Ej1;

public class Main {
    public static void main(String[] args) {
        Usuario yo = new Usuario("iosep",21);
        Usuario nono = new Usuario("nono",1);
        Usuario marley = new Usuario("Marley",1);
        Usuario mars = new Usuario("Mars",29);
        Usuario paloma = new Usuario("Paloma",25);
        yo.agregarAmigo(nono);
        yo.publicarMensaje("Hola nono");
        yo.agregarAmigo(marley);
        yo.publicarMensaje("Hola Marley");
        //yo.mostrarPerfil();
        //mars.mostrarPerfil();
        paloma.mostrarPerfil();
    }
}
