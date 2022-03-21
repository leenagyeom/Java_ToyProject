package Collaboration;

public class Person {
	
	String personName;
	int money;
	int distance;
	int coupon;
	int personalFee;
	int payCash;
	boolean haveCoupon;
	
	public Person (String personName, int distance) {
		this.personName = personName;
		this.distance = distance;
		if (distance >= 50) {
			this.money = 150000;
		} else if (distance < 50 && distance >= 20) {
			this.money = 80000;
		} else if (distance < 20) {
			this.money = 40000;
		}
	}
	
	public void CouponTaxi (Taxi taxi) {
		haveCoupon = true;
		personalFee = (distance - 2) * 2000 + 3800 ;
		int saveCoupon;
		if (personalFee> 20000) {
			payCash = personalFee - 20000;
			money -= payCash;
			saveCoupon = personalFee - payCash;
		} else {
			payCash = 0;
			saveCoupon = personalFee;
		}
		
		taxi.couponRide(payCash, saveCoupon);
		taxi.road(distance);
	}
	
	public void cashTaxi (Taxi taxi) {
		personalFee = (distance - 2) * 2000 + 3800;
		money -= personalFee;
		
		taxi.cashRide(personalFee);
		taxi.road(distance);
	}
	
	public void showInfo() {
		if (haveCoupon) {
			System.out.println("================================================");
			System.out.println(personName + "����� �̵��Ÿ��� " + distance + "km �̰�,");
			System.out.println("�ýú�� " + personalFee + "���̰�,");
			System.out.println("������ ������ " + payCash + "���̰�, ���� ���� ������ " + money + "�� �Դϴ�.");
			System.out.println("================================================");
		} else {
			System.out.println("================================================");
			System.out.println(personName + "����� �̵��Ÿ��� " + distance + "km �̰�,");
			System.out.println("�ýú�� " + personalFee + "���̰�,");
			System.out.println("������ ������ " + personalFee + "���̰�, ���� ���� ������ " + money + "�� �Դϴ�.");
			System.out.println("================================================");
		}
	}

}
