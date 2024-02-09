                                                                                                                                                                                                                                                                                                                                                                                                                    package org.ptech081.parking;

import org.ptech081.parking.entities.*;


public class Main {
    public static void main(String[] args) {

        //crear carros con los contructores:
        Vehiculo carrito1 = new Vehiculo("ASB 456" , 
                                        TipoVehiculo.MOTO);
        Vehiculo carrito2 = new Vehiculo();
        carrito2.placa = "ERRT 566";
        carrito2.tipoVehiculo = TipoVehiculo.CAMIONETA;

        //crear cliente
        Cliente cliente1 =new Cliente("Yimmer", "Guzman", 1024480993L);

        //invocar el metodo addCar:
        cliente1.addCar(carrito1);
        cliente1.addCar("ASB 456" , TipoVehiculo.BUS);
        //recorrer los vehiculos del cliente
        for(Vehiculo c : cliente1.misVehiculos){
            System.out.println(c.placa + " " + c.tipoVehiculo);
            System.out.println("--------------");

        }


        


    }
}