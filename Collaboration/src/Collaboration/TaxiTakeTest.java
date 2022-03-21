package Collaboration;

public class TaxiTakeTest {
	
	public static void main(String[] args) {
		
		Person sn = new Person("Çö¿ì", 17);
		Person mh = new Person("¹ÎÇõ", 10);
		Person jh = new Person("ÁÖÇå", 26);
		Person ck = new Person("Ã¢±Õ", 41);
		Person kh = new Person("±âÇö", 13);
		Person hw = new Person("Çü¿ø", 67);
		
		Taxi imTaxi = new Taxi("²á");
		Taxi honeyTaxi = new Taxi("Çå");
		Taxi ggobukTaxi = new Taxi("ºÏ");
		Taxi bearTaxi = new Taxi("°õ");
		
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
