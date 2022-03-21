package Inheritance;

import java.util.ArrayList;

public class GradeTest {

	public static void main(String[] args) {
		Grade1 studentLee1 = new Grade1("이나겸", 10202);
		studentLee1.resultSubject("국어", 93, 97, 100, 100, 100);
		studentLee1.resultSubject("사회", 97, 88.5, 100, 100, 92);
		studentLee1.resultSubject("역사", 97, 96, 100, 100, 100);
		studentLee1.resultSubject("수학", 92.3, 100, 100, 100, 96);
		studentLee1.resultSubject("과학", 100, 100, 100, 100, 100);
		studentLee1.resultSubject("기가", 100, 100, 100, 100, 100);
		studentLee1.resultSubject("체육", 73.5, 84, 100, 100, 100);
		studentLee1.resultSubject("영어", 98, 100, 100, 97, 100);
		studentLee1.resultSubject("한문", 100, 100, 98, 100, 100);
		studentLee1.setOutAwards(2);
		
		Grade1 studentLee2 = new Grade2("이나겸", 20202);
		studentLee2.resultSubject("국어", 93, 97, 100, 100, 100);
		studentLee2.resultSubject("사회", 97, 88.5, 100, 100, 92);
		studentLee2.resultSubject("역사", 97, 96, 100, 100, 100);
		studentLee2.resultSubject("수학", 92.3, 100, 100, 100, 96);
		studentLee2.resultSubject("과학", 100, 100, 100, 100, 100);
		studentLee2.resultSubject("기가", 100, 100, 100, 100, 100);
		studentLee2.resultSubject("체육", 73.5, 84, 100, 100, 100);
		studentLee2.resultSubject("영어", 98, 100, 100, 97, 100);
		studentLee2.resultSubject("한문", 100, 100, 98, 100, 100);
		studentLee2.setInAwards(1);
		studentLee2.setVolunteer(45);
		
		Grade1 studentLee3 = new Grade3("이나겸", 30202);
		studentLee3.resultSubject("국어", 93, 97, 100, 100, 100);
		studentLee3.resultSubject("사회", 97, 88.5, 100, 100, 92);
		studentLee3.resultSubject("역사", 100, 100, 100, 100, 100);
		studentLee3.resultSubject("수학", 100, 100, 100, 100, 100);
		studentLee3.resultSubject("과학", 100, 100, 100, 100, 100);
		studentLee3.resultSubject("기가", 100, 100, 100, 100, 100);
		studentLee3.resultSubject("체육", 73.5, 84, 100, 100, 100);
		studentLee3.resultSubject("영어", 98, 100, 100, 97, 100);
		studentLee3.resultSubject("한문", 100, 100, 98, 100, 100);
		studentLee3.setInAwards(5);
		studentLee3.setVolunteer(41);
		
		
		ArrayList<Grade1> gradeList = new ArrayList<>();
		gradeList.add(studentLee1);
		gradeList.add(studentLee2);
		gradeList.add(studentLee3);
		
		for(Grade1 grade1 : gradeList) {
			grade1.showStudentInfo();
			grade1.addPlusPoint();
		}
		studentLee3.allGrade();
	}
	
}
