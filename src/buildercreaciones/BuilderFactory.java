/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildercreaciones;

/**
 *
 * @author Ivan Lopez
 */
public class BuilderFactory {
    
    public static Builder GetBuilder(int type){
        switch (type){
            case 1:
                return new BuilderRecursos();
            case 2:
                return new BuilderSoldados();
            case 3:
                return new BuilderVehiculos();   
        }
        return null;
    }
}
