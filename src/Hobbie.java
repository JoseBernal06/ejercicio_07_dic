public class Hobbie {
    public String nombre;
    public String tipo;
    public int horas_practica;

    public Hobbie(String nombre,String tipo, int horas_practica){
        this.nombre=nombre;
        this.tipo=tipo;
        this.horas_practica=horas_practica;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getHoras_practica() {
        return horas_practica;
    }

    public void mostrar_hobbie(){
        System.out.println("Tu hobbie es: "+this.getNombre());
        System.out.println("Tu hobbie es de tipo: "+this.getTipo());
        System.out.println("Lo practicas: "+this.getHoras_practica() +" horas");
    }
}
