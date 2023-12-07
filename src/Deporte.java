public class Deporte extends Hobbie{

    public String lugar_realizacion;
    public Deporte(String nombre, String tipo, int horas_practica, String lugar_realizacion) {
        super(nombre, tipo, horas_practica);
        this.lugar_realizacion=lugar_realizacion;
    }

    public String getLugar_realizacion() {
        return lugar_realizacion;
    }

    public void mostrar_deporte(){
        System.out.println("\nTu deporte es: "+this.getNombre());
        System.out.println("Tu deporte es de tipo: "+this.getTipo());
        System.out.println("Lo practicas: "+this.getHoras_practica()+" horas");
        System.out.println("Lo juegas en: "+this.getLugar_realizacion());
    }
}
