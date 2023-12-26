package com.regalo.regalo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Floret {

    public static void drawFloret(GraphicsContext context, double centerX, double centerY) {
        drawFloretCenter(context, centerX, centerY);
        drawFloretBorder(context, centerX, centerY);
    }

    private static void drawFloretCenter(GraphicsContext context, double centerX, double centerY) {
        double centerRadius = 3;
        Color orangeColor = Color.ORANGE;

        double startX = centerX - centerRadius;
        double startY = centerY - centerRadius;
        double diameter = centerRadius * 2;

        context.setFill(orangeColor);
        context.fillOval(startX, startY, diameter, diameter);
    }

    private static void drawFloretBorder(GraphicsContext context, double centerX, double centerY) {
        double centerRadius = 3;
        Color brownColor = Color.SADDLEBROWN;

        double startX = centerX - centerRadius;
        double startY = centerY - centerRadius;
        double diameter = centerRadius * 2;

        context.setStroke(brownColor);
        context.setLineWidth(1.5);
        context.strokeOval(startX, startY, diameter, diameter);
    }
}