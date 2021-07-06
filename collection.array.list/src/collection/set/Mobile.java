package collection.set;

public class Mobile implements Comparable<Mobile>{
	
	private String vendor;
	private int price;
	private int pinCode;
	private String manufacturerLoc;
	
	public Mobile(String vendor, int price, int pinCode, String manufacturerLoc) {
		super();
		this.vendor = vendor;
		this.price = price;
		this.pinCode = pinCode;
		this.manufacturerLoc = manufacturerLoc;
	}

	public Mobile() {
		super();
		
	}
	
	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getManufacturerLoc() {
		return manufacturerLoc;
	}

	public void setManufacturerLoc(String manufacturerLoc) {
		this.manufacturerLoc = manufacturerLoc;
	}

	
	@Override
	public String toString() {
		return "Mobile [vendor=" + vendor + ", price=" + price + ", pinCode=" + pinCode + ", manufacturerLoc="
				+ manufacturerLoc + "]";
	}

	@Override
	public int compareTo(Mobile o) {
		int i = this.price - o.price;
		return i;
	}
	
	
	
	
	
	
}
