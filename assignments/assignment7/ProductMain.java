public class ProductMain {

	public static void main(String[] args) {
		// Initialize new instances of class Product as test cases
		
		// Product 1
		Product p1 = new Product (1,"This is my first product",25);
		System.out.println(p1.getCode());
		System.out.println(p1.getDescrtiption());
		System.out.println(p1.getPriceFormatted());
		System.out.println(p1.toString());
		p1.setCode(2);
		p1.setDescrtiption("Changed desc of test product 1");
		p1.setPrice(300);
		System.out.println(p1.toString());
		System.out.println("Number of instances (products): " + p1.getNumOfInstances());
		System.out.println();
		
		// Product 2
		Product p2 = new Product (100,"This is my second product",50000);
		System.out.println(p2.getCode());
		System.out.println(p2.getDescrtiption());
		System.out.println(p2.getPriceFormatted());
		System.out.println(p2.toString());
		p2.setCode(200);
		p2.setDescrtiption("Changed desc of test product 2");
		p2.setPrice(300000);
		System.out.println(p2.toString());
		System.out.println("Number of instances (products): " + p2.getNumOfInstances());
		System.out.println();
		
		// Product 3
		Product p3 = new Product (1000,"This is my third product",999999);
		System.out.println(p3.getCode());
		System.out.println(p3.getDescrtiption());
		System.out.println(p3.getPriceFormatted());
		System.out.println(p3.toString());
		p3.setCode(2000);
		p3.setDescrtiption("Changed desc of test product 3");
		p3.setPrice(300000000);
		System.out.println(p1.toString());
		System.out.println("Number of instances (products): " + p3.getNumOfInstances());
		System.out.println();
		
	}

}