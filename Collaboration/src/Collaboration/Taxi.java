package Collaboration;

public class Taxi {
	
	String taxiName;	// �ý��̸�
	int cashIncome;		// ���ݼ���
	int couponIncome;	// ��������
	
	int passengerCount;	// ���� �մ� ī��Ʈ
	int roadAddResult;	// �� �̵��Ÿ�

	public Taxi (String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void couponRide (int cashIncome, int couponIncome) {
		this.cashIncome += cashIncome;
		this.couponIncome += couponIncome;
		passengerCount++;
	}
	
	public void cashRide (int personalFee) {
		this.cashIncome += personalFee;
		passengerCount++;
	}

	public void road (int roadAddResult) {
		this.roadAddResult = roadAddResult;
	}

	public void showTaxiInfo() {
		System.out.println("======================================================================================");
		System.out.println(taxiName + "�ý��� �� �̵��Ÿ��� " + roadAddResult + "km �̰�, ���� �°��� " + passengerCount + "�� �̸�, �� ������ ���� " + cashIncome + "��, �̿�� ��� �ݾ��� " + couponIncome + "�Դϴ�.");
		System.out.println("======================================================================================");
	}

}
