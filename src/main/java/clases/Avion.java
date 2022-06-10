package clases;
import acciones.Acciones;
 public class Avion extends Vehiculo implements Acciones{
    private int Ocupantes;

    public Avion(int Ocupantes) {
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
