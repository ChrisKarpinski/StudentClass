/****************************************************************************
 *
 * Created by: Chris Karpinski
 * Created on: Sept 2016
 * This is the class for a student which includes their average and name
 *
 ****************************************************************************/

public class Student {

	private String studentName;
	private int studentAverage;
	private GRADE grade; 
	
	public Student (int average, String name, GRADE grade) {
		
		this.studentName = name;
		this.studentAverage = average;
		this.grade = grade;
	}
	
	public enum GRADE {
		
		G7(7),
		G8(8),
		G9(9),
		G10(10),
		G11(11),
		G12(12);
		
private int gradeNum;
		
		GRADE(int gradeNum) {
			
			this.gradeNum = gradeNum;
			
		}
		
		public int ReturnPosition () {
			
			return gradeNum;
		}
		
	}
	
	public String GetName() {
		
		String nameStudent = this.studentName;
		return nameStudent;
	}
	
	public int GetAverage () {
		
		int averageOfStudent = this.studentAverage;
		return averageOfStudent;
	}
	
	public GRADE GetGrade () {
		
		GRADE studentGrade = this.grade;
		return studentGrade;
	}
}
