/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pokedex  extends Inventario{
    
    public Pokedex(int capacidad , ArrayList <Interactuables> interaccion) {
        super(capacidad, interaccion);
    }

    public Pokedex() {
    }
    
    public boolean elegirPokemon(int idPokemon){
        int i = 0;
        for(i = 0 ; i < super.getInteracciones().size() ; i++){
            if(super.getInteracciones().get(i).getIdObjeto() == idPokemon)return true;
        }
        return false;
    }

}