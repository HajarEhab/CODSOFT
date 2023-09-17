import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Please Enter The number Of Subjects You have Studied : ");
	        int subjectsNum = 0;
	        boolean validInput = false;
	        int attempts = 0;
	        int maxAttempts = 5;

	        while (!validInput) {
	            try {
	                subjectsNum  = scan.nextInt();
	                if (subjectsNum  <= 0) {
	                    throw new IllegalArgumentException("Number of subjects must be positive!!");
	                }
	                validInput = true;
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input!! Number of subjects must be integer.");
	                scan.nextLine();
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	                scan.nextLine();
	            }

	            attempts++;
	            if (attempts > maxAttempts) {
	                System.out.println("Maximum number of attempts reached:( Please Exiting The Program.");
	                return;
	            }
	        }

	        int[]  studentMarks= new int[subjectsNum ];
	        for (int i = 0; i < subjectsNum ; i++) {
	            validInput = false;
	            attempts = 0;

	            while (!validInput) {
	                System.out.print("Please Enter The Marks You Obtained In Subject " + (i + 1) + ": ");
	                try {
	                    studentMarks[i] = scan.nextInt();
	                    if ( studentMarks[i] < 0 ||  studentMarks[i] > 100) {
	                        throw new IllegalArgumentException("Marks must be between 0 and 100 !!");
	                    }
	                    validInput = true;
	                } catch (InputMismatchException e) {
	                    System.out.println("Invalid input!! Marks must be integers!");
	                    scan.nextLine();
	                } catch (IllegalArgumentException e) {
	                    System.out.println(e.getMessage());
	                    scan.nextLine();
	                }

	                attempts++;
	                if (attempts > maxAttempts) {
	                    System.out.println("Maximum number of attempts reached:( Please Exiting The Program.");
	                    return;
	                }
	            }
	        } int totalMarks = 0;
	        for (int subjMark :  studentMarks) {
	            totalMarks += subjMark;
	        }
	        double studentAveragepercentage = (double) totalMarks / subjectsNum ;
	        String studentGrade;
	        if (studentAveragepercentage >= 90) {
	            studentGrade = "A ;)";
	        } else if (studentAveragepercentage >= 80) {
	            studentGrade = "B :)";
	        } else if (studentAveragepercentage>= 70) {
	            studentGrade = "Cc:]";
	        } else if (studentAveragepercentage >= 60) {
	            studentGrade = "D :[";
	        } else {
	            studentGrade = "F :(";
	        }

	        System.out.println("Your Total Marks are : " + totalMarks);
	        System.out.printf("Your Average Percentage is : %.2f%%%n", studentAveragepercentage);
	        System.out.println("Your Grade is  " + studentGrade);

	    }
	

	}


