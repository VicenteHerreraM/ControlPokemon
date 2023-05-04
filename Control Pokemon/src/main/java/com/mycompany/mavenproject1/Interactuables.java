/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Sala-2-11-PC10
 */
public class Interactuables {
    private int IdObjeto;
    private String NombreObjeto;

    public Interactuables(){
        
    }
    
    public Interactuables(int IdObjeto, String NombreObjeto) {
        this.IdObjeto = IdObjeto;
        this.NombreObjeto = NombreObjeto;
    }

    public int getIdObjeto() {
        return IdObjeto;
    }

    public void setIdObjeto(int IdObjeto) {
        this.IdObjeto = IdObjeto;
    }

    public String getNombreObjeto() {
        return NombreObjeto;
    }

    public void setNombreObjeto(String NombreObjeto) {
        this.NombreObjeto = NombreObjeto;
    }
    
}
