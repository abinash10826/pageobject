package interview_question;

public class Car implements Comparable<Car>{
	
	String brand;
	int price;
	int rating;
	public Car(String brand, int price, int rating) {
		
		this.brand = brand;
		this.price = price;
		this.rating = rating;
		
		
		
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Car arg) {
	
		return rating-arg.rating;
	}
	
	

}
