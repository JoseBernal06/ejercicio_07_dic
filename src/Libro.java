public class Libro extends Hobbie{
    public int libros_leidos;

    public Libro(String nombre, String tipo, int horas_practica, int libros_leidos) {
        super(nombre, tipo, horas_practica);
        this.libros_leidos = libros_leidos;
    }

    public int getLibros_leidos() {
        return libros_leidos;
    }

    public void mostrar_libros(){
        System.out.println("\nEl libro que estas leyendo es: "+this.getNombre());
        System.out.println("Tu libro es de genero de: "+this.getTipo());
        System.out.println("Lo lees: "+this.getHoras_practica()+" horas");
        System.out.println("Este ultimo ano leiste: "+this.getLibros_leidos()+" libros");
    }
}
