package Inheritance;

public class Grade3 extends Grade1 {
	private int volunteer;
	
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
	
	public int getVolunteer() {
		return volunteer;
	}

	@Override
	public void setVolunteer(int volunteer) {
		if ( volunteer >= 40 ) {
			this.volunteer = 1;
		} else {
			this.volunteer = 0;			
		}
	}
	
	@Override
	public void addPlusPoint() {
		double lastScore;
		
		System.out.println("============================");
		System.out.println("����\t" + getVolunteer());
		System.out.println("�������");
		System.out.println("����\t" + getOutAwards());
		System.out.println("����\t" + getInAwards());
		System.out.println("============================");
		
		lastScore = getVolunteer() + getOutAwards() + getInAwards() + aveTotal;
		System.out.println("��������\t\t" + String.format("%.2f", lastScore));
	}
	
	@Override
	public void allGrade() {
		System.out.println();
		System.out.println("============================");
		System.out.println(studentName + "�� �� �г� ��������� " + String.format("%.2f", gradeTotal) + "�� �Դϴ�");
		System.out.println("============================");
	}
}