package ch03_1;

public class Grade2 extends Grade1 {
	
	private int volunteer;
	
	public Grade2 (String studentName, int studentNum) {
		super(studentName, studentNum);
		
		this.gradeRatio = 0.3;
	}

	public int getVolunteer() {
		return volunteer;
	}

	public void setVolunteer(int volunteer) {
		if ( volunteer >= 40 ) {
			this.volunteer = 1;
		} else {
			this.volunteer = 0;			
		}
	}
	
	public double getOutAwards() {
		return outAwards;
	}

	public void setOutAwards(double outAwards) {
		if ( outAwards > 0 ) {
			this.outAwards = 1.5;
		} else {
			this.outAwards = 0;
		}
	}
	
	public void addPlusPoint() {
		double lastScore;
		
		System.out.println("============================");
		System.out.println("봉사\t" + getVolunteer());
		System.out.println("수상실적");
		System.out.println("교외\t" + getOutAwards());
		System.out.println("교내\t" + getInAwards());
		System.out.println("============================");
		
		lastScore = getVolunteer() + getOutAwards() + getInAwards() + aveTotal;
		System.out.println("최종성적\t\t" + String.format("%.2f", lastScore));
	}
	
}
