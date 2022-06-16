package clases;
import acciones.Acciones;
public class Camion extends Vehiculo implements Acciones {
    private int pesomaximo;

    public Camion(int pesomaximo, String nombre, String modelo, int anioFabricacion) {
        super(nombre, modelo, anioFabricacion);
        this.pesomaximo = pesomaximo;
    }

    public int getPesomaximo() {
        return pesomaximo;
    }

    public void setPesomaximo(int pesomaximo) {
        this.pesomaximo = pesomaximo;
    }

    @Override
    public void acelerar() {
        System.out.println("EL camion acelera el motor");
    }

    @Override
    public void encender() {
        System.out.println("El camion enciende el motor");
    }

    @Override
    public void frenar() {
        System.out.println("El camion frena el motor");
    }

    @Override
    public void apagar() {
        System.out.println("El camion apaga el motor");
    }

}
