package studentlist;

import java.util.Scanner;

/**
 * This class is review arrays of objects
 *
 * @author Paul Bonenfant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        // Create an array of 2 Students
        Student[] students = new Student[2];
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter a name");
            String name = input.nextLine();
            Student student = new Student(name);
            students[i] = student;
        }       
        
        System.out.println("Now let's display the students");

        String format = "Student's name is %s\n";
        
        for (Student student: students) {
            System.out.printf(format, student.getName());
        }
        
//        int[] intArray = {1, 3, 5, 7};
//        
//        for(int myInt: intArray) {
//            System.out.println(myInt);
//        }
    }

}

