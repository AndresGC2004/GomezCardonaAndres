/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gomezcardonaandres;

/**
 *
 * @author sala4
 */
public class StoreProcedure {
    
    private Tarea[] store;
    private int count;

    public StoreProcedure() {
        this.count = 0;
        
    }

    public Tarea[] getTarea() {
        return store;
    }

    public void setTarea(Tarea[] tarea) {
        this.store = tarea;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    public void add(Tarea t,int c){
        store[c+1]=t;
    }

    @Override
    public String toString() {
        return "StoreProcedure{" + "store=" + store + '}';
    }

   
}
