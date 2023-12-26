package com.regalo.regalo;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RayFloret {
    public static void drawRayFloret(GraphicsContext context, double centerX, double centerY, double floralRadius) {
        int totalRayFlorets = 30;
        double rayLength = 90;
        double rayWidth = rayLength / 3;


        for (int i = 0; i < totalRayFlorets; i++) {
            drawSingleRayFloret(context, centerX, centerY, floralRadius, rayLength, rayWidth, totalRayFlorets, i);
        }
    }

    private static void drawSingleRayFloret(
            GraphicsContext context,
            double centerX,
            double centerY,
            double floralRadius,
            double rayLength,
            double rayWidth,
            int totalRayFlorets,
            int index
    ) {

        double angle = Math.toRadians(index * (360.0 / totalRayFlorets));

        // Calculate starting point of the ray (at the floral radius)
        double startX = centerX + floralRadius * Math.cos(angle);
        double startY = centerY + floralRadius * Math.sin(angle);

        // Calculate ending point of the ray
        double endX = startX + rayLength * Math.cos(angle);
        double endY = startY + rayLength * Math.sin(angle);

        // Draw the brown border
        drawRayBorder(context, startX, startY, endX, endY, rayWidth);

        // Draw the ray floret on top of the border
        drawRayFloret(context, startX, startY, endX, endY, rayWidth);
    }

    private static void drawRayBorder(GraphicsContext context, double startX, double startY, double endX, double endY, double rayWidth) {
        double borderStrokeWidth = 2;

        context.setStroke(Color.SADDLEBROWN);
        context.setLineWidth(rayWidth + 2 * borderStrokeWidth);
        context.strokeLine(startX, startY, endX, endY);
    }

    private static void drawRayFloret(GraphicsContext context, double startX, double startY, double endX, double endY, double rayWidth) {
        context.setStroke(Color.YELLOW);
        context.setLineWidth(rayWidth);
        context.strokeLine(startX, startY, endX, endY);
    }
}
