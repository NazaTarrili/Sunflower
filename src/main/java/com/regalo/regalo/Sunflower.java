package com.regalo.regalo;

import javafx.application.Application;
import javafx.scene.Scene;
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
        SunflowerCanvas sunflowerCanvas = new SunflowerCanvas();
        sunflowerCanvas.draw();

        primaryStage.setTitle("Sunflower");
        primaryStage.setScene(new Scene(sunflowerCanvas.getRoot(), 600, 900));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
