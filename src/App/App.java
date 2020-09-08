/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Controlador.Ctrl;
import Controlador.Eventos;
import Modelo.Estudiante;
import Modelo.ModelEstudiante;
import Modelo.ModelTable;
import Vista.Ventana;



/**
 *
 * @author BRUNO BELTRE GUZMAN
 */
public class App {

    private static void iniciar() {
        Estudiante estudiante = new Estudiante();
        Ventana ventana = new Ventana();
        ModelTable modelTable = new ModelTable(ventana, estudiante);
        ModelEstudiante modelEstudiante = new ModelEstudiante(ventana, estudiante, modelTable);
        Eventos eventos = new Eventos(ventana);
        Ctrl ctrlEstudiante = new Ctrl(estudiante, modelEstudiante, ventana, modelTable);
        ctrlEstudiante.iniciarVentana();
        ventana.setVisible(true);
    }

    public static void main(String[] args) {

        iniciar();

    }

}
