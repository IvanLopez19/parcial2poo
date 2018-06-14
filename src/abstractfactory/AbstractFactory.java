/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import recursos.Recurso;
import soldados.Soldados;
import vehiculo.Vehiculo;

/**
 *
 * @author Ivan Lopez
 */
public interface AbstractFactory {
    
    public Recurso GetRecursos(String type);
    public Soldados GetSoldados(String type);
    public Vehiculo GetVehiculo(String type);
}
