import java.util.Scanner;

/**
 * This class will take the unit name from user and then the marks of 25 students.
 * User must have to enter a valid marks between 0 and 100 otherwise system will ask the user to reenter it.
 * After successfully entering the marks, system calculates the higheest and lowest marks.
 * Then this class calculates the sum, mean and standard deviation.
 *
 * @author (Muhammad Faizan Answe)
 * @Date (11-September-2022)
 */
public class main
{
    public static void main(String[] args)
    {   // display message to screen
        System.out.println("Please Enter the Unit Name");
        // scanner object is used for taking input from users.
        Scanner input = new Scanner(System.in);
        // take the unit name from user and save it.
        String uName = input.next();
        // create an array of student marks
        int[] sMarks = new int[25];
        int marks;
        // this variable is used to start or stop the while loop
        boolean check = true;
        // highest marks of user is stored in it
        int highestMark =0;
        // lowest marks of user
        int lowestMark=0;
        // mean of all marks stored in it
        double mean=0;
        // Standard Deviation is stored in it
        double stDv=0;
        // sum of student marks stored in it
        int marksSum = 0;
        double res=0;
        // run the loop for 25 times to take the student marks from user
        for (int i=0;i<sMarks.length;i++)
        {
            
            check = true;
            // while loop runs 
            while (check)
            {
                // msg displayed and input is taken from user
                System.out.println("Please Enter Students Marks");
                marks= input.nextInt();
                // determines if user enters true input then the while loop will terminate
                if(marks>=0 && marks<=100)
                {
                    sMarks[i] = marks;
                    check = false;
                }
                // otherwise userr enters invalid input. it will prormpts the user to reenter the marks.
                else
                {
                    System.out.println("Please Enter Valid Marks between 0 and 100");
                    check = true;
                }
            }// while loop closed
            
        }// for loop closed
        System.out.println("Unit Name is " + uName);
        // loop to find the highest, lowest, and sum of all student marks
        for (int i=0;i<sMarks.length;i++)
        {
            // save the first value in this variables
            highestMark = sMarks[0];
            lowestMark = sMarks[0];
            // check if the student marks at i is greater than the highest marks
            if(sMarks[i]>highestMark)
                highestMark=sMarks[i];
            // check if the student marks at i is less than the lowest marks     
            if(sMarks[i]<lowestMark)
                lowestMark=sMarks[i]; 
            // add the sum in the marksSum varibales    
            marksSum = marksSum + sMarks[i]; 
    
            System.out.println("Students Marks is " + sMarks[i]);
        }
        // calculate the mean
        mean = marksSum/sMarks.length;
        // calculate the power of all student marks and save it in res varibale
        for (int i=0;i<sMarks.length;i++)
        {
            res += Math.pow(sMarks[i] - mean, 2);

        }
        // calculate the standard deviation
        stDv = Math.sqrt(res/sMarks.length);
        // display the messages to the screen
        System.out.println("Students Highest Mark is " + highestMark);
        System.out.println("Students Lowest Mark is " + lowestMark);
        
        System.out.println("Mean of Student Marks is " + mean);
        System.out.println("Standard Deviation of Student Marks is " + stDv);
        
        
        
        
    }
}
