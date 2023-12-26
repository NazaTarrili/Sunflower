package com.regalo.regalo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RayFloret {
    public static void drawRayFloret(GraphicsContext context, double centerX, double centerY, double floralRadius) {
        int totalRayFlorets = 30;
        double rayLength = 90;
        double rayWidth = rayLength / 3;
        double borderStrokeWidth = 2; // Ancho del borde marrón claro

        for (int i = 0; i < totalRayFlorets; i++) {
            double angle = Math.toRadians(i * (360.0 / totalRayFlorets));

            // Calculate starting point of the ray (at the floral radius)
            double startX = centerX + floralRadius * Math.cos(angle);
            double startY = centerY + floralRadius * Math.sin(angle);

            // Calculate ending point of the ray
            double endX = startX + rayLength * Math.cos(angle);
            double endY = startY + rayLength * Math.sin(angle);

            // Draw the brown border
            context.setStroke(Color.SADDLEBROWN); // Puedes ajustar el color marrón según tus preferencias
            context.setLineWidth(rayWidth + 2 * borderStrokeWidth); // Ajusta el ancho del borde según tus preferencias
            context.strokeLine(startX, startY, endX, endY);

            // Draw the ray floret on top of the border
            context.setStroke(Color.YELLOW);
            context.setLineWidth(rayWidth);
            context.strokeLine(startX, startY, endX, endY);
        }
    }
}
