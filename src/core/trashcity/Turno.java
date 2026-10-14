/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.trashcity;

import core.person.Asistente;
import core.person.Conductor;
import java.util.ArrayList;

/**
 *
 * @author staliana
 */
public class Turno {
    private int id;
    private Camion camion;
    private Conductor conductor;
    private Asistente asistente1;
    private Asistente asistente2;
    private Ruta ruta;
    private DateTime fechainicio;
    private DateTime fechaFin;
    private ArrayList<Residuo>residuos; 
}
