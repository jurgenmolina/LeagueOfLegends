/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;


public class Campeon {
    private String nombre, titulo, rol, dificultad;

    public Campeon(String nombre, String titulo, String rol, String dificultad) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.rol = rol;
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
