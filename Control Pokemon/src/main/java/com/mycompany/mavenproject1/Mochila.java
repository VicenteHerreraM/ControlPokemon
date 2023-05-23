/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;
import Interfas.InterfazDeInteractuable;
import java.util.ArrayList;

/**
 *
 * @author Sala-2-11-PC10
 */
public class Mochila extends Inventario{
    
    private ArrayList<InterfazDeInteractuable> interacciones;

    @Override
    public ArrayList<InterfazDeInteractuable> getInteracciones() {
        return interacciones;
    }

    @Override
    public void setInteracciones(ArrayList<InterfazDeInteractuable> interacciones) {
        this.interacciones = interacciones;
    }

    public Mochila(ArrayList<InterfazDeInteractuable> interacciones) {
        this.interacciones = interacciones;
    }
    
    public Mochila() {
    }

    @Override
    public void crearInventario() {
        Scanner input = new Scanner(System.in);
        int idObjeto;
        int cantObjetos = 10;
        String nombreObjeto , tipoObjeto;
        ArrayList<Objeto> objetosMochila = new ArrayList<Objeto>(cantObjetos);
        for (Objeto objetosMochila1 : objetosMochila) {
            idObjeto = input.nextInt();
            nombreObjeto = input.nextLine();
            tipoObjeto = input.nextLine();
            objetosMochila.add(new Objeto(idObjeto , nombreObjeto , tipoObjeto));
        }
    }
}

