package clases;
import acciones.Acciones;
public class Moto extends Vehiculo implements Acciones{
    private int velocidadMaxima;
    
    public Moto(int velocidadMaxima) {
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
        System.out.println("");
    }

    @Override
    public void frenar() {
        System.out.println("");
    }

    @Override
    public void apagar() {
        System.out.println("");
    }
    
}