from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
   
    car = Car("AMD#321", Account("Marcotulio", "AND432"))
    print(vars(car))
    print(vars(car.driver))
