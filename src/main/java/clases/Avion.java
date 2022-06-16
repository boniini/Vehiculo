package clases;
import acciones.Acciones;
 public class Avion extends Vehiculo implements Acciones{
    private int Ocupantes;

    public Avion(int Ocupantes, String nombre, String modelo, int anioFabricacion) {
        super(nombre, modelo, anioFabricacion);
        this.Ocupantes = Ocupantes;
    }

    public int getOcupantes() {
        return Ocupantes;
    }

    public void setOcupantes(int Ocupantes) {
        this.Ocupantes = Ocupantes;
    }

    @Override
    public void encender() {
        System.out.println("El avion enciende las turbinas");
    }

    @Override
    public void frenar() {
        System.out.println("El avion enpieza a desaselerar");
    }

    @Override
    public void apagar() {
        System.out.println("El avion apaga las turbinas");
    } 

    @Override
    public void acelerar() {
        System.out.println("El avion empieza a acelerar");
    }
}
