package ch03_1;

public class Grade3 extends Grade2 {
	
	public Grade3 (String studentName, int studentNum) {
		super(studentName, studentNum);
		
		gradeRatio = 0.5;
	}
	
	public double getOutAwards() {
		return outAwards;
	}

	public void setOutAwards(double outAwards) {
		if ( outAwards > 0 ) {
			this.outAwards = 2;
		} else {
			this.outAwards = 0;
		}
	}
	
	public void allGrade() {
		System.out.println();
		System.out.println("============================");
		System.out.println(studentName + "의 전 학년 평균점수는 " + String.format("%.2f", gradeTotal) + "점 입니다");
		System.out.println("============================");
	}
}