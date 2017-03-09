/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegorol;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class JuegoRol {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args){
        String op = "";
        Jugador p = new Jugador();
        try {
            ArrayList<Jugador> playersJuego = new ArrayList(); 
            playersJuego = p.iniPlayers();
            
            for (Jugador personaje: playersJuego){
                if(personaje.getTipoClase().toString() == "MAGO"){
                    p.pintarJugador(0);
                }else if(personaje.getTipoClase().toString() == "DRUIDA"){
                    p.pintarJugador(1);
                }else if(personaje.getTipoClase().toString() == "VALKIRIA"){
                    p.pintarJugador(2);
                }else if(personaje.getTipoClase().toString() == "GUERRERO"){
                    p.pintarJugador(3);
                }
                System.out.println("Nombre del jugador: " + personaje.getNombre());
                System.out.println("Clase del jugador: " + personaje.getTipoClase());
                System.out.println("Arma del jugador: " + personaje.getArma());
                System.out.println("Carisma del pj:" + personaje.getAtributos().getCarisma());
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        /*   
        while(! op.equals("Salir")){
            op = menu();
            switch (op){
                case 1:
                
                break;
                case 2:
                
                break;
                case 3:
                
                break;
                case 4:
                
                break;
                default:
                
                break;
            }
        }
         */
    }

    public static String menu() throws IOException {

        String op = "";
        System.out.println("1-Introduce tu opcion: ");
        System.out.println("2-Crear un personaje: ");
        System.out.println("3-Modificar tipo de clase: ");
        System.out.println("4-Modificar tipo de arma: ");
        System.out.println("5-Mostrar todos los personajes disponibles: ");
        System.out.println("6-Mostrar todos los atributos del personaje: ");
        System.out.println("7-Modificar atributos del personaje: ");
        System.out.println("Salir");
        op = new BufferedReader(new InputStreamReader(System.in)).readLine();
        return op;
    }

}
