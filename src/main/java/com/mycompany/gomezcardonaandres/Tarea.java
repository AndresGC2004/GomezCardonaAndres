/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gomezcardonaandres;

import java.util.Date;

/**
 *
 * @author sala4
 */
public class Tarea {
    private boolean habilitada;
    private boolean deshabilitar;
    private String nom;

    public Tarea(String nom) {
        this.nom = nom;
    }
 
    public void ejecutar(){
    }
    public void doEjecutar(){
    }
    public Date ulitimaEjecucion(){
        return new Date();
    }
    public void vecesQueSeEjecuta(Date i,Date b) {
    }
    public void vecesQueDioError(Date i,Date b) {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
