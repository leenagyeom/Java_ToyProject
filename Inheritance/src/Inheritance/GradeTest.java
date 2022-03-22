package Inheritance;

import java.util.ArrayList;

public class GradeTest {

	public static void main(String[] args) {
		Grade studentLee1 = new Grade1("�̳���", 10202);
		studentLee1.resultSubject("����", 93, 97, 100, 100, 100);
		studentLee1.resultSubject("��ȸ", 97, 88.5, 100, 100, 92);
		studentLee1.resultSubject("����", 97, 96, 100, 100, 100);
		studentLee1.resultSubject("����", 92.3, 100, 100, 100, 96);
		studentLee1.resultSubject("����", 100, 100, 100, 100, 100);
		studentLee1.resultSubject("�Ⱑ", 100, 100, 100, 100, 100);
		studentLee1.resultSubject("ü��", 73.5, 84, 100, 100, 100);
		studentLee1.resultSubject("����", 98, 100, 100, 97, 100);
		studentLee1.resultSubject("�ѹ�", 100, 100, 98, 100, 100);
		studentLee1.setOutAwards(2);
		
		Grade studentLee2 = new Grade2("�̳���", 20202);
		studentLee2.resultSubject("����", 93, 97, 100, 100, 100);
		studentLee2.resultSubject("��ȸ", 97, 88.5, 100, 100, 92);
		studentLee2.resultSubject("����", 97, 96, 100, 100, 100);
		studentLee2.resultSubject("����", 92.3, 100, 100, 100, 96);
		studentLee2.resultSubject("����", 100, 100, 100, 100, 100);
		studentLee2.resultSubject("�Ⱑ", 100, 100, 100, 100, 100);
		studentLee2.resultSubject("ü��", 73.5, 84, 100, 100, 100);
		studentLee2.resultSubject("����", 98, 100, 100, 97, 100);
		studentLee2.resultSubject("�ѹ�", 100, 100, 98, 100, 100);
		studentLee2.setInAwards(1);
		studentLee2.setVolunteer(45);
		
		Grade studentLee3 = new Grade3("�̳���", 30202);
		studentLee3.resultSubject("����", 93, 97, 100, 100, 100);
		studentLee3.resultSubject("��ȸ", 97, 88.5, 100, 100, 92);
		studentLee3.resultSubject("����", 100, 100, 100, 100, 100);
		studentLee3.resultSubject("����", 100, 100, 100, 100, 100);
		studentLee3.resultSubject("����", 100, 100, 100, 100, 100);
		studentLee3.resultSubject("�Ⱑ", 100, 100, 100, 100, 100);
		studentLee3.resultSubject("ü��", 73.5, 84, 100, 100, 100);
		studentLee3.resultSubject("����", 98, 100, 100, 97, 100);
		studentLee3.resultSubject("�ѹ�", 100, 100, 98, 100, 100);
		studentLee3.setInAwards(5);
		studentLee3.setVolunteer(41);
		
		
		ArrayList<Grade> gradeList = new ArrayList<>();
		gradeList.add(studentLee1);
		gradeList.add(studentLee2);
		gradeList.add(studentLee3);
		
		for(Grade grade : gradeList) {
			grade.showStudentInfo();
			grade.addPlusPoint();
		}
		studentLee3.allGrade();
	}
	
}
