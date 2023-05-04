/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Estudiante
 */
public class Habilidad{
    private int danio;
    private String nombreAtaque;
    private Tipo_Pokemon tipoAtaque;

    public Habilidad(int danio, String nombreAtaque, Tipo_Pokemon tipoAtaque) {
        this.danio = danio;
        this.nombreAtaque = nombreAtaque;
        this.tipoAtaque = tipoAtaque;
    }

    public Habilidad() {
    }
    
    public int getDanio() {
        return danio;
    }

    public String getNombreAtaque() {
        return nombreAtaque;
    }

    public Tipo_Pokemon getTipoAtaque() {
        return tipoAtaque;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public void setNombreAtaque(String nombreAtaque) {
        this.nombreAtaque = nombreAtaque;
    }

    public void setTipoAtaque(Tipo_Pokemon tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }
    
    
    
}
