import java.text.NumberFormat;

public class Product {
	private int code;
	private String desc;
	private double price;
	private static int counter;
	// constructors
	public Product(int code, String desc, double price) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.desc = desc;
		this.price = price;
		counter++;
	}
	
	// Get & set methods for product code
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	// Get & set methods for product desc
	public String getDescrtiption() {
		return desc;
	}
	
	public void setDescrtiption(String desc) {
		this.desc = desc;
	}
	
	// Get & set methods for product price
	public String getPriceFormatted() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    
    // Method to return instance's data
	public String toString() {
		return "("+ code + ", " + desc + ", " + price + ")";
	}
	
	public static int getNumOfInstances() {
        return counter;
    }
	

}