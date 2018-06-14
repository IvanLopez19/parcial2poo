/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildercreaciones;

import vehiculo.Vehiculo;
import vehiculo.VehiculoFactory;
import recursos.Recurso;
import soldados.Soldados;

/**
 *
 * @author Ivan Lopez
 */
public class BuilderVehiculos implements Builder{
    
    public Vehiculo[] vehiculo=new Vehiculo[10];
    public int contador=-1;
    
    
    
    
    public BuilderVehiculos(){
        
    }
    
    @Override
    public Vehiculo GetVehiculo(int type){
        contador=contador+1;
        this.vehiculo[contador]=VehiculoFactory.GetVehiculo(type);
        return vehiculo[contador];
    } 

    @Override
    public void menu() {
        System.out.println("vehiculo1......1");
        System.out.println("vehiculo2......2");
    }

    @Override
    public Recurso GetRecurso(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Soldados GetSoldado(int type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
