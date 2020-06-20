// 
class UberX extends Car {
	String brand;
	String model;
  
    //constructor	
	public UberX(String license, Account driver, String brand, String model){
		super(license, driver);//llamando metodo constructor de la calse Car(padre)
		this.brand = brand;
		this.model = model;
	}
}
