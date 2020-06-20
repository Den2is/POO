class Car {
  Integer id;
  String licence;
  Account driver;
  Integer passegenger;

  //metodo constructor
  public Car(String license, Account driver){
    this.license = license;
    this.driver = driver;
  }

  void printDataCar(){
    System.out.println("License: " + license + "Name Driver: " + driver.name);
  }
}
