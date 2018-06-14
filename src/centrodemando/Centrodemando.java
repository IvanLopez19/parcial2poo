/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrodemando;

import java.util.ArrayList;
import recursos.Recurso;

/**
 *
 * @author Ivan Lopez
 */
public class Centrodemando {
    public int a= 10000;
    public int b= 5000;
    public int c= 3000;
    
    public void Aumentarnivel1(){
        this.a=a+(a/10);
        this.b=b+(b/10);
        this.c=c+(c/10);
    }
    
    public void Aumentarnivel2(){
        this.a=a+(a/5);
        this.b=b+(b/5);
        this.c=c+(c/5);
    }
    
    public void Aumentarnivel3(){
        this.a=a+(a/(10/3));
        this.b=b+(b/(10/3));
        this.c=c+(c/(10/3));
    }
    public Recurso[] Recurso1= new Recurso[a];
    public Recurso[] Recurso2= new Recurso[b];
    public Recurso[] Recurso3= new Recurso[c];
    public int vida=1000;

    public int  GetVida() {
        return vida;
    }

    public void SetVida(int ataque) {
        this.vida = vida-ataque;
    }
    
    
        
}
