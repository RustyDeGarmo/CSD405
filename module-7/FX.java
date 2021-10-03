/*
Rusty DeGarmo
Professor Payne
Intermediate Java
13 September 2021
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FX extends Application {
    public static void main(String [] args){
        launch(args);
    }

    @Override // override start
    public void start(Stage primaryStage){
        

        Button b1 = new Button("Great!");
        Button b2 = new Button("Awesome!");
        Button b3 = new Button("Fantastic!");
        Button b4 = new Button("Amazing!");

        //create a VBox and give the elements in the box just a little space
        VBox vBox = new VBox(5);
        vBox.getChildren().addAll(b1, b2, b3, b4);

        TitledPane t1 = new TitledPane("JavaFX is: ", vBox);

        Button b5 = new Button("Fun");
        Button b6 = new Button("Exciting");
        Button b7 = new Button("Interesting");
        Button b8 = new Button("The Future");


        VBox vBox2 = new VBox(5);
        vBox2.getChildren().addAll(b5, b6, b7, b8);

        TitledPane t2 = new TitledPane("Programming is: ", vBox2);

        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(t1, t2);

        VBox outerBox = new VBox(accordion);

        Scene scene = new Scene(outerBox, 300, 215);
        primaryStage.setTitle("JavaFX Module 7");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}


