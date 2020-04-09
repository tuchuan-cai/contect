package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	User user = new User();
	Label uNameLabel = new Label("ÕËºÅ:");
	Label pswLabel = new Label("ÃÜÂë:");
	TextField userTF = new TextField();
	PasswordField pswTF = new PasswordField();
	Button loginBtn = new Button("µÇÂ½");
	Button subBtn = new Button("×¢²á");
	VBox vB = new VBox();
	HBox hB1 = new HBox();
	HBox hB2 = new HBox();
	HBox btns = new HBox();
	@Override
	public void start(Stage primaryStage) {
		try {
			hB1.getChildren().addAll(uNameLabel, userTF);
			hB1.setAlignment(Pos.CENTER);
			hB2.getChildren().addAll(pswLabel, pswTF);
			hB2.setAlignment(Pos.CENTER);
			vB.getChildren().addAll(hB1, hB2);
			vB.setSpacing(10);
			vB.setPadding(new Insets(20));
			btns.getChildren().addAll(subBtn, loginBtn);
			btns.setAlignment(Pos.CENTER);
			btns.setSpacing(10);
			btns.setPadding(new Insets(0,0,20,0));
			BorderPane root = new BorderPane();
			root.setCenter(vB);
			root.setBottom(btns);
			Scene scene = new Scene(root,400,150);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
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
