/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildercreaciones;

import soldados.SoldadoFactory;
import recursos.Recurso;
import soldados.Soldados;
import vehiculo.Vehiculo;

/**
 *
 * @author Ivan Lopez
 */
public class BuilderSoldados implements Builder{    
    public Soldados[] soldados=new Soldados[10];
    public int contador=-1;
    public int vida;

    public BuilderSoldados(){
        
    }
    
    @Override
    public Soldados GetSoldado(int type){
        contador=contador+1;
        this.soldados[contador]=SoldadoFactory.GetSoldado(type);
        return soldados[contador];
    } 

    @Override
    public void menu() {
        System.out.println("crear escuadron......1");
        System.out.println("crear especialista...2");
    }

    @Override
    public Recurso GetRecurso(String type) {
        return null;
    }

    @Override
    public Vehiculo GetVehiculo(int type) {
        return null;
    }
    
    
}
