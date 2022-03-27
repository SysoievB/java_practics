package tasks.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Условие задачи. Задано множество фамилий сотрудников. Разработать программу, которая отображает все фамилии,
 * начинающиеся на букву «J». Задачу решить с использованием Stream API.
 * */
public class NamesStartsWithJ {

    public static void main(String[] args) {
        List<String> list = List.of("jake", "Jill", "mike", "Neo");
        new NamesStartsWithJ().namesStartsWithJ(list).forEach(System.out::println);
    }

    List<String> namesStartsWithJ(List<String> list) {

        return list.stream()
                .filter(s -> s.startsWith("J") || s.startsWith("j"))
                .collect(Collectors.toList());
    }
}
