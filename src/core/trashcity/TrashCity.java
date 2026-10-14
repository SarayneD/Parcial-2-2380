/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.trashcity;

import core.person.Empleado;
import java.util.ArrayList;

/**
 *
 * @author sarayned
 */
public class TrashCity {

    private ArrayList<Empleado> empleados;
    private ArrayList<Camion> camiones;
    private ArrayList<Ruta> rutas;
    private ArrayList<Turno> turnos;

    public TrashCity() {
        this.empleados = new ArrayList<>();
        this.camiones = new ArrayList<>();
        this.rutas = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public boolean addCamion(Camion camion) {
        if (!camiones.contains(camion)) {
            camiones.add(camion);
            return true;
        }
        return false;
    }

    public Empleado getEmpleado(int i) {
        return empleados.get(i);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public Camion getCamion(int i) {
        return camiones.get(i);
    }

    public ArrayList<Camion> getCamiones() {
        return camiones;
    }

    public Ruta getRuta(int i) {
        return rutas.get(i);
    }

    public ArrayList<Ruta> getRutas() {
        return rutas;
    }
     public Turno getTurno(int i) {
        return turnos.get(i);
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public boolean addTurno(int i, Camion camion, Empleado empleado, Empleado empleado1, Empleado empleado2, Ruta ruta) {
       if (!turnos.contains(i)) {
            turnos.add(turno);
            return true;
        }
        return false; 
    }
    
    public boolean addEmpleado(Empleado empleado){
        if (!empleados.contains(empleado)) {
            empleados.add(empleado);
            return true;
        }
        return false;
    }
    
    public boolean addRuta(Ruta puntos){
        if (!rutas.contains(puntos)) {
            rutas.add(puntos);
            return true;
        }
        return false;
    }

}
