package q3;

/**
 * Program draws from the Address and Student classes to 
 * output student information.
 * @author A00944299 Chris Qin
 * @version 2018
 */
public class TestStudent {
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final double chrisTest1 = 99.0;
        final double chrisTest2 = 85.1;
        final double chrisTest3 = 79.3;
        
        final double randomTest1 = 91.7;
        final double randomTest2 = 77.5;
        final double randomTest3 = 84.6;
        
        final double cindiTest1 = 99;
        final double cindiTest2 = 100;
        final double cindiTest3 = 98;

        final int firstTest1 = 1;
        final int secondTest2 = 2;
        final int thirdTest3 = 3;
        
        Address chrisHome = new Address("8655 159 ST", "Surrey", 
                "BC", "V4N 1M8");
        
        Address cindiHome = chrisHome; 

        Address studentSchool = new Address("3700 Willingdon Ave", "Burnaby", 
                "BC", "V5G 3H2");
        
        Student chris = new Student("Chris", "Qin",
                chrisHome, studentSchool, chrisTest1, 
                chrisTest2, chrisTest3);
        
        Student cindiBoob = new Student("Cindi", "Boob",
                cindiHome, studentSchool, cindiTest1,
                cindiTest2, cindiTest3);
        
        System.out.println(chris + "\n");
        System.out.println(cindiBoob + "\n");
        
        Student randomStudent = new Student();
        
        randomStudent.setTestScore(firstTest1, randomTest1);
        randomStudent.setTestScore(secondTest2, randomTest2);
        randomStudent.setTestScore(thirdTest3, randomTest3);
        
        System.out.println("Student with only test score values.");
        System.out.println(randomStudent);

    }

};