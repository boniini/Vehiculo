package clases;
import acciones.Acciones;
public class Moto extends Vehiculo implements Acciones{
    private int velocidadMaxima;

    public Moto(int velocidadMaxima, String nombre, String modelo, int anioFabricacion) {
        super(nombre, modelo, anioFabricacion);
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void encender() {
        System.out.println("La moto enciende el motor");
    }

    @Override
    public void frenar() {
        System.out.println("La moto frena el motor");
    }

    @Override
    public void apagar() {
        System.out.println("La moto apaga el motor");
    }

    @Override
    public void acelerar() {
        System.out.println("La moto acelera el motor");
    } 
}