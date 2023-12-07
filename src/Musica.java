public class Musica extends Hobbie{

    public int tiempo_practicado;

    public Musica(String nombre, String tipo, int horas_practica, int tiempo_practicado) {
        super(nombre, tipo, horas_practica);
        this.tiempo_practicado=tiempo_practicado;
    }

    public int getTiempo_practicado() {
        return tiempo_practicado;
    }

    public void mostrar_musica(){
        System.out.println("\nTocas este instrumento: "+this.getNombre());
        System.out.println("Tu instrumento que tocas es de tipo: "+this.getTipo());
        System.out.println("Lo practicas: "+this.getHoras_practica()+ " horas");
        System.out.println("Lo practicas: "+this.getTiempo_practicado()+ " anos");

    }
}
