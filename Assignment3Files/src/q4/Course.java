package q4;

import java.util.ArrayList;

/**
 * <p>Represents a specific course in a school. It has values that
 * store the name of the course, and it keeps track of the students
 * that are enrolled in the course. It provides methods to add new
 * students, calculate the average test score of the class, and to
 * print out an entire class roll of all the students in the course.</p>
 * 
 * @author A00944299 Chris Qin
 * @version 2018
 */
public class Course {
    /**Max number of students allowed.*/
    private static final int MAXSTUDENTS = 5;
    
    /**private course name.*/
    private String courseName;
    
    /**List of all students in private arraylist.*/
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();
    
    /**
     * Constructs Course.
     * @param name course name
     */
    public Course(String name) {
        this.courseName = name;
    }
    
    /**
     * Adds student to arraylist listOfStudents 
     * if number of students is less than 5.
     * 
     * @param student the student to add to the course.
     */
    public void addStudent(Student student) {
        if (listOfStudents.size() < MAXSTUDENTS) {
            listOfStudents.add(student);
        } else {
            throw new IllegalArgumentException("Cannot exceed 5 students.");
        }
    }
    
    /**
     * Calculates course average for all students.
     * 
     * @return the courses average test score
     */
    public double average() {
        double totalScores = 0;
        for (Student student : listOfStudents) {
            totalScores += student.average();
        }
        return totalScores / listOfStudents.size();
    }
    
    /**
     * Lists down all students in the course.
     */
    public void roll() {
        System.out.println(courseName + " Roll:\n");
        
        for (Student student : listOfStudents) {
            System.out.println(student + "\n");
        }
    }
}