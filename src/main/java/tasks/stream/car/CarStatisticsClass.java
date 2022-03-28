package tasks.stream.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Создать класс «Автомобиль». В классе должна храниться следующая информация:
 * <p>
 * название автомобиля;
 * год выпуска;
 * стоимость;
 * цвет;
 * объем двигателя.
 * Нужно создать набор автомобилей и выполнить следующие задачи:
 * <p>
 * отобразить все автомобили;
 * отобразить автомобили указанного цвета
 * отобразить автомобили дороже указанной цены;
 * отобразить автомобили, чей год выпуска находится в заданном диапазоне;
 * сортировать автомобили в порядке убывания стоимости.
 * Задачи решить с использованием прикладного интерфейса Stream API.
 */
public class CarStatisticsClass {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("Audi", 2020, 120000, "blue", 4.0),
                new Car("Audi", 2000, 50000, "blue", 3.0),
                new Car("BMW", 2010, 30000, "red", 1.8),
                new Car("Seat", 2012, 40000, "white", 2.0))
        );

        /*cars.stream()
                .filter(car -> car.getColor().equals("blue"))
                .forEach(System.out::println);*/

        /*cars.stream()
                .filter(car->car.getPrice()>50000)
                .forEach(System.out::println);*/

        cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .forEach(System.out::println);
    }
}
