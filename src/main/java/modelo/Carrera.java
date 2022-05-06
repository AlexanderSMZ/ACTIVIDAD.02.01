/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexa
 */
public class Carrera {
    
    private String nombre;
    private String nombreDirector;
    private int numeroAlumnos;
    private String sede;
    private int yearInicioCarrera;

    public Carrera(String nombre, String nombreDirector, int numeroAlumnos, String sede, int yearInicioCarrera) {
        this.nombre = nombre;
        this.nombreDirector = nombreDirector;
        this.numeroAlumnos = numeroAlumnos;
        this.sede = sede;
        this.yearInicioCarrera = yearInicioCarrera;
    }
    
    public int calcularYear(int currentYear){
        var retorno=10000;
        retorno=currentYear-this.yearInicioCarrera;
        return retorno;
    }
    
    public boolean esSede(){
        var retorno=false;
        if (this.sede=="Cuenca")
        retorno=true;
        return retorno;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getYearInicioCarrera() {
        return yearInicioCarrera;
    }

    public void setYearInicioCarrera(int yearInicioCarrera) {
        this.yearInicioCarrera = yearInicioCarrera;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", nombreDirector=" 
                + nombreDirector + ", numeroAlumnos=" + numeroAlumnos 
                + ", sede=" + sede + ", yearInicioCarrera=" 
                + yearInicioCarrera + '}';
    }
    
            
            
    
}
