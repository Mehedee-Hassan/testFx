package sample;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextShapeCss extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();

        Text text = new Text(50 ,100,"TEST");
        text.setId("textLabel");
        root.getChildren().add(text);
        Scene scene = new Scene(root ,650 ,200);

        String cssFile = getClass().getResource("Text.css").toExternalForm();
        scene.getStylesheets().add(cssFile);

        primaryStage.setTitle("text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String [] args){
        launch(args);
    }


}