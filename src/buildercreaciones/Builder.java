/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildercreaciones;

import recursos.Recurso;
import soldados.Soldados;
import vehiculo.Vehiculo;

/**
 *
 * @author Ivan Lopez
 */
public interface Builder {
    
    public void menu();
    public Recurso GetRecurso(String type);
    public Soldados GetSoldado(int type);
    public Vehiculo GetVehiculo(int type);
    
}
