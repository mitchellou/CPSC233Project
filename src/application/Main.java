package application;
	
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			AnchorPane root = loader.load(new FileInputStream("src/application/ProjectScene.fxml"));
			CoursePlannerController controller = (CoursePlannerController)loader.getController();
			controller.applicationStage = primaryStage;
			Scene scene = new Scene(root,800,750);	
			primaryStage.setScene(scene);
			primaryStage.setTitle("Course Planner");			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
