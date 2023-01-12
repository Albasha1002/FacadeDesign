package FacadeDesign;

public class Shopkeeper {
	private MobilePhone ipPhone;
	private MobilePhone samsung;
	private MobilePhone blackBerry;
	
	
	public Shopkeeper() {
		ipPhone=new Iphone();
		samsung=new Samsung();
		blackBerry=new BlackBerry();
		
	}
	
	public void iphoneSale() {
		ipPhone.modelNo();
		ipPhone.price();
	}
	
	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
		
	}
	
	public void blackBerrySale() {
		blackBerry.modelNo();
		blackBerry.price();
		
	}

}
