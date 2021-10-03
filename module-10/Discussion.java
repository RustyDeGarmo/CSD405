import javafx.scene.control.Button;
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
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;


public class Discussion extends Application {
    //int to count button clicks
    private int clicks = 0;

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

        //get four random numbers to pick cards
        int cardNumber = deck[(int)(Math.random() * 54)];
        int cardNumberTwo = deck[(int)(Math.random() * 54)];
        int cardNumberThree = deck[(int)(Math.random() * 54)];
        int cardNumberFour = deck[(int)(Math.random() * 54)];
        int cardNumberFive = deck[(int)(Math.random() * 54)];

        //path to cards
        //X:\College\Bellevue\Intermediate Java\Module 8\cards
        Image imageOne = new Image(new FileInputStream("cards\\" + cardNumber + ".png"));
        Image imageTwo = new Image(new FileInputStream("cards\\" + cardNumberTwo + ".png"));
        Image imageThree = new Image(new FileInputStream("cards\\" + cardNumberThree + ".png"));
        Image imageFour = new Image(new FileInputStream("cards\\" + cardNumberFour + ".png"));
        Image imageFive = new Image(new FileInputStream("cards\\" + cardNumberFive + ".png"));

        //create the ImageViews
        ImageView viewOne = new ImageView();
        viewOne.setImage(imageOne);
        ImageView viewTwo = new ImageView();
        viewTwo.setImage(imageTwo);
        ImageView viewThree = new ImageView();
        viewThree.setImage(imageThree);
        ImageView viewFour = new ImageView();
        viewFour.setImage(imageFour);
        ImageView viewFive = new ImageView();
        viewFive.setImage(imageFive);

        //create strings for labels
        Label one = new Label("Card One");
        Label two = new Label("Card Two");
        Label three = new Label("Card Three");
        Label four = new Label("Card Four");
        Label five = new Label("Card Five");
        Label drawsLeft = new Label("Draws Remaining: ");
        Label draws = new Label(Integer.toString(clicks));

        //create a button to draw new cards
        Button btn = new Button("Draw New Cards");
        
        
        btn.setOnAction( e -> {
            counter();
        });

        if (clicks <= 0){
            btn.setDisable(true);
        }

        //pane to place space in the grid
        Pane spacer1 = new Pane();
        spacer1.minHeightProperty().bind(one.heightProperty());
        Pane spacer2 = new Pane();
        spacer2.minHeightProperty().bind(one.heightProperty());
        Pane spacer3 = new Pane();
        spacer3.minHeightProperty().bind(one.heightProperty());
        Pane spacer4 = new Pane();
        spacer4.minHeightProperty().bind(one.heightProperty());
        Pane spacer5 = new Pane();
        spacer5.minHeightProperty().bind(one.heightProperty());
        Pane spacer6 = new Pane();
        spacer6.minHeightProperty().bind(one.heightProperty());
        Pane spacer7 = new Pane();
        spacer7.minHeightProperty().bind(one.heightProperty());
        Pane spacer8 = new Pane();
        spacer8.minHeightProperty().bind(one.heightProperty());
        Pane spacer9 = new Pane();
        spacer9.minHeightProperty().bind(one.heightProperty());

        //create a gridpane to hold the four cards
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(5,5,5,5));


        //create the scene
        Scene scene = new Scene(root, 500, 200);

        //add the images to the gridpane
        root.addRow(0, viewOne, viewTwo, viewThree, viewFour, viewFive);
        root.addRow(1, one, two, three, four, five);
        root.addRow(2, spacer1, spacer2, spacer3, spacer4, spacer5);
        root.addRow(3, spacer6, btn, drawsLeft, draws);
        

        //set scene to the stage
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void counter(){
        clicks--;
    }
}