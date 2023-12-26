package com.regalo.regalo;

import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;

public class SunflowerCanvas {
    private final StackPane root;
    private final Canvas canvas;

    public SunflowerCanvas() {
        this.root = new StackPane();
        this.canvas = new Canvas(600, 900);
        this.root.getChildren().add(canvas);
        this.root.setStyle("-fx-background-color: black;");
    }

    public StackPane getRoot() {
        return root;
    }

    public void draw() {
        double canvasCenterX = canvas.getWidth() / 2;
        double canvasCenterY = canvas.getHeight() / 2;

        Stem.drawStem(canvas.getGraphicsContext2D(), canvasCenterX, canvasCenterY);
        FloralChapter.drawFloralChapter(canvas.getGraphicsContext2D(), canvasCenterX, canvasCenterY);
    }
}