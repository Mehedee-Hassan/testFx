package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Scene scene = new Scene(root ,500 ,250,Color.LIGHTYELLOW);

            primaryStage.setTitle("Hello");
            primaryStage.setScene(scene);
            primaryStage.show();

//        manualSetup(primaryStage);
    }



    public static void main(String[] args) {
        launch(args);
    }


    private void manualSetup(Stage primaryStage) {

        StackPane root = new StackPane();

        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.GRAY);
        dropShadow.setOffsetY(3.0);


        Rectangle rectangle = new Rectangle(400 ,60,Color.LIGHTBLUE);
        rectangle.setArcHeight(20);
        rectangle.setArcWidth(20);
        rectangle.setEffect(dropShadow);


        Text text = new Text("Hello");
        text.setFill(Color.DARKSLATEGRAY);
        text.setFont(Font.font(null, FontWeight.BOLD ,32));
        text.setEffect(dropShadow);


        root.getChildren().addAll(rectangle,text);


        Scene scene = new Scene(root , 500 ,250 ,Color.LIGHTYELLOW);

        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
