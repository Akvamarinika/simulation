package com.akvamarinika.simulation;

import com.akvamarinika.simulation.controller.Simulation;
import com.akvamarinika.simulation.model.Field;
import com.akvamarinika.simulation.view.Renderer;
import com.akvamarinika.simulation.view.RendererConsole;

public class Main {
    public static void main(String[] args) {
        Field field = new Field(10, 10);
        Renderer renderer = new RendererConsole();
        Simulation simulation = new Simulation(field, renderer);
        simulation.start();


    }
}
