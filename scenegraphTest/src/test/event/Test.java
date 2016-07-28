package test.event;

import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test extends Application{


		@Override
		public void start(Stage primaryStage) throws Exception {
			HBox hBox = new HBox();
			hBox.setBackground(null);
			hBox.setAlignment(Pos.CENTER);
			hBox.setSpacing(12);
			Button aButton = new Button("Press Me!");
			aButton.setId("aButton");
			aButton.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
			aButton.setOnAction(e -> changeNodeVisibility(aButton.getScene(),
					"aCheckBox"));
					
			CheckBox aCheckBox = new CheckBox("Hello!");
			aCheckBox.setId("aCheckBox");
			aCheckBox.setOpacity(0.7d);
			aCheckBox.setEffect(new Reflection());
			hBox.getChildren().addAll(aButton,aCheckBox);
			
			Scene aScene = new Scene(hBox ,400 ,400);
			primaryStage.setScene(aScene);
			primaryStage.show();
			
				
		}

		private void changeNodeVisibility(Scene scene, String id) {
			Node node = scene.lookup("#" +id);
			
			if(node != null){
				node.setVisible(!node.isVisible());
				System.out.println("not null");
			}
			
		}
	
	
		public static void main(String[] args){
			launch(args);
		}
}
