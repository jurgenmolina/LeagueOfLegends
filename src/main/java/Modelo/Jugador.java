/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.ArrayList;


public class Jugador {

    private String nombre, email, usuario, fechaNacimiento;
    private ArrayList<Campeon> campeones;
    
    public Jugador(String nombre, String email, String usuario, String fechaNacimiento) {
        this.nombre = nombre;
        this.email = email;
        this.usuario = usuario;
        this.fechaNacimiento = fechaNacimiento;
        this.campeones = new ArrayList<>();
    }

    public ArrayList<Campeon> getCampeones() {
        return campeones;
    }

    public void setCampeones(ArrayList<Campeon> campeones) {
        this.campeones = campeones;
    }
    
    public void agregarCampeon(Campeon campeon){
        campeones.add(campeon);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        String dato = "";
        for (int i = 0; i < campeones.size(); i++) {
            dato += campeones.get(i).getNombre();
        }
        return dato;
    }

    
    
    
}
