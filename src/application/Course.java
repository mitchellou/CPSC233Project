package application;

public class Course {

	String courseName;
	String courseNumber;
	int courseTime;
	String courseDays;
	
	Course(String cName, String cNum, int cTime, String cDays){
		courseName = cName;
		courseNumber = cNum;
		courseTime = cTime;
		courseDays = cDays;
	}
	
	public int getTotalCourseTime() {
				
		int totalTime = 0;
		
		if(courseDays == "MWF") {
			totalTime += 3;
		} else {
			totalTime += 2;
		}
		return totalTime;
	}
	
}
