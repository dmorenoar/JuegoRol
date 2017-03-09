/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegorol;

import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class Jugador {
    
    private String nombre;
    private Tipo tipoClase;
    private Arma arma;
    private Atributos atributos;

    public Jugador(){
        
    }
    
    public Jugador(String nombre, Tipo tipoClase, Arma arma, Atributos atributosPer){
        //Atributos(int fuerza, int destreza, int inteligencia, int carisma)
        atributos = atributosPer;
        this.nombre = nombre;
        this.tipoClase = tipoClase;
        this.arma = arma;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }
    
    public ArrayList<Jugador> iniPlayers(){
        ArrayList<Jugador> listaPersonajes = new ArrayList();
        Jugador mago = new Jugador("Gandalf",tipoClase.MAGO,arma.VARA,new Atributos(23,43,12,22));
        Jugador guerrero = new Jugador("Trancos",tipoClase.GUERRERO,arma.ESPADA,new Atributos(23,43,12,14));
        Jugador druida = new Jugador("Radargast",tipoClase.DRUIDA,arma.VARA,new Atributos(23,43,12,18));
        Jugador valkiria = new Jugador("Disir",tipoClase.VALKIRIA,arma.LANZA,new Atributos(23,43,12,10));
        listaPersonajes.add(mago);
        listaPersonajes.add(guerrero);
        listaPersonajes.add(druida);
        listaPersonajes.add(valkiria);
        return listaPersonajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(Tipo tipoClase) {
        this.tipoClase = tipoClase;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
    public void pintarJugador(int jugador){
        switch (jugador){
            case 0:
                           System.out.println("               .\n" +
"\n" +
"                        .\n" +
"              /^\\     .\n" +
"         /\\   \"V\"\n" +
"        /__\\   I      O  o\n" +
"       //..\\\\  I     .\n" +
"       \\].`[/  I\n" +
"       /l\\/j\\  (]    .  O\n" +
"      /. ~~ ,\\/I          .\n" +
"      \\\\L__j^\\/I       o\n" +
"       \\/--v}  I     o   .\n" +
"       |    |  I   _________\n" +
"       |    |  I c(`       ')o\n" +
"       |    l  I   \\.     ,/\n" +
"     _/j  L l\\_!  _//^---^\\\\_\n" +
"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~     ");    
            break;
            case 1:
                System.out.println("  ,    _\n" +
"           /|   | |\n" +
"         _/_\\_  >_<\n" +
"        .-\\-/.   |\n" +
"       /  | | \\_ |\n" +
"       \\ \\| |\\__(/\n" +
"       /(`---')  |\n" +
"      / /     \\  |\n" +
"   _.'  \\'-'  /  |\n" +
"   `----'`=-='   '  ");
            break;
            case 2:
                System.out.println("...                            ...\n" +
"       ``:::.....;'''''''';.,,,,;;;''\n" +
"           ````{.          .}''''\n" +
"              {{            }}\n" +
"             {================}\n" +
"             +================+\n" +
"             \"{  #m..  ..m#  }\"\n" +
"              {   <*>`'<*>  .}\n" +
"              :{     '`    .}\n" +
"               :{ `. uu .'.}\n" +
"                :{        }'\n" +
"                 {: }^^{ ;}\n" +
"                  {. ~~ ,}\n" +
"                   :wwww:\n" +
"             Uba    \\vv/");
                    
            break;
            case 3:
                System.out.println(" "
                        + "    ,/|\\\n" +
                        "     //&')\n" +
"     '')(\n" +
"      (( )\n" +
"      )( (\n" +
"      (=M=[)###########>\n" +
"      (( )\n" +
"      (( )_\n" +
"      ((__,)");
                break;
        }
        
    }
}
