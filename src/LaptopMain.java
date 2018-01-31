
public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Laptop laptop = new Laptop("Dell", "Windows", 2011);
System.out.print(laptop.laptopbrand);

Laptop laptop2 = new Laptop("Acer", "Windows", 2014);
System.out.println(laptop2.system);


Car car = new Car ("Toyota", 1500, 2011);
System.out.print(car.carBrand);

Car car2 = new Car("Nissan", 1800, 2000);
System.out.println(car2.carBrand);
	}

}
