package q4;

import java.text.DecimalFormat;

/**
 * Class constructs student info including name, test scores, and address.
 * 
 * @author A00944299 Chris Qin 
 * @version 2018
 */
public class Student {
    /**Test 1.*/
    private static final int TEST_1 = 1;
    
    /**Test 2.*/
    private static final int TEST_2 = 2;
    
    /**Test 3.*/
    private static final int TEST_3 = 3;
    
    /**Maximum allowed number of tests.*/
    private static final int MAXTESTS = 3;
    
    /**Student first name.*/
    private String firstName;

    /**Student last name.*/
    private String lastName;

    /**Student home address.*/
    private Address homeAddress;

    /**Student school address.*/
    private Address schoolAddress;
    
    /**Student test score 1.*/
    private double testScore1;
    
    /**Student test score 2.*/
    private double testScore2;
    
    /**Student test score 3.*/
    private double testScore3;
    
    /**Private decimal format.*/
    private DecimalFormat format = new DecimalFormat("##.##");
    
    /**
    * Student information values.
    * @param first name of student
    * @param last name of student
    * @param homeA address of student
    * @param schoolA the school address of the student
    * @param test1 the score on test one
    * @param test2 the score on test two
    * @param test3 the score on test three
    */
    public Student(String first, String last, Address homeA, Address schoolA,
            double test1, double test2, double test3) {
        firstName = first;
        lastName = last;
        homeAddress = homeA;
        schoolAddress = schoolA;
        testScore1 = test1;
        testScore2 = test2;
        testScore3 = test3;
    }
   
    
    /**Student with no set values and 0 test scores.*/
    public Student() {
        testScore1 = 0;
        testScore2 = 0;
        testScore3 = 0;   
    }


    /**
     * Sets score values and test numbers.
     * @param testNo test number
     * @param score achieved
     */
    public void setTestScore(int testNo, double score) {
        if (testNo == TEST_1) {
            testScore1 = score;
        } else if (testNo == TEST_2) {
            testScore2 = score;
        } else if (testNo == TEST_3) {
            testScore3 = score;
        } else {
            throw new IllegalArgumentException("Test number does not exist.");
        }
    }
    
    /**
     * Return test number and corresponding score.
     * @param testNo test number
     * @return score of test
     */
    public double getTestScore(int testNo) {
        if (testNo == TEST_1) {
            return testScore1;
        } else if (testNo == TEST_2) {
            return testScore2;
        } else if (testNo == TEST_3) {
            return testScore3;
        } else {
            throw new IllegalArgumentException("Test number does not exist.");
        }
    }
    
    /**
     * Average of all three tests.
     * @return the average test score
     */
    public double average() {
        return (testScore1 + testScore2 + testScore3) / MAXTESTS;
    }
    
    /**
    * To string method that prints all student info.
    * 
    * @return result as formatted below
    */
    public String toString() {
        String result = "Student name: " + firstName + " " + lastName + ".\n"
               + "Home Address: " + homeAddress + ".\n"
               + "School Address: " + schoolAddress + ".\n"
               + "Test1 Score: " + format.format(testScore1) + ".\n"
               + "Test2 Score: " + format.format(testScore2) + ".\n"
               + "Test3 Score: " + format.format(testScore3) + ".\n"
               + "Average Test Score: " + format.format(average());
        return result;
    }
}