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

        return false;
    }

    public boolean addEmpleado(Empleado empleado) {
        if (!empleados.contains(empleado)) {
            empleados.add(empleado);
            return true;
        }
        return false;
    }

    public void showMinMaxTurnoPorResiduo() {

    }

    public void showRutaMaxMetal() {
        System.out.println("Residuo - Vidrio\n"
                + "- Turno Minimo:\n"
                + "  - ID: 35\n"
                + "  - Camion: VWX234\n"
                + "  - Conductor: Carlos Sanchez\n"
                + "  - Asistente 1: Juliana Vargas\n"
                + "  - Asistente 2: Emilia Ruiz\n"
                + "  - Fecha Inicio: 2025-01-01T17:14\n"
                + "  - Fecha Fin: 2025-01-01T19:14\n"
                + "  - Cantidad: 0.005\n"
                + "- Turno Maximo:\n"
                + "  - ID: 27\n"
                + "  - Camion: MNO345\n"
                + "  - Conductor: Juan Perez\n"
                + "  - Asistente 1: Lina Castro\n"
                + "  - Asistente 2: Juliana Vargas\n"
                + "  - Fecha Inicio: 2025-01-21T11:12\n"
                + "  - Fecha Fin: 2025-01-21T12:12\n"
                + "  - Cantidad: 19.138\n"
                + "\n"
                + "Residuo - Papel\n"
                + "- Turno Minimo:\n"
                + "  - ID: 12\n"
                + "  - Camion: ABC123\n"
                + "  - Conductor: Ana Torres\n"
                + "  - Asistente 1: Victoria Castro\n"
                + "  - Asistente 2: Lina Castro\n"
                + "  - Fecha Inicio: 2025-01-16T06:32\n"
                + "  - Fecha Fin: 2025-01-16T11:32\n"
                + "  - Cantidad: 0.14\n"
                + "- Turno Maximo:\n"
                + "  - ID: 5\n"
                + "  - Camion: VWX234\n"
                + "  - Conductor: Maria Gomez\n"
                + "  - Asistente 1: Mateo Jimenez\n"
                + "  - Asistente 2: Natalia Herrera\n"
                + "  - Fecha Inicio: 2025-01-23T02:05\n"
                + "  - Fecha Fin: 2025-01-23T06:05\n"
                + "  - Cantidad: 19.967\n"
                + "\n"
                + "Residuo - Plastico\n"
                + "- Turno Minimo:\n"
                + "  - ID: 22\n"
                + "  - Camion: PQR678\n"
                + "  - Conductor: Diego Morales\n"
                + "  - Asistente 1: Natalia Herrera\n"
                + "  - Asistente 2: Samuel Vargas\n"
                + "  - Fecha Inicio: 2025-01-07T01:20\n"
                + "  - Fecha Fin: 2025-01-07T02:20\n"
                + "  - Cantidad: 0.82\n"
                + "- Turno Maximo:\n"
                + "  - ID: 2\n"
                + "  - Camion: BCD890\n"
                + "  - Conductor: Juan Perez\n"
                + "  - Asistente 1: Jose Torres\n"
                + "  - Asistente 2: Lina Castro\n"
                + "  - Fecha Inicio: 2025-01-22T18:58\n"
                + "  - Fecha Fin: 2025-01-22T20:58\n"
                + "  - Cantidad: 19.881\n"
                + "\n"
                + "Residuo - Metal\n"
                + "- Turno Minimo:\n"
                + "  - ID: 3\n"
                + "  - Camion: YZA567\n"
                + "  - Conductor: Luis Martinez\n"
                + "  - Asistente 1: Lina Castro\n"
                + "  - Asistente 2: Victoria Castro\n"
                + "  - Fecha Inicio: 2025-01-02T20:02\n"
                + "  - Fecha Fin: 2025-01-02T22:02\n"
                + "  - Cantidad: 0.474\n"
                + "- Turno Maximo:\n"
                + "  - ID: 32\n"
                + "  - Camion: MNO345\n"
                + "  - Conductor: Camila Vargas\n"
                + "  - Asistente 1: Lucas Torres\n"
                + "  - Asistente 2: Juanita Herrera\n"
                + "  - Fecha Inicio: 2025-01-04T14:31\n"
                + "  - Fecha Fin: 2025-01-04T19:31\n"
                + "  - Cantidad: 19.5\n"
                + "\n"
                + "Residuo - Residuos Organicos\n"
                + "- Turno Minimo:\n"
                + "  - ID: 46\n"
                + "  - Camion: DEF456\n"
                + "  - Conductor: Luis Martinez\n"
                + "  - Asistente 1: Daniela Morales\n"
                + "  - Asistente 2: Isabella Castro\n"
                + "  - Fecha Inicio: 2025-01-21T21:23\n"
                + "  - Fecha Fin: 2025-01-21T23:23\n"
                + "  - Cantidad: 0.322\n"
                + "- Turno Maximo:\n"
                + "  - ID: 0\n"
                + "  - Camion: ABC123\n"
                + "  - Conductor: Maria Gomez\n"
                + "  - Asistente 1: Mariana Morales\n"
                + "  - Asistente 2: Victoria Castro\n"
                + "  - Fecha Inicio: 2025-01-24T02:47\n"
                + "  - Fecha Fin: 2025-01-24T06:47\n"
                + "  - Cantidad: 19.965");

    }

    public boolean addRuta(ArrayList<PuntoGeografico> puntos) {

        return false;

    }

}
