class main {
  
  public static void main(String[] ags){
    System.out,println("hola mundo");
    Car car = new Car("AMQ123",new Account("Marco Aurelio", "AMD123"));
    car.passegenger = 4;
    car.printDataCar();

    Car car2 = new Car("BNL456", new Account("Laura es", "AND87"));
    car2.passegenger = 3;
    car2.printDataCar();
  }
}
