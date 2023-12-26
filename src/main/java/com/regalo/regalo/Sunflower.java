package com.regalo.regalo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * <h1>Sunflower</h1>
 * <span>The sunflowers have an different parts:</span>
 * <ol>
 *     <li>Floral chapter</li>
 *     <li>Florets</li>
 *     <li>Ray florets</li>
 *     <li>Stem</li>
 * </ol>
 * <span>This method draw a sunflower whit JavaFX</span>
 */
public class Sunflower extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Canvas canvas = new Canvas(600, 900);
        GraphicsContext context = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);

        // Backgroung color
        root.setStyle("-fx-background-color: black;");

        double canvasCenterX = canvas.getWidth() / 2;
        double canvasCenterY = canvas.getHeight() / 2;

        // Draw a Floret in center
        Stem.drawStem(context, canvasCenterX, canvasCenterY);
        FloralChapter.drawFloralChapter(context, canvasCenterX, canvasCenterY);

        primaryStage.setTitle("Sunflower");
        primaryStage.setScene(new Scene(root, 600, 900));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
