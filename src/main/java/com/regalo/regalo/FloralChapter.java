package com.regalo.regalo;

import javafx.scene.canvas.GraphicsContext;

/**
 * <h1>Flower Head</h1><br>
 * The floral chapter of a sunflower has 2 opposing spirals of florets.<br>
 * These spirals follow a Fibonacci pattern.
 * Each spiral has around 1000 florets.
 */
public class FloralChapter {
    public static void drawFloralChapter(GraphicsContext context, double centerX, double centerY) {
        double floralRadius = drawSpiral(context, centerX, centerY, true);
        drawSpiral(context, centerX, centerY, false);

        // Llama a drawRayFloret para dibujar una ligula
        RayFloret.drawRayFloret(context, centerX, centerY, floralRadius);
    }

    private static double drawSpiral(GraphicsContext context, double centerX, double centerY, boolean clockwise) {
        int totalFlorets = 1000;

        double phi = (1 + Math.sqrt(5)) / 2;
        double aureusAngle = clockwise ? 360 / phi : -360 / phi; // Dirección de la espiral
        double radiusIncrement = 0.1; // centimeters

        double floralRadius = 0; // Save the floral chapter radius

        for (int i = 0; i < totalFlorets; i++) {
            double angle = Math.toRadians(i * aureusAngle);
            floralRadius = i * radiusIncrement;

            // Calculate floret coordinates
            double floretX = centerX + floralRadius * Math.cos(angle);
            double floretY = centerY + floralRadius * Math.sin(angle);

            Floret.drawFloret(context, floretX, floretY);
        }

        return floralRadius;
    }
}
