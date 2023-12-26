package com.regalo.regalo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Stem {
    public static void drawStem (GraphicsContext context, double centerX, double centerY) {
        context.setStroke(Color.GREEN); // Puedes ajustar el color marrón según tus preferencias
        context.setLineWidth(20); // Ajusta el ancho del borde según tus preferencias
        context.strokeLine(centerX, centerY, centerX, 900);
    }
}
