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
public class Mochila extends Inventario {

    public Mochila(int capacidad, ArrayList<Interactuables> interacciones) {
        super(capacidad, interacciones);
    }

    public Mochila() {
    }
    
    public boolean usarObjeto(int idObjeto){
        int i;
        for(i = 0 ; i < super.getCapacidad() ; i++){
            if(super.getInteracciones().get(i).getIdObjeto() == idObjeto){
                super.getInteracciones().remove(i);
                return true;
            }
        }
        return false;
    }
}
