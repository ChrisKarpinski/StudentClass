/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This program uses a class to generate students with a given average and 
 *     name
 *
 ****************************************************************************/

import java.util.Scanner;

import java.util.Arrays;

public class AbstractDataType {

	public static void main(String[] args) {
		

		String nameOfStudent;
		int average;
		Student.GRADE grade;
		int runningSum = 0;
		String cont = "Y";
		Student [] studentData = new Student [5];
		Scanner read = new Scanner(System.in);
		
		while (cont.equals("Y")) {
		System.out.println("Enter the student's name, average and grade");
		System.out.println("Name: ");
		
		nameOfStudent = read.next();
		
		System.out.println("Average: ");
		average = read.nextInt();
		
		System.out.println("Grade: ");
		grade = Student.GRADE.valueOf(read.next());
		Student student = new Student(average, nameOfStudent, grade);
		
		
		studentData[studentData.length-5] = student;
		
		System.out.println("The student's name is: " + student.GetName() + ", and their average is: "
				+ student.GetAverage() + " and their grade is: " + student.GetGrade().ReturnPosition());
		System.out.println("There are: " + (studentData.length-4) + " student(s) in the class");
		runningSum = runningSum + studentData[studentData.length-5].GetAverage();
		System.out.println("The class average is: " + (runningSum/(studentData.length-4)));
		System.out.println("");
		
		studentData = Arrays.copyOf(studentData, studentData.length+1);
		System.out.println("Continue? (Y or N)");
		cont = read.next();
		
		if (cont.equals("N")) {
			
			System.out.println("Here is the class of students: ");
			
			for (int iterator = 0;iterator < studentData.length-5;iterator++) {
				
				System.out.println(studentData[iterator].GetName() + ", Average: " + studentData[iterator].GetAverage());
				
				
			}
			System.out.println("Number of students: " + (studentData.length-5));
			System.out.println("Class average: " + (runningSum/(studentData.length-5)));
			System.out.println("");
			System.out.println("Done");
			
		}
	}
	}
}
