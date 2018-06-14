/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soldados;

/**
 *
 * @author Ivan Lopez
 */
public class SoldadoFactory {
    public static Soldados GetSoldado(int type){
        switch (type){
            case 1:
                return new EscuadronR1();
            case 2:
                return new EscuadronR2();
            case 3:
                return new EscuadronR3();
            case 4:
                return new EspecialistaR1();
            case 5:
                return new EspecialistaR2();
            case 6:
                return new EspecialistaR3();    
        }
        return null;
    }
}
