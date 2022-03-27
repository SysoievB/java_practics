package tasks;

import java.util.List;

/**
 * Условие задачи. Для любого набора случайно-сгенерированных чисел нужно определить
 * количество парных. Для решения задачи использовать средства программного интерфейса Stream API.
 */
public class EvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 4, 5);

        System.out.println(new EvenNumbers().evenNumbersList(numbers));
    }

    Long evenNumbersList(List<Integer> list) {

        return list.stream()
                .filter(num -> num % 2 == 0)
                .peek(System.out::print)
                .count();
    }
}
