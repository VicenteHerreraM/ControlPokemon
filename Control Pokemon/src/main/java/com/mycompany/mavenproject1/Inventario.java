/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.ArrayList;

/**
 *
 * @author Sala-2-11-PC10
 */

public class Inventario {
    private int capacidad;
    Interactuables I = new Interactuables();
    Inventario inv = new Inventario();
    private ArrayList <Interactuables> interacciones = new ArrayList<>();

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Interactuables> getInteracciones() {
        return interacciones;
    }

    public void setInteracciones(ArrayList<Interactuables> interacciones) {
        this.interacciones = interacciones;
    }

    public Inventario(int capacidad , ArrayList<Interactuables> interacciones) {
        this.capacidad = capacidad;
        this.interacciones = interacciones;
    }
    
    public Inventario(){
        
    }
    
    public boolean crearInteractuables(int idObjeto,  String nombreObjeto){
        int i = 0;
        for(i = 0  ; i < interacciones.size() ; i++){
            if(interacciones.get(i).getIdObjeto() == idObjeto){
                return false;
            }
        }
        interacciones.add(new Interactuables(idObjeto , nombreObjeto));
        return true;
    }
    
    
    
    public boolean eliminarInteractuables(int Id){
        int i;
        for(i = 0 ; i < interacciones.size() ; i++){
            if(interacciones.get(i).getIdObjeto() == Id){
                interacciones.remove(i);
                return true;
            }
        }
        
        
        return false;
    }
    
    public boolean modificarInteractuable(int Id , String NombreObjeto){
        int i;
        for(i = 0 ; i < interacciones.size() ; i++){
            if(interacciones.get(i).getIdObjeto() == Id){
                interacciones.get(i).setIdObjeto(Id);
                interacciones.get(i).setNombreObjeto(NombreObjeto);
                return true;
            }
        }
        
        
        return false;
    }
    
    
    public boolean mostrarInteracuables(int Id){
        int i;
        for(i = 0 ; i < interacciones.size() ; i++){
            if(interacciones.get(i).getIdObjeto() == Id){
                System.out.println(interacciones.get(Id).getNombreObjeto());
                System.out.println(interacciones.get(Id).getIdObjeto());
                return true;
            }
        }
        return false;
    }

    public class Pokedex extends Inventario{
        
        
        
    }



}
