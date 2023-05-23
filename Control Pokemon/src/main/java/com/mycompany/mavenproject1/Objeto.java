/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import Interfas.InterfazDeInteractuable;
/**
 *
 * @author Sala-2-11-PC10
 */
public class Objeto implements InterfazDeInteractuable{
    private int IdObjeto;
    private String NombreObjeto;
    private String tipoObjeto;

    public Objeto(int IdObjeto, String NombreObjeto, String tipoObjeto) {
        this.IdObjeto = IdObjeto;
        this.NombreObjeto = NombreObjeto;
        this.tipoObjeto = tipoObjeto;
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

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public Objeto(){
        
    }

    @Override
    public int idObjeto() {
        return getIdObjeto();
    }

    @Override
    public int obtenerObjeto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean usarObjeto() {
        return true;
    }
}
