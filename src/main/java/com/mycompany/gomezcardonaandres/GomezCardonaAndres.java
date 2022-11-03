/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.gomezcardonaandres;

import java.util.Scanner;

/**
 *
 * @author sala4
 */
public class GomezCardonaAndres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StoreProcedure store=new StoreProcedure();
        
        int opcion;
        String nom;
        System.out.println("""
                           Ingrese que opcion desea: 
                           1. Ingresar tarea
                           2. Consultar Tarea
                           3. Salir""");
        opcion=in.nextInt();in.nextLine();
       
        switch(opcion){
            case 1 -> {
                System.out.println("""
                                                   Ingrese que tipo de tarea va a ingresar:
                                                   1. Tarea
                                                   2. Tarea Compuesta
                                                   3. Tarea Programada""");
                opcion=in.nextInt();in.nextLine();
                switch(opcion){
                    case 1 -> {
                        System.out.println("Ingrese el nombre de la tarea:");
                        nom=in.nextLine();
                        Tarea a=new Tarea(nom);
                        System.out.println("Funciona");
                        
                    }
                    
                    case 2 -> {
                        System.out.println("Ingrese el nombre de la tarea:");
                        nom=in.nextLine();
                        TareaCompuesta b=new TareaCompuesta(nom);
                        
                    }
                    
                    case 3 -> {
                    }
                }
            }

            
            case 2 -> {
                for(Tarea s: store.getTarea()){
                    System.out.println(s.toString());
                }
            }
            
            case 3 -> System.exit(0);
        }
    }
    
}
