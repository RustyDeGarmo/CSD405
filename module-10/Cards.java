/*
Rusty DeGarmo
Professor Payne
Intermediate Java Programming
30 September 2021
*/


import javafx.scene.control.Button;
import javafx.application.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.lang.Math;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Cards extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override // override start
    public void start(Stage primaryStage) throws FileNotFoundException{
        

        //create the card deck
        int[] deck = new int[54];
        for(int i=0; i<54; i++) {
            deck[i] = i+1;
        }
        

        
        //create the ImageViews
        ImageView viewOne = new ImageView();
        viewOne.setImage(new Image(new FileInputStream("cards\\" + deck[(int)(Math.random() * 54)] + ".png")));
        ImageView viewTwo = new ImageView();
        viewTwo.setImage(new Image(new FileInputStream("cards\\" + deck[(int)(Math.random() * 54)] + ".png")));
        ImageView viewThree = new ImageView();
        viewThree.setImage(new Image(new FileInputStream("cards\\" + deck[(int)(Math.random() * 54)] + ".png")));
        ImageView viewFour = new ImageView();
        viewFour.setImage(new Image(new FileInputStream("cards\\" + deck[(int)(Math.random() * 54)] + ".png")));

        //create strings for labels
        Label one = new Label("Card One");
        Label two = new Label("Card Two");
        Label three = new Label("Card Three");
        Label four = new Label("Card Four");

        //create a button to draw new cards
        Button btn = new Button("Refresh");
        
        btn.setOnAction( e -> {
            viewOne.setImage(new Image("cards\\" + deck[(int)(Math.random() * 54)] + ".png"));
            viewTwo.setImage(new Image("cards\\" + deck[(int)(Math.random() * 54)] + ".png"));
            viewThree.setImage(new Image("cards\\" + deck[(int)(Math.random() * 54)] + ".png"));
            viewFour.setImage(new Image("cards\\" + deck[(int)(Math.random() * 54)] + ".png"));
        });

        //pane to place space in the grid
        Pane spacer1 = new Pane();
        spacer1.minHeightProperty().bind(one.heightProperty());
        Pane spacer2 = new Pane();
        spacer2.minHeightProperty().bind(one.heightProperty());
        Pane spacer3 = new Pane();
        spacer3.minHeightProperty().bind(one.heightProperty());
        Pane spacer4 = new Pane();
        spacer4.minHeightProperty().bind(one.heightProperty());
        

        //create a gridpane to hold the four cards
        GridPane gPane = new GridPane();
        gPane.setHgap(5);
        gPane.setVgap(5);
        gPane.setPadding(new Insets(5,5,5,5));
        
        //add the images to the gridpane
        gPane.addRow(0, viewOne, viewTwo, viewThree, viewFour);
        gPane.addRow(1, one, two, three, four);
        gPane.addRow(2, spacer1, spacer2, spacer3, spacer4);        

        VBox root = new VBox();
        root.getChildren().addAll(gPane, btn);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10, 10, 10, 10));

        //create the scene
        Scene scene = new Scene(root);
        
        //set scene to the stage
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}