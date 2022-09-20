//here, im going to demonstrate how to use the Rectangle class inJavaFX

package com.example.useshapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ShowRectangle extends Application {

    public void start(Stage primaryStage) {

        Pane pane = new Pane();
//here, *REMEMBER* in our class 'Rectangle', intellij will automatically implement the reference inside its piece
        //of data, just the word "Rectangle" here has its own meaning beyond just the reference itself.
        Rectangle r1 = new Rectangle(25, 10, 60, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        pane.getChildren().add(new Text(10, 27, "r1"));
        pane.getChildren().add(r1);

        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("ShowRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}