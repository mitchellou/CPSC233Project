package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CoursePlannerController {
	Stage applicationStage;
	
	
	 @FXML
	    private ChoiceBox<String> SemesterBox;
	 
	 @FXML
	    private Label userNameLabel;
	 @FXML
	    private Label userIdLabel;
	 
	 @FXML
	 	private Label courseNameLabel;
	 
	 @FXML
	 	private Label studentNameLabel;	 
	 @FXML
		private GridPane grid;
	 @FXML 
		private Label monday8Label;
	 @FXML
	 	private Label monday9Label;
	 @FXML
	 	private Label monday10Label;
	 @FXML
	 	private Label monday11Label;
	 @FXML
	 	private Label monday12Label;
	 @FXML
	 	private Label monday1Label;
	 @FXML
	 	private Label monday2Label;
	 @FXML
	 	private Label monday3Label;
	 @FXML
	 	private Label monday4Label;
	 @FXML
	 	private Label monday5Label;
	 @FXML
	 	private Label monday6Label;
	 @FXML
	 	private Label tuesday8Label;
	 @FXML
	 	private Label tuesday9Label;
	 @FXML
	 	private Label tuesday10Label;
	 @FXML
	 	private Label tuesday11Label;
	 @FXML
	 	private Label tuesday12Label;
	 @FXML
	 	private Label tuesday1Label;
	 @FXML
	 	private Label tuesday2Label;
	 @FXML
	 	private Label tuesday3Label;
	 @FXML
	 	private Label tuesday4Label;
	 @FXML
	 	private Label tuesday5Label;
	 @FXML
	 	private Label tuesday6Label;
	 @FXML
	 	private Label wednesday8Label;
	 @FXML
	 	private Label wednesday9Label;
	 @FXML
	 	private Label wednesday10Label;
	 @FXML
	 	private Label wednesday11Label;
	 @FXML
	 	private Label wednesday12Label;
	 @FXML
	 	private Label wednesday1Label;
	 @FXML
	 	private Label wednesday2Label;
	 @FXML
	 	private Label wednesday3Label;
	 @FXML
	 	private Label wednesday4Label;
	 @FXML
	 	private Label wednesday5Label;
	 @FXML
	 	private Label wednesday6Label;
	 @FXML
	 	private Label thursday8Label;
	 @FXML
	 	private Label thursday9Label;
	 @FXML
	 	private Label thursday10Label;
	 @FXML
	 	private Label thursday11Label;
	 @FXML
	 	private Label thursday12Label;
	 @FXML
	 	private Label thursday1Label;
	 @FXML
	 	private Label thursday2Label;
	 @FXML
	 	private Label thursday3Label;
	 @FXML
	 	private Label thursday4Label;
	 @FXML
	 	private Label thursday5Label;
	 @FXML
	 	private Label thursday6Label;
	 @FXML
	 	private Label friday8Label;
	 @FXML
	 	private Label friday9Label;
	 @FXML
	 	private Label friday10Label;
	 @FXML
	 	private Label friday11Label;
	 @FXML
	 	private Label friday12Label;
	 @FXML
	 	private Label friday1Label;
	 @FXML
	 	private Label friday2Label;
	 @FXML
	 	private Label friday3Label;
	 @FXML
	 	private Label friday4Label;
	 @FXML
	 	private Label friday5Label;
	 @FXML
	 	private Label friday6Label;
	 
	 

	 
// This part of the code activates when the user clicks the add personal info button, NOT complete, needs to change the label
	 // on the main screen.
	 
	 void displayInfo(Scene mainScene, TextField inputNameTextField, TextField inputIdTextField ){
	    	
	    	String nameEntered = inputNameTextField.getText();
	    	
	    	System.out.println(nameEntered);
	    	
	    	studentNameLabel.setText((String.format("Your overall course grade" + nameEntered)));
	   
	    	applicationStage.setScene(mainScene);
	    	
	    }
	 
	 
	 
	 	 
	 
    @FXML
    void addInfo(ActionEvent enterInfoEvent) {
    	Scene mainScene = applicationStage.getScene();
    	
    	HBox infoRow = new HBox();
    	Label inputNameLabel = new Label("Enter your name");
    	TextField inputNameTextField = new TextField();
    	Label inputIdLabel = new Label("Enter your UCID");
    	TextField inputIdTextField = new TextField();
    	Button doneButton = new Button("Done");
    	infoRow.getChildren().addAll(inputNameLabel,inputNameTextField,inputIdLabel,inputIdTextField,doneButton);
    	doneButton.setOnAction(doneEvent -> applicationStage.setScene(mainScene));
    	
 	
    	Scene infoScene = new Scene(infoRow);
    	applicationStage.setScene(infoScene);
    
    		
    	}
    	
 
    void validCourse(Scene main, TextField courseNameTextfield, TextField courseNumberTextfield, ChoiceBox<Integer> courseStartTimeChoiceBox, ChoiceBox<String> courseDayChoiceBox) {
    	
    	String courseName = courseNameTextfield.getText();
    	String courseNumber = courseNumberTextfield.getText();
    	int courseStart = courseStartTimeChoiceBox.getValue();
    	String courseDay = courseDayChoiceBox.getValue();
    	
    	if(courseName.length() != 4 || courseNumber.length() != 3) {
    		System.out.println("Invalid Course Information. Make sure Course Name is 4 letters and Course Number is 3 digits." );
    	} 
    	
    	
    	if(courseDay == "MWF") {
    		switch (courseStart) {
    		case 8:
    			monday8Label.setText(courseName + courseNumber);
    			wednesday8Label.setText(courseName + courseNumber);
    			friday8Label.setText(courseName + courseNumber);
    			break;
    		case 9:
    			monday9Label.setText(courseName + courseNumber);
    			wednesday9Label.setText(courseName + courseNumber);
    			friday9Label.setText(courseName + courseNumber);
    			break;
    		case 10:
    			monday10Label.setText(courseName + courseNumber);
    			wednesday10Label.setText(courseName + courseNumber);
    			friday10Label.setText(courseName + courseNumber);
    			break;
    		case 11:
    			monday11Label.setText(courseName + courseNumber);
    			wednesday11Label.setText(courseName + courseNumber);
    			friday11Label.setText(courseName + courseNumber);
    			break;
    		case 12:
    			monday12Label.setText(courseName + courseNumber);
    			wednesday12Label.setText(courseName + courseNumber);
    			friday12Label.setText(courseName + courseNumber);
    			break;
    		case 1:
    			monday1Label.setText(courseName + courseNumber);
    			wednesday1Label.setText(courseName + courseNumber);
    			friday1Label.setText(courseName + courseNumber);
    			break;
    		case 2:
    			monday2Label.setText(courseName + courseNumber);
    			wednesday2Label.setText(courseName + courseNumber);
    			friday2Label.setText(courseName + courseNumber);
    			break;
    		case 3:
    			monday3Label.setText(courseName + courseNumber);
    			wednesday3Label.setText(courseName + courseNumber);
    			friday3Label.setText(courseName + courseNumber);
    			break;
    		case 4:
    			monday4Label.setText(courseName + courseNumber);
    			wednesday4Label.setText(courseName + courseNumber);
    			friday4Label.setText(courseName + courseNumber);
    			break;
    		case 5:
    			monday5Label.setText(courseName + courseNumber);
    			wednesday5Label.setText(courseName + courseNumber);
    			friday5Label.setText(courseName + courseNumber);
    			break;
    		case 6:
    			monday6Label.setText(courseName + courseNumber);
    			wednesday6Label.setText(courseName + courseNumber);
    			friday6Label.setText(courseName + courseNumber);
    			break;
    		}
    	} else {
    		switch(courseStart) {
    		case 8:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 9:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 10:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 11:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 12:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 1:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 2:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 3:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 4:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 5:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    		case 6:
    			tuesday1Label.setText(courseName + courseNumber);
    			thursday1Label.setText(courseName + courseNumber);
    			break;
    			
    		}
    	}
    	
    	
    	
    	 
    	applicationStage.setScene(main);
		
    }
    
    @FXML
    void addCourse(ActionEvent addCourseEvent) {
    	Scene main = applicationStage.getScene();
    	
    	HBox courseContainer = new HBox(10);
    	courseContainer.setPadding(new Insets (20,20,20,20));
    	Label courseNameLabel = new Label("Enter Course Name");
    	TextField courseNameTextfield = new TextField();
    	
    	Label courseNumberLabel = new Label("Enter Course #");
    	TextField courseNumberTextfield = new TextField();
    	
    	Label courseStartTimeLabel = new Label("Start Time");
    	ChoiceBox<Integer> courseStartTimeChoiceBox = new ChoiceBox();
    	courseStartTimeChoiceBox.getItems().addAll(8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6);
    	courseStartTimeChoiceBox.getSelectionModel().clearSelection();
    	    	
    	Label courseDayLabel = new Label("on");
    	
    	ChoiceBox<String> courseDayChoiceBox = new ChoiceBox();
   	
    	courseDayChoiceBox.getItems().addAll("MWF", "TTh");
    	 	
    	Button done = new Button("Done");
    	done.setOnAction(doneEvent -> validCourse(main, courseNameTextfield, courseNumberTextfield, courseStartTimeChoiceBox, courseDayChoiceBox));
    	   	 
    	courseContainer.getChildren().addAll(courseNameLabel, courseNameTextfield, courseNumberLabel, courseNumberTextfield, 
    	courseStartTimeLabel, courseStartTimeChoiceBox, courseDayLabel, courseDayChoiceBox,  done);
    	Scene addCourseScene = new Scene(courseContainer);
    	applicationStage.setScene(addCourseScene);
    	       	
    }


    @FXML
    void addTutorial(ActionEvent event) {
    	
    	

    }  
   

}
