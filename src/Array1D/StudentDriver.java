package Array1D;
import java.util.Scanner;
public class StudentDriver {
    public static void main(String[] args) {
        System.out.println("Enter number of students:\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Create array of Student objects
        Student[] students = new Student[n];
        
        // Create HelpStudent object to use inputstudent method
        HelpStudent helper = new HelpStudent();
        
        // Initialize the array with student objects (with dummy values)
        for(int i = 0; i < n; i++) {
            students[i] = new Student(0, "", 0);
        }
        
        // Call inputstudent to get actual student data
        helper.inputstudent(students);
        
        // Get passing marks from user
        System.out.println("Enter passing marks: ");
        int passingMarks = sc.nextInt();
        
        // Get passed students using the passStudent method from HelpStudent
        Student[] passedStudents = HelpStudent.passStudent(students, passingMarks);
        
        // Display passed students
        System.out.println("\nPassed Students:");
        System.out.println("=================");
        for(Student s : passedStudents) {
            System.out.println("ID: " + s.id + ", Name: " + s.nm + ", Marks: " + s.marks);
        }
        
        // Also display using the filterstudentonmarks method from Student class
        System.out.println("\nAll Students (with null for failed students):");
        System.out.println("==============================================");
        Student[] filteredStudents = Student.filterstudentonmarks(students, passingMarks);
        for(int i = 0; i < filteredStudents.length; i++) {
            if(filteredStudents[i] != null) {
                System.out.println("ID: " + filteredStudents[i].id + ", Name: " + 
                    filteredStudents[i].nm + ", Marks: " + filteredStudents[i].marks);
            }
        }
        
        // Close scanners
        helper.closescanner();
        sc.close();
    }
}