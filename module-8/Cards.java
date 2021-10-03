/*
Rusty DeGarmo
Professor Payne
Intermediate Java
19 September 2021
*/

import javafx.application.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.lang.Math;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

public class Cards extends Application {
    public static void main(String [] args){
        launch(args);
    }

    @Override // override start
    public void start(Stage primaryStage) throws FileNotFoundException{
        
        //create the card deck
        int[] deck = new int[54];
        for(int i=0; i<54; i++) {
            deck[i] = i+1;
        }

        //get four random numbers to pick cards
        int cardNumber = deck[(int)(Math.random() * 54 + 1)];
        int cardNumberTwo = deck[(int)(Math.random() * 54 + 1)];
        int cardNumberThree = deck[(int)(Math.random() * 54 + 1)];
        int cardNumberFour = deck[(int)(Math.random() * 54 + 1)];

        //path to cards
        //X:\College\Bellevue\Intermediate Java\Module 8\cards
        Image imageOne = new Image(new FileInputStream("cards\\" + cardNumber + ".png"));
        Image imageTwo = new Image(new FileInputStream("cards\\" + cardNumberTwo + ".png"));
        Image imageThree = new Image(new FileInputStream("cards\\" + cardNumberThree + ".png"));
        Image imageFour = new Image(new FileInputStream("cards\\" + cardNumberFour + ".png"));

        //create the ImageViews
        ImageView viewOne = new ImageView();
        viewOne.setImage(imageOne);
        ImageView viewTwo = new ImageView();
        viewTwo.setImage(imageTwo);
        ImageView viewThree = new ImageView();
        viewThree.setImage(imageThree);
        ImageView viewFour = new ImageView();
        viewFour.setImage(imageFour);

        //create strings for labels
        Label one = new Label("Card One");
        Label two = new Label("Card Two");
        Label three = new Label("Card Three");
        Label four = new Label("Card Four");

        //create a gridpane to hold the four cards
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(5,5,5,5));

        //create the scene
        Scene scene = new Scene(root);

        //add the images to the gridpane
        root.addRow(0, one, two);
        root.addRow(1, viewOne, viewTwo);
        root.addRow(2, three, four);
        root.addRow(3, viewThree, viewFour);

        //set scene to the stage
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}


