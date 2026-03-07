import java.util.*;
class MultiStudent_GradeAnalyzer
{
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter number of students");
        int students = x.nextInt();
        
        for(int i=1; i<=students; i++)
        {
            int total=0; // resets for each student
            
            System.out.println("\nStudent : " + i); 
            
            System.out.println("Enter number of subjects");
            int subjects = x.nextInt();
            
            for(int j = 1; j <= subjects; j++) 
            {
                System.out.print("Enter marks for subject " + j + ": ");
                int marks = x.nextInt();

                if(marks < 0 || marks > 100) 
                {
                    System.out.println("Invalid marks entered!");
                    j--; // repeat this subject
                    continue;
                }

                total += marks;
            }
            
            System.out.println("\nStudent " + i + " Results");
            
            double percentage = (double) total / subjects;
            percentage = Math.round(percentage*100.0)/100.0;  
            
            System.out.println("Total marks : "+total);
        
            System.out.println("Percentage : "+percentage+"%");
            
            String grade = "F";
        
            if(percentage>=90)
            {
                grade = "A+";
                System.out.println("Grade = "+grade+" Congratulations! you performed your best ;)");
            }
            else if(percentage>=80)
            {
                grade = "A";
                System.out.println("Grade = "+grade+" Congratulations! you did very well :)");
            }
            else if(percentage>=70)
            {
                grade = "B";
                System.out.println("Grade = "+grade+" You are almost there |;>|");
            }
            else if(percentage>=60)
            {
                grade = "C";
                System.out.println("Grade = "+grade+" you have potential |'_'|");
            }
            else if(percentage>=50)
            {     
                grade = "D";
                System.out.println("Grade = "+grade+" you can do better :( ");
            }
            else
            {
                System.out.println("Grade = "+grade+" FAILED!!! *_*");
            }
            
            System.out.println("------------------------");
        }
        
        x.close();
    }
}
