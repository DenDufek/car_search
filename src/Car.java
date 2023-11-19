// Файл Car.java
public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортуємо по швидкості -> ціні -> моделі -> кольорі
    public int compareTo(Car otherCar) {
        int temp = this.speed - otherCar.speed;
        if (temp == 0) {
            temp = this.price - otherCar.price;
            if (temp == 0) {
                temp = this.model.compareTo(otherCar.model);
                if (temp == 0) {
                    temp = this.color.compareTo(otherCar.color);
                }
            }
        }
        return temp;
    }
}
