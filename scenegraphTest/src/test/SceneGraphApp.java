package test;





import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SceneGraphApp extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception{
		HBox hBox = new HBox();
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().add(new Button("button 1"));
		hBox.getChildren().add(new Button("button 2"));
		hBox.getChildren().add(new Button("button 3"));
		
		VBox vBox = new VBox();
		vBox.getChildren().add(new Button("button 4"));
		vBox.getChildren().add(new Button("button 5"));
		
		
		hBox.getChildren().add(vBox);
		
		Scene myScene = new Scene(hBox ,800,600);
		
		myScene.setOnMouseClicked(e-> myScene.setRoot(vBox));
		myScene.setOnKeyTyped(e-> myScene.setRoot(hBox));
		myScene.setCursor(Cursor.HAND);
		myScene.nodeOrientationProperty().setValue(NodeOrientation.RIGHT_TO_LEFT);
		myScene.setFill(Color.BLACK);
		
		primaryStage.setScene(myScene);
		primaryStage.show();
		
			
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	
}
