package shapes.gradients;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
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
        drawRectangle(primaryStage);
    }

    private void drawRectangle(Stage primaryStage) {

        int strokWidth = 2;
        int arcWidth = 30;
        int arcHeight = 30;

        Color strokeColor = Color.BROWN;

        Group root = new Group();
        Rectangle rectangle1 =makeRectangel(40, 0, 1);
        Rectangle rectangle2 =makeRectangel(200 ,1 ,0);
        Rectangle rectangle3 =makeRectangel(360 ,0.1 ,0.6);





        root.getChildren().addAll(rectangle1,rectangle2,rectangle3);

        Scene scene = new Scene(root ,650 ,500);
        primaryStage.setTitle("Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    private Rectangle makeRectangel(double y ,double scaleX, double scaleY){

        Rectangle rectangle = new Rectangle();
        rectangle.setX(180);
        rectangle.setY(y);

        rectangle.setWidth(220);
        rectangle.setHeight(100);
        rectangle.setArcHeight(30);
        rectangle.setArcWidth(30);
        rectangle.setFill(doLinearGradient(scaleX,scaleY));


        return rectangle;


    }

    private Paint doLinearGradient(double scaleX, double scaleY) {
        LinearGradient linearGradientPaint = new LinearGradient(
                180,
                40,
                180+scaleX*220,
                40+scaleY*100,
                false,
                CycleMethod.REFLECT,
                new Stop(0.0,Color.ORANGE),
                new Stop(1.0,Color.LIME)

        );

        return linearGradientPaint;
    }


    public static void main(String[] args) {
        launch(args);
    }


}
