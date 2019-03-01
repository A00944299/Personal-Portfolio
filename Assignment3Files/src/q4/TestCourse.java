package q4;

import java.text.DecimalFormat;

/**
 * Program adds student with all their relevant information 
 * into a course object.
 *
 * @author A00944299
 * @version 2018
 */
public class TestCourse {
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final double chrisTest1 = 90.8;
        final double chrisTest2 = 99.5;
        final double chrisTest3 = 99.9;
        
        final double sunnyTest1 = 80.2;
        final double sunnyTest2 = 60.1;
        final double sunnyTest3 = 75.7;
        
        final double jessicaTest1 = 84.5;
        final double jessicaTest2 = 73.0;
        final double jessicaTest3 = 75.3;
        
        final double derekTest1 = 72.3;
        final double derekTest2 = 74.8;
        final double derekTest3 = 80.6;
        
        final double lambertTest1 = 72.3;
        final double lambertTest2 = 74.8;
        final double lambertTest3 = 80.6;

        DecimalFormat format = new DecimalFormat("##.##");
        
        Address chrisHome = new Address("8655 159 ST", "Surrey", 
                "BC", "V4N 1M8");

        Address sunnyHome = new Address("700 Royal Ave", "New Westminster",
                "BC", "V3M 5Z5");

        Address jessicaHome = new Address("4345 Hurst Street", "Burnaby",
                "BC", "V5J 1M9");

        Address derekHome = new Address("3349 East 6th Ave", "Vancouver",
                "BC", "V5M 1S8");
        
        Address lambertHome = new Address("7911 Bennett Road", "Richmond",
                "BC", "V6Y 1N3");
        
        Address schoolAddress = new Address("3700 Willingdon Ave", "Burnaby", 
                "BC", "V5G 3H2");
        
        Student chris = new Student("Chris", "Qin", chrisHome,
                schoolAddress, chrisTest1, chrisTest2, chrisTest3);

        Student sunny = new Student("Sunny", "Park", sunnyHome,
                schoolAddress, sunnyTest1, sunnyTest2, sunnyTest3);

        Student jessica = new Student("Jessica", "Kim", jessicaHome,
                schoolAddress, jessicaTest1, jessicaTest2, jessicaTest3);

        Student derek = new Student("Derek", "Dang", derekHome,
                schoolAddress, derekTest1, derekTest2, derekTest3);
        
        Student lambert = new Student("Lambert", "Chan", lambertHome,
                schoolAddress, lambertTest1, lambertTest2, lambertTest3);
        
//        Student randomStudent = new Student();
        
        Course coding = new Course("Coding");
        
        coding.addStudent(chris);
        coding.addStudent(sunny);
        coding.addStudent(jessica);
        coding.addStudent(derek);
        coding.addStudent(lambert);
        
        /**Adding this student will cause an IllegalArgumentException.*/
//        coding.addStudent(randomStudent);   
        
        coding.roll();
        
        System.out.println("Average for the Coding course: " 
                + format.format(coding.average()));
    }

};
