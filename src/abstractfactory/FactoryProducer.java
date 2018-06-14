/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.soldados.SoldadoFactory;
import abstractfactory.vehiculo.VehiculoFactory;
import abstractfactory.recursos.RecursoFactory;

/**
 *
 * @author Ivan Lopez
 */
public class FactoryProducer {
    public static AbstractFactory GetFactory(String type){
        switch(type){
            case "recursos":
                return new RecursoFactory();
            case "soldados":
                return new SoldadoFactory();
            case "vehiculo":
                return new VehiculoFactory();
        }
        return null;
    }
}
