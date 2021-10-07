/*
Rusty DeGarmo
Professor Payne
Intermediate Java Programming
6 October 2021
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import java.lang.Math;


/*
The purpose of this program is to display a shape based on a selection of
radio buttons. A checkbox will allow the user to fill the shape with a random
color.
*/

public class Shapes extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //create a rectangle, circle, ellipse, and polygon
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Ellipse ellipse = new Ellipse();
        Polygon polygon = new Polygon();

        //give all of the shapes a black outline and white filling
        rectangle.setStroke(Color.BLACK);
        circle.setStroke(Color.BLACK);
        ellipse.setStroke(Color.BLACK);
        polygon.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);                
        circle.setFill(Color.WHITE);                
        ellipse.setFill(Color.WHITE);
        polygon.setFill(Color.WHITE);

        //create radio buttons for the shapes
        RadioButton rbRectangle = new RadioButton("Rectangle");
        RadioButton rbCircle = new RadioButton("Circle");
        RadioButton rbEllipse = new RadioButton("Ellipse");
        RadioButton rbPolygon = new RadioButton("Polygon");

        //togglegroup for the radiobuttons, defaults to rectangle
        ToggleGroup toggle = new ToggleGroup();
        rbRectangle.setToggleGroup(toggle);
        rbCircle.setToggleGroup(toggle);
        rbEllipse.setToggleGroup(toggle);
        rbPolygon.setToggleGroup(toggle);
        
        //checkbox to randomize the fill color of the displayed shape
        CheckBox ranColor = new CheckBox("Colorize");
        
        //pane for shape
        Pane paneForShape = new Pane();
        paneForShape.setPadding(new Insets(20, 20, 20, 20));
        paneForShape.setStyle("-fx-border-width: 1px; -fx-border-color: black");
        rbRectangle.setOnAction(e -> {
            paneForShape.getChildren().removeAll(circle, ellipse, polygon);
            rectangle.setX(20);
            rectangle.setY(20);
            rectangle.widthProperty().bind(paneForShape.widthProperty().subtract(50));
            rectangle.heightProperty().bind(paneForShape.heightProperty().subtract(50));
            paneForShape.getChildren().add(rectangle);
        });

        rbCircle.setOnAction(e -> {
            paneForShape.getChildren().removeAll(rectangle, ellipse, polygon);
            circle.centerXProperty().bind(paneForShape.widthProperty().divide(2));
            circle.centerYProperty().bind(paneForShape.heightProperty().divide(2));
            circle.radiusProperty().bind(paneForShape.widthProperty().add(paneForShape.heightProperty()).divide(4).subtract(30));
            paneForShape.getChildren().add(circle);
        });

        rbEllipse.setOnAction(e -> {
            paneForShape.getChildren().removeAll(circle, rectangle, polygon);
            ellipse.centerXProperty().bind(paneForShape.widthProperty().divide(2));
            ellipse.centerYProperty().bind(paneForShape.heightProperty().divide(2));
            ellipse.radiusXProperty().bind(paneForShape.widthProperty().divide(2).subtract(25));
            ellipse.radiusYProperty().bind(paneForShape.heightProperty().divide(2).subtract(25));
            paneForShape.getChildren().add(ellipse);
        });

        rbPolygon.setOnAction(e -> {
            paneForShape.getChildren().removeAll(circle, ellipse, rectangle, polygon);
            //get a random number of points for a polygon, but make sure it's an even number
            int polyPoints = (int)(randomNumber()/60)*2;
            for(int i = 0; i < polyPoints; i++){
                polygon.getPoints().add(randomNumber());
            }
            paneForShape.getChildren().add(polygon);
        });

        //pane for radiobuttons
        VBox vBoxForRadio = new VBox(20);
        vBoxForRadio.setPadding(new Insets(5, 5, 5, 5));
        vBoxForRadio.getChildren().addAll(rbRectangle, rbCircle, rbEllipse, rbPolygon);
        vBoxForRadio.setStyle("-fx-border-width: 1px; -fx-border-color: black");


        //pane for checkbox
        Pane paneForCheck = new Pane();
        paneForCheck.setPadding(new Insets(5, 5, 5, 5));
        paneForCheck.getChildren().add(ranColor);
        paneForCheck.setStyle("-fx-border-width: 1px; -fx-border-color: black");


        //set the handler for the checkbox
        EventHandler<ActionEvent> handler = e -> {
            if(ranColor.isSelected()) {
                Color color = Color.color(Math.random(), Math.random(), Math.random());
                rectangle.setFill(color);                
                circle.setFill(color);                
                ellipse.setFill(color);
                polygon.setFill(color);
                
            }else {
                rectangle.setFill(Color.WHITE);                
                circle.setFill(Color.WHITE);                
                ellipse.setFill(Color.WHITE);
                polygon.setFill(Color.WHITE);
            }
        }; 
        ranColor.setOnAction(handler);

        //create a borderpane to hold our elements
        BorderPane pane = new BorderPane();
        pane.setCenter(paneForShape);
        pane.setLeft(paneForCheck);
        pane.setRight(vBoxForRadio);

        //create the scene and place it in the stage
        Scene scene = new Scene(pane, 500, 300);
        primaryStage.setTitle("Random Shape Filling");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

        //generate a random number for polygon points
        private double randomNumber() {
            return Math.random() * 250;
        }

}
