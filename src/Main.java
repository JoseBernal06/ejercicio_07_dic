
public class Main {
    public static void main(String[] args) {

        Deporte deporte_uno;
        Musica musica_uno;
        Libro libro_uno;

        deporte_uno= new Deporte("Box","contacto", 2,"GYM");
        musica_uno=new Musica("Piano", "cuerda",1,3);
        libro_uno=new Libro("Pulp","realismo sucio",2,3);

        deporte_uno.mostrar_deporte();
        musica_uno.mostrar_musica();
        libro_uno.mostrar_libros();
    }
}