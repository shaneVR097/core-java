package SchoolManagementApplication;

public class Course {
	private int courseid;
	private String coursename;
	
	Course(){
		
	}
	
	Course(int courseid,String coursename){
		setCourseid(courseid);
		setCoursename(coursename);
	}
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int cid) {
		this.courseid = cid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	public void printCourse() {
		System.out.println("Course-id: "+courseid+" Course-name: "+coursename);
	}
	
	
}
