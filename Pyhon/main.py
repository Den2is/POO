from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMD322", Account("Marco Aurelio", "BNE433"))
    print(vars(car))
    print(vars(car.driver))