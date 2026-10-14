/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

/**
 *
 * @author staliana
 */
public abstract class Empleado {
    protected int id;
    protected String nombre;
    protected int edad;
    protected float salario;

    public Empleado(int id, String nombre, int edad, float salario) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    
    
}
