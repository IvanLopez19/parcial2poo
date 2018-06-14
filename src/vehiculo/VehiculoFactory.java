/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author Ivan Lopez
 */
public class VehiculoFactory {
    public static Vehiculo GetVehiculo(int type){
        switch (type){
            case 1:
                return new Vehiculo1R1();
            case 2:
                return new Vehiculo1R2();
            case 3:
                return new Vehiculo1R3();
            case 4:
                return new Vehiculo2R1();
            case 5:
                return new Vehiculo2R2();
            case 6:
                return new Vehiculo2R3();    
        }
        return null;
    }
}
