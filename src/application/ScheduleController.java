package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
//import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class ScheduleController {

	Stage applicationStage;
	
    @FXML
    private ChoiceBox<?> numberOfCourseCBox;

    @FXML
    private ChoiceBox<?> semesterChoiceBox;

    @FXML
    void enterCourseInfo(ActionEvent enterCourseInfoEvent) {
    	Scene mainScene = applicationStage.getScene();
    	
    	VBox courseInfoContainer = new VBox();
    	Label courseNameLabel = new Label("Course Name");
    	TextField courseNameTextfield = new TextField();
    	//Label courseDateLabel = new Label("Course Date");
    	//CheckBox courseDate = new CheckBox();
    	Label courseTimeLabel = new Label("Course Time");
    	Slider courseTimeSlider = new Slider();
    	
    	Button doneButton = new Button("Done");
    	doneButton.setOnAction(doneEvent -> applicationStage.setScene(mainScene));
    	
    	courseInfoContainer.getChildren().addAll(courseNameLabel, courseNameTextfield, courseTimeLabel, courseTimeSlider, doneButton);
    	Scene courseInfoScene = new Scene(courseInfoContainer);
    	applicationStage.setScene(courseInfoScene);
    }

    @FXML
    void createSchedule(ActionEvent event) {
    	System.out.println("Semester selected: " + semesterChoiceBox.getValue());
    }

}
