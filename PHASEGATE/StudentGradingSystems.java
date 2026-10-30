import java.util.Scanner;
public class StudentGradingSystem{
    public static void main(String[] args){

        Scanner inputtaker = new Scanner(System.in);
        System.out.print("What is the number of students in your class? ");
        int numberOfStudent = inputtaker.nextInt();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Number of students at Elrexzy's High School: " + numberOfStudent);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.print("How many subjects do they offer? ");
        int numberOfSubject = inputtaker.nextInt();

        System.out.println("Number of subjects offered: " + numberOfSubject);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully!");

        int[][] scores = new int[numberOfStudent][numberOfSubject];
        int[] total = new int[numberOfStudent];
        int[] positions = new int[numberOfStudent];
        
        for (int index = 0; index < scores.length; index++){
            System.out.println("Entering scores for Student " + (index + 1) + " ");
            for (int count = 0; count < scores[index].length; count++){
                System.out.println("Enter score for Subject " + (count + 1) + " ");
                int score = inputtaker.nextInt();

                while (score < 0 || score > 100){
                    System.out.print("Invalid score. Enter a value from 0 to 100: ");
                    score = inputtaker.nextInt();
            }
                scores[index][count] = score;

                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully!");
        }
    }
  
        for (int count = 0; count < numberOfStudent; count++){
            int sum = 0;
            for (int index = 0; index < numberOfSubject; index++){
                sum += scores[count][index];
            }
            total[count] = sum;
     }
   
        for (int count = 0; count < numberOfStudent; count++){
            positions[count] = 1;
            
            for (int index = 0; index < numberOfStudent; index++){
                if (total[index] > total[count]){
                    positions[count]++;
             }
        }
   }

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("              STUDENT GRADE SUMMARY");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.printf("%12s", "STUDENT");
        for (int index = 0; index < numberOfSubject; index++){
            System.out.printf("%8s", "SUB" + (index + 1));
        }

        System.out.printf("%10s%10s%10s%n", "TOTAL",   "AVERAGE",   "POSITION");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        for (int count = 0; count < numberOfStudent; count++){
            double average = (double) total[count] / numberOfSubject;
            System.out.printf("%12s", "STUDENT " + (count + 1));

            for (int index = 0; index < numberOfSubject; index++){
            System.out.printf("%8d", scores[count][index]);
            }

            System.out.printf("%10d%10.2f%10d%n", total[count],average,positions[count]);
        }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");    
    }
}
