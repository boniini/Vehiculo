package cl.lec;
import clases.Avion;
import clases.Camion;
import clases.Moto;
import clases.Vehiculo;
import java.util.ArrayList;

public class ProyectoVehiculo {
    public static void main(String[] args) {
        Avion a1 = new  Avion(30,"Mapache","Airbus A350",2001);
        Avion a2 = new  Avion(20,"Buff","B-52",2005);
        Camion c1 = new Camion(70,"Canela","VOLVO",2020);
        Camion c2 = new Camion(80,"paris","SCANIA",2021);
        Moto m1 = new Moto(100,"josefa","Yamaha",2018);
        Moto m2 = new Moto(300,"la maria juana","Ducati",2019);
        
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(a1);
        vehiculos.add(a2);
        vehiculos.add(c1);
        vehiculos.add(c2);
        vehiculos.add(m1);
        vehiculos.add(m2);
        
        for (int i = 0; i < vehiculos.size(); i++) {
            vehiculos.get(i).acelerar();
        } 
    }
}
