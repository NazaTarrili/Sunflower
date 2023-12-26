package com.regalo.regalo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Stem {
    public static void drawStem (GraphicsContext context, double centerX, double centerY) {
        context.setStroke(Color.GREEN);
        context.setLineWidth(20);
        context.strokeLine(centerX, centerY, centerX, 900);
    }
}
