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


      //  drawCircle(primaryStage);
        drawRectangel(primaryStage);
    }

    private void drawRectangel(Stage primaryStage) {

        int strokWidth = 2;
        int arcWidth = 30;
        int arcHeight = 30;

        Color strokeColor = Color.BROWN;

        Group root = new Group();
        Rectangle rectangle1 = new Rectangle(40 ,40 ,80,80);
        rectangle1.setFill(Color.LIGHTSALMON);
        rectangle1.setStroke(strokeColor);
        rectangle1.setStrokeWidth(strokWidth);
        rectangle1.setArcHeight(arcHeight);
        rectangle1.setArcWidth(arcWidth);

        root.getChildren().addAll(rectangle1);

        Scene scene = new Scene(root ,650 ,200);
        primaryStage.setTitle("Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    private void drawCircle(Stage primaryStage) {

        int radius = 80;
        int strokeWidth = 2;
        Color strokeColor = Color.BROWN;

        Group root = new Group();

        Circle circle1 = new Circle(110,100,radius,Color.CORAL);
        circle1.setStroke(strokeColor);
        circle1.setStrokeWidth(strokeWidth);

        Circle circle2 = new Circle(280,100,radius,Color.YELLOW);
        circle2.setStroke(strokeColor);
        circle2.setStrokeWidth(strokeWidth);

        Circle circle3 = new Circle(450,100,radius,Color.PALEGREEN);
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
