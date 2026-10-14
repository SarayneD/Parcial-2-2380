/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author staliana
 */
public class Conductor extends Empleado {

    private ArrayList<Turno> turnos;

    public Conductor(int id, String nombre, int edad, float salario) {
        super(id, nombre, edad, salario);
        this.turnos = new ArrayList<>();
    }
}
