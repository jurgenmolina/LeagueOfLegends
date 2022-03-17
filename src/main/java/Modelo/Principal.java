/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

public class Principal {

    ArrayList<Jugador> jugadores = new ArrayList<>();
    ArrayList<Campeon> campeones = new ArrayList<>();

    public void agregarCampeon(String nombre, String titulo, String rol, String dificultad) {
        Campeon c = new Campeon(nombre, titulo, rol, dificultad);
        campeones.add(c);
    }

    public void agregarJugador(String nombre, String email, String usuario, String fechaNacimiento) {
        Jugador j = new Jugador(nombre, email, usuario, fechaNacimiento);
        jugadores.add(j);
    }

    public boolean usuarioDuplicado(String usuario) {
        if (!usuario.isEmpty()) {
            for (Jugador jugador : jugadores) {
                if (jugador.getUsuario().equals(usuario)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean campeonDuplicado(String nombre) {
        if (!nombre.isEmpty()) {
            for (Campeon champ : campeones) {
                if (champ.getNombre().equalsIgnoreCase(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Jugador buscarUser(String usuario) {
        if (!jugadores.isEmpty()) {
            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.get(i).getUsuario().equals(usuario)) {
                    return jugadores.get(i);
                }
            }
        }
        return null;
    }

    public Campeon bucarCampeon(String nombre) {
        if (!campeones.isEmpty()) {
            for (int i = 0; i < campeones.size(); i++) {
                if (campeones.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    return campeones.get(i);
                }
            }
        }
        return null;
    }

    public String mostrarInformacion() {
        String dato = "";
        for (Jugador jugador : jugadores) {
            dato += jugador.toString();
        }
        return dato;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Campeon> getCampeones() {
        return campeones;
    }

    public void setCampeones(ArrayList<Campeon> campeones) {
        this.campeones = campeones;
    }

    public void asociarCampeones(String usuarioJugador, String nombreCampeon) {
        for (Jugador j : jugadores) {
            if (j.getUsuario().equalsIgnoreCase(usuarioJugador)) {
                for (Campeon c : campeones) {
                    //System.err.println(j.getNombre() +" "+ c.getNombre());
                    if (c.getNombre().equalsIgnoreCase(nombreCampeon)) {
                        j.agregarCampeon(c);
                    }
                }
            }
        }
    }
    
    public boolean verificarAsociacion(String jugador, String campeon){
        Jugador jug = buscarUser(jugador);
        
        if(jug!=null){
            for (int i = 0; i < jug.getCampeones().size(); i++) {
                if(jug.getCampeones().get(i).getNombre().equals(campeon)){
                return true;
                }
            }
        }
        return false;
    }
    
}
