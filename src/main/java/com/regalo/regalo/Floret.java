package com.regalo.regalo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Floret {
    public static void drawFloret(GraphicsContext context, double centerX, double centerY) {
        double centerRadius = 3;
        Color orangeColor = Color.ORANGE;
        Color brownColor = Color.SADDLEBROWN;

        double startX = centerX - centerRadius;
        double startY = centerY - centerRadius;
        double diameter = centerRadius * 2;

        // Floret Center
        context.setFill(orangeColor);
        context.fillOval(startX, startY, diameter, diameter);

        // Floret Border
        context.setStroke(brownColor);
        context.setLineWidth(1.5);
        context.strokeOval(startX, startY, diameter, diameter);
    }
}
