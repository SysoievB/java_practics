package tasks.stream.car;

import java.util.Objects;

public class Car {

    private String name;
    private Integer age;
    private Integer price;
    private String color;
    private Double engineCapacity;

    public Car() {
    }

    public Car(String name, Integer age, Integer price, String color, Double engineCapacity) {
        this.name = name;
        this.age = age;
        this.price = price;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(age, car.age) && Objects.equals(price, car.price) && Objects.equals(color, car.color) && Objects.equals(engineCapacity, car.engineCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, price, color, engineCapacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
