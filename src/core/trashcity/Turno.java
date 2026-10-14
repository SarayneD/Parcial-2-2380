/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.trashcity;

import core.person.Asistente;
import core.person.Conductor;
import java.time.LocalDateTime;
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
    private LocalDateTime fechainicio;
    private LocalDateTime fechaFin;
    private ArrayList<Residuo>residuos; 
    
}
