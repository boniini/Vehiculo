package clases;
public class Moto {
    private int velocidadMaxima;
    protected void Moto();
    protected int get();
    protected void set();

    public Moto(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
   }