/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;


/**
 *
 * @author Ivan Lopez
 */
public class RecursoFactory {
    
    public static Recurso GetRecurso(String type){
        switch (type){
            case "Recurso1R1":
                return new Recurso1R1();
            case "Recurso1R2":
                return new Recurso1R2();
            case "Recurso1R3":
                return new Recurso1R3();
            case "Recurso2R1":
                return new Recurso2R1();
            case "Recurso2R2":
                return new Recurso2R2();
            case "Recurso2R3":
                return new Recurso2R3();
            case "Recurso3R1":
                return new Recurso3R1();
            case "Recurso3R2":
                return new Recurso3R2();
            case "Recurso3R3":
                return new Recurso3R3();    
        }
        return null;
    }
    
}
