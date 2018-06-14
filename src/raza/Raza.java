/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raza;

import buildercreaciones.Builder;
import buildercreaciones.BuilderFactory;
import buildercreaciones.BuilderRecursos;
import buildercreaciones.BuilderSoldados;
import buildercreaciones.BuilderVehiculos;
import centrodemando.Centrodemando;


/**
 *
 * @author Ivan Lopez
 */
public class Raza {
    public Builder[] Soldado=new Builder[10];
    public Builder[] Vehiculo=new Builder[10];
    public Builder[] recursos=new Builder[10];
    public Centrodemando centrodemando;
    public int tipo;
    public int contador=0;
    
    public Raza(Centrodemando centrodemando, int tipo){
    }
    
    public void menu(){
        //System.out.println(centrodemando.GetVida());
        System.out.println("crear edificacion de recursos.......1");
        System.out.println("crear edificacion de soldados.......2");
        System.out.println("crear edificacion de vehiculos......3");
    }
    
    public void crearedificacion(int opcion){
        if(opcion==1){
            recursos[contador]=BuilderFactory.GetBuilder(opcion);
            
        }
        if(opcion==2){
            Vehiculo[contador]=BuilderFactory.GetBuilder(opcion);
            
        }
        if(opcion==3){
            Soldado[contador]=BuilderFactory.GetBuilder(opcion);
            
        }
        
    }
}
