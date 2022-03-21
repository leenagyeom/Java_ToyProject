package ch03_1;

import java.util.ArrayList;

public class Grade1 {
	
	ArrayList<Subject> subjectList;
	protected String studentName;
	protected int studentNum;

	double gradeRatio;
	double outAwards;
	double inAwards;
	double aveTotal;
	static double gradeTotal;
	
	public Grade1(String studentName, int studentNum) {
		this.studentName = studentName;
		this.studentNum = studentNum;

		this.gradeRatio = 0.2;
		
		subjectList = new ArrayList<>();		
	}
	
	public void resultSubject(String subjectName, double mScore, double fScore, double workAScore, double workBScore, double projectScore ) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setmScore(mScore);
		subject.setfScore(fScore);
		subject.setWorkAScore(workAScore);
		subject.setWorkBScore(workBScore);
		subject.setProjectScore(projectScore);
		
		subjectList.add(subject);
	}
	
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public double getInAwards() {
		return inAwards;
	}

	public void setInAwards(double inAwards) {
		if ( inAwards > 0 ) {
			this.inAwards = 0.5;
		} else {
			this.inAwards = 0;			
		}
	}
	
	public double getOutAwards() {
		return outAwards;
	}

	public void setOutAwards(double outAwards) {
		if ( outAwards > 0 ) {
			this.outAwards = 1;
		} else {
			this.outAwards = 0;
		}
	}
	
	public void addPlusPoint() {
		double lastScore;
		
		System.out.println("============================");
		System.out.println("�������");
		System.out.println("����\t" + getOutAwards());
		System.out.println("����\t" + getInAwards()); 
		System.out.println("============================");
		
		lastScore = getOutAwards() + getInAwards() + aveTotal;
		System.out.println("��������\t\t" + String.format("%.2f", lastScore));
	}
	
	public void showStudentInfo() {
		double originScore = 0;
		double originTotal = 0;
		double aveScore = 0;
		int subjectNum = 9;
		int aveFlag = 0;
		char grade = 0;
		
		System.out.println("\n    " + studentNum + ", " + studentName + "�л��� ����ǥ");
		System.out.println("============================");
		System.out.println("\t ���� \t ������ \t ���");
		System.out.println("============================");
		for (Subject subject : subjectList) {
			System.out.print(subject.getSubjectName() + "\t");
			originScore = subject.getmScore() + subject.getfScore() + subject.getWorkAScore() 
			+ subject.getWorkBScore() + subject.getProjectScore();
			System.out.print(originScore + "\t");

			originTotal += originScore;
			
			// ���� �� �б� ���� 
			aveScore = subject.getmScore() * 0.3 + subject.getfScore() * 0.3 + subject.getWorkAScore() * 0.1 
			+ subject.getWorkBScore() * 0.1 + subject.getProjectScore() * 0.2;

			aveTotal += aveScore;
			
			if (aveScore == 100) {
				System.out.print(String.format("%.1f", aveScore) + "\t");				
			} else {
				System.out.print(String.format("%.2f", aveScore) + "\t");				
			}
			
			aveFlag = (int)aveScore / 10;
			switch (aveFlag) {
				case 10 : case 9 :
					grade = 'A'; break;
				case 8 :
					grade = 'B'; break;
				case 7 :
					grade = 'C'; break;
				case 6 :
					grade = 'D'; break;
				default :
					grade = 'E'; break;
	
			}
			System.out.println("  "+grade);
		}
		originTotal = originTotal / subjectNum;
		aveTotal = aveTotal / subjectNum;
		System.out.println("============================");
		System.out.println("���\t" + String.format("%.1f", originTotal)+ "\t" + String.format("%.2f", aveTotal));
		gradeTotal += aveTotal * gradeRatio;
	}

}
