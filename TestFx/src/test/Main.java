package test;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Button button = new Button("Hello");
		StackPane stackPane  = new StackPane();
		
		stackPane.getChildren().add(button);
		
		Scene scene = new Scene(stackPane);
		
		
		primaryStage.setScene(scene);
		primaryStage.setWidth(300);
		primaryStage.setHeight(300);
		primaryStage.show();
		
		
	}

	
	public static void main(String [] args){
		launch(args);
	}
	
}
