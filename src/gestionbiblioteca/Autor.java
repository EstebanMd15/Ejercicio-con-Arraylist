/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

/**
 *
 * @author 1089478791
 */
public class Autor {
    
    private String documento;
    private String nombre;
    private String nacionalidad;

    public Autor(String documento, String nombre, String nacionalidad) {
        this.documento = documento;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public String toString(){
        return "Autor: " + nombre + " Nacionalidad: "+ nacionalidad;
    }
        
    }

