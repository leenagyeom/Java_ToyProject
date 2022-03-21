package Collaboration;

public class TaxiTakeTest {
	
	public static void main(String[] args) {
		
		Person sn = new Person("����", 17);
		Person mh = new Person("����", 10);
		Person jh = new Person("����", 26);
		Person ck = new Person("â��", 41);
		Person kh = new Person("����", 13);
		Person hw = new Person("����", 67);
		
		Taxi imTaxi = new Taxi("��");
		Taxi honeyTaxi = new Taxi("��");
		Taxi ggobukTaxi = new Taxi("��");
		Taxi bearTaxi = new Taxi("��");
		
		ck.CouponTaxi(imTaxi);
		kh.CouponTaxi(imTaxi);
		mh.CouponTaxi(imTaxi);
		sn.cashTaxi(bearTaxi);
		hw.cashTaxi(ggobukTaxi);
		jh.cashTaxi(honeyTaxi);
		
		ck.showInfo();
		kh.showInfo();
		mh.showInfo();
		sn.showInfo();
		hw.showInfo();
		jh.showInfo();
		
		imTaxi.showTaxiInfo();
		honeyTaxi.showTaxiInfo();
		ggobukTaxi.showTaxiInfo();
		bearTaxi.showTaxiInfo();
		
	}
}
