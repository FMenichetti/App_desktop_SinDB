/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author DELL
 */
public class Rubro {
    
    //Atributos
    private String nombre;
    private int codigo;

    //Constructores
    public Rubro() {
    }

    public Rubro(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
