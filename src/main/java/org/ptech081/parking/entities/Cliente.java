package org.ptech081.parking.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombres;
    public String apellidos;
    public Long indentificacion;
    public List<Vehiculo> misVehiculos;
    
    public Cliente() {
        this.misVehiculos = new ArrayList<Vehiculo>();    
    }

    public Cliente(String nombres, String apellidos, Long indentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.indentificacion = indentificacion;
        this.misVehiculos = new ArrayList<Vehiculo>();    }
 
    //orimera sobrecarga de addCar
        public void addCar(Vehiculo car){
        this.misVehiculos.add(car);

    }
    //segunda sobrecarga de addCar
    public void addCar(String placa, TipoVehiculo tv) {
        Vehiculo car = new Vehiculo(placa , tv);
        this.misVehiculos.add(car);

    }
    


}
