package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox root = new HBox(0);
			root.setMaxSize(1100, 650);
			root.setMinSize(1100, 650);
			root.setAlignment(Pos.CENTER_LEFT);
			VBox vbox = new VBox(20);
			vbox.setAlignment(Pos.CENTER);
			vbox.setPadding(new Insets(20, 15, 5, 50));
			Scene scene = new Scene(root,1100,650);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			TextField username = new TextField();
			TextField password = new TextField();
			Button logIn = new Button("Log-In");
			Button signUp = new Button("Sign-Up");
			vbox.getChildren().addAll(username, password, logIn, signUp);
			root.getChildren().add(vbox);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
