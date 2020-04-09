package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test extends Application {
	public void start(Stage primaryStage) {
		try {
			FXMLLoader fl = new FXMLLoader();
			fl.setLocation(fl.getClassLoader().getResource("application/Main.fxml"));
			BorderPane root = (BorderPane)fl.load();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("µÇÂ½");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
