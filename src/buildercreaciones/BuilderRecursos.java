/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildercreaciones;


import recursos.Recurso;
import recursos.Recurso1R1;
import recursos.RecursoFactory;
import soldados.Soldados;
import vehiculo.Vehiculo;



/**
 *
 * @author Ivan Lopez
 */
public class BuilderRecursos implements Builder{
    public Recurso[] recurso1=new Recurso[10];
    public int contador;
    public int vida;
    
    
    public BuilderRecursos(){
        
    }
    
    @Override
    public Recurso GetRecurso(String type){
        contador=contador+1;
        this.recurso1[contador]=RecursoFactory.GetRecurso(type);
        return recurso1[contador];
    }

    @Override
    public void menu() {
        System.out.println("recolectar......1");
    }

    @Override
    public Soldados GetSoldado(int type) {
        return null;
    }

    @Override
    public Vehiculo GetVehiculo(int type) {
        return null;
    }
    
    
}
