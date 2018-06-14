/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import buildercreaciones.Builder;
import buildercreaciones.BuilderFactory;
import builderraza.BuilderRaza;
import java.util.Scanner;
import raza.Raza;

/**
 *
 * @author Ivan Lopez
 */
public class Main {
    public static void main(String args[]){
        Scanner tipoderaza= new Scanner(System.in);
        Raza[] razas= new Raza[2];
        boolean salir= false;
        Builder builder;
        int a,cont=0,contador=0;
        for(int i=0; i<2;i++){
            System.out.println("raza1.....1");
            System.out.println("raza2.....2");
            System.out.println("raza3.....3");
            a=tipoderaza.nextInt();
            BuilderRaza builderraza= new BuilderRaza(a);
            razas[i]=builderraza.GetRaza();
        }
        
        //while(razas[0].centrodemando.GetVida()>0 && razas[1].centrodemando.GetVida()>0){
        while(true){
            while(salir==false){
                int b;
                Scanner opcionedificio= new Scanner(System.in);
                razas[0].menu();
                System.out.println("salir.......5");
                b=opcionedificio.nextInt();
                if(b==5){
                    salir=true;
                }
                else{
                    switch(b){
                        case 1:
                            String c;
                            Scanner opcionrecurso=new Scanner(System.in);
                            razas[0].recursos[contador]=BuilderFactory.GetBuilder(b);
                            razas[0].recursos[contador].menu();
                            c=opcionrecurso.nextLine();
                            razas[0].recursos[contador].GetRecurso(c);
                        case 2:
                            int d;
                            Scanner opcionsoldado=new Scanner(System.in);
                            razas[0].Soldado[contador]=BuilderFactory.GetBuilder(b);
                            razas[0].Soldado[contador].menu();
                            d=opcionsoldado.nextInt();
                            if(cont==2){
                            razas[0].Soldado[contador].GetSoldado(d).atacar(razas[1]);
                            }
                        case 3:
                            int e;
                            Scanner opcionvehiculos=new Scanner(System.in);
                            razas[0].Vehiculo[contador]=BuilderFactory.GetBuilder(b);
                            razas[0].Vehiculo[contador].menu();
                            e=opcionvehiculos.nextInt();
                            if(cont==3){
                            razas[0].Vehiculo[contador].GetVehiculo(e);
                            }
                    }
                }
            }
                    
            while(salir==true){
                int b;
                Scanner opcionedificio= new Scanner(System.in);
                razas[1].menu();
                System.out.println("salir.......5");
                b=opcionedificio.nextInt();
                if(b==5){
                    salir=true;
                }
                else{
                    switch(b){
                        case 1:
                            String c;
                            Scanner opcionrecurso=new Scanner(System.in);
                            razas[1].recursos[contador]=BuilderFactory.GetBuilder(b);
                            razas[1].recursos[contador].menu();
                            c=opcionrecurso.nextLine();
                            razas[1].recursos[contador].GetRecurso(c);
                        case 2:
                            int d;
                            Scanner opcionsoldado=new Scanner(System.in);
                            razas[1].Soldado[contador]=BuilderFactory.GetBuilder(b);
                            razas[1].Soldado[contador].menu();
                            d=opcionsoldado.nextInt();
                            if(cont==3){
                            razas[1].Soldado[contador].GetSoldado(d);
                            }
                    
                        case 3:
                            int e;
                            Scanner opcionvehiculos=new Scanner(System.in);
                            razas[1].Vehiculo[contador]=BuilderFactory.GetBuilder(b);
                            razas[1].Vehiculo[contador].menu();
                            e=opcionvehiculos.nextInt();
                            if(cont==4){
                            razas[1].Vehiculo[contador].GetSoldado(e);
                            }
                    }
                }
            }
            cont=cont+1;
            if(4<cont){
                cont=0;
            }
            System.out.println("juego terminado");
        }
                
    }           
}
    

