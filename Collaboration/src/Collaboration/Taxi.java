package Collaboration;

public class Taxi {
	
	String taxiName;	// 택시이름
	int cashIncome;		// 현금수입
	int couponIncome;	// 쿠폰수입
	
	int passengerCount;	// 누적 손님 카운트
	int roadAddResult;	// 총 이동거리

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
		System.out.println(taxiName + "택시의 총 이동거리는 " + roadAddResult + "km 이고, 누적 승객은 " + passengerCount + "명 이며, 총 수입은 현금 " + cashIncome + "원, 이용권 사용 금액은 " + couponIncome + "입니다.");
		System.out.println("======================================================================================");
	}

}
