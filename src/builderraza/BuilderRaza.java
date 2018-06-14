/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderraza;

import centrodemando.Centrodemando;
import raza.Raza;



/**
 *
 * @author Ivan Lopez
 */
public class BuilderRaza {
    public Raza raza;
    public Centrodemando centrodemando;
    public int tipo;
    
    
    public BuilderRaza(int tipo){
        this.centrodemando=new Centrodemando();
        this.tipo=tipo;
        this.raza=new Raza(centrodemando,tipo);
    }
    
    public Raza GetRaza(){
        return raza;
    }
}
