package vehiculo;
import raza.Raza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UCA
 */
public class Vehiculo2R2 implements Vehiculo{
    public int ataque=200;

    @Override
    public void atacar(Raza raza1) {
        raza1.centrodemando.SetVida(ataque);
    }
    
}
