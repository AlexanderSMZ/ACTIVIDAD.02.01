/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexa
 */
public class Asignatura {
    
    private String nombre;
    private String nombreDocente;
    private int capacidadAlumnos;
    private int codigo;
    private int ciclo;
    private int notasGlobal;
    private Carrera unCarrera;

    public Asignatura(String nombre, String nombreDocente, int capacidadAlumnos, 
            int codigo, int ciclo, int notasGlobal) {    
        this.nombre = nombre;
        this.nombreDocente = nombreDocente;
        this.capacidadAlumnos = capacidadAlumnos;
        this.codigo = codigo;
        this.ciclo = ciclo;
        this.notasGlobal = notasGlobal;
        
    }
    
    public Asignatura(String nombre, String nombreDocente, int capacidadAlumnos, 
            int codigo, int ciclo, int notasGlobal, Carrera unCarrera) {
        this.nombre = nombre;
        this.nombreDocente = nombreDocente;
        this.capacidadAlumnos = capacidadAlumnos;
        this.codigo = codigo;
        this.ciclo = ciclo;
        this.notasGlobal = notasGlobal;
        this.unCarrera = unCarrera;
    }    

    public boolean apruebaGrupo (double notaReferencia){
        var retorno= false;
        if (this.notasGlobal >= notaReferencia)
        retorno = true;
        return retorno;
    }   
    
    public int calcularCapaciad(int capacidadPermitida){
        var retorno = 100000;
        retorno=capacidadPermitida-this.capacidadAlumnos;
        return retorno;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public int getCapacidadAlumnos() {
        return capacidadAlumnos;
    }

    public void setCapacidadAlumnos(int capacidadAlumnos) {
        this.capacidadAlumnos = capacidadAlumnos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getNotasGlobal() {
        return notasGlobal;
    }

    public void setNotasGlobal(int notasGlobal) {
        this.notasGlobal = notasGlobal;
    }

    public Carrera getUnCarrera() {
        return unCarrera;
    }

    public void setUnCarrera(Carrera unCarrera) {
        this.unCarrera = unCarrera;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nombreDocente=" 
                + nombreDocente + ", capacidadAlumnos=" + capacidadAlumnos 
                + ", codigo=" + codigo + ", ciclo=" + ciclo + ", notasGlobal=" 
                + notasGlobal + ", unCarrera=" + unCarrera + '}';
    }
    
    
    
}
