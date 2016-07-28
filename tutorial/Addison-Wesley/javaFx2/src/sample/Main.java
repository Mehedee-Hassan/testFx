package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        manualSetup3(primaryStage);

        //manualSetup2(primaryStage);
        //manualSetup(primaryStage);
    }

    private void manualSetup3(Stage primaryStage) throws Exception {
        new TextShapeCss().start(primaryStage);
    }

    private void manualSetup2(Stage primaryStage) {
        Group root = new Group();
        Text text = new Text(50,100,"Text String");
        text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC,50));
        text.setFill(Color.LIGHTSALMON);
        text.setStroke(Color.DARKBLUE);
        text.setStrokeWidth(2);
        text.setUnderline(true);


        root.getChildren().add(text);

        Scene scene = new Scene(root ,650 ,200);
        primaryStage.setTitle("text");
        primaryStage.setScene(scene);
        primaryStage.show();

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
