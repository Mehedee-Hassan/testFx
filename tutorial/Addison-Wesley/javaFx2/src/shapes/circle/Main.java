package shapes.circle;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        drawCircle(primaryStage);

    }



    private void drawCircle(Stage primaryStage) {

        int radius = 80;
        int strokeWidth = 2;
        Color strokeColor = Color.BROWN;

        Group root = new Group();

        Circle circle1 = new Circle(110,100,radius,Color.CORAL);
        circle1.setStroke(strokeColor);
        circle1.setStrokeWidth(strokeWidth);

        Circle circle2 = new Circle(220,100,radius,Color.YELLOW);
        circle2.setStroke(strokeColor);
        circle2.setStrokeWidth(strokeWidth);

        Circle circle3 = new Circle(330,100,radius,Color.PALEGREEN);
        circle3.setStroke(strokeColor);
        circle3.setStrokeWidth(strokeWidth);







        Text text = new Text(50,100,"Text String");
        text.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 50));
        text.setFill(Color.LIGHTSALMON);
        text.setStroke(Color.DARKBLUE);
        text.setStrokeWidth(2);
        text.setUnderline(true);


        root.getChildren().addAll(circle1, circle2, circle3);

        Scene scene = new Scene(root ,650 ,200);
        primaryStage.setTitle("Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


}
