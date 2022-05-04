package tasks.concurrency;

/**
 * Задание было следующее:
 *
 * Есть транспортные корабли, которые подплывают к туннели и далее плывут к причалам для погрузки
 * разного рода товара.
 * Они проходят через узкий туннель где одновременно могут находиться только 5 кораблей. Под словом
 * “подплывают к туннели” имеется ввиду то, что корабли должны откуда-то появляться. Их может быть
 * ограниченное количество, то есть 10 или 100, а может быть бесконечное множество. Слово “Подплывают”
 * назовем генератором кораблей.
 * Вид кораблей и их вместительность могут быть разными в зависимости от типа товаров, которые нужно
 * загрузить на корабль. То есть для ТЗ я придумал 3 Типа кораблей (Хлеб, Банан и Одежда) и три вида
 * вместительности 10, 50, 100 шт. товаров. 3 типа кораблей * 3 вида вместительности = 9 разных видов
 * кораблей.
 * Далее есть 3 вида причалов для погрузки кораблей — Хлеб, Банан и Одежда. Каждый причал берет или
 * подзывает к себе необходимый ему корабль и начинает его загружать. За одну секунду причал загружает
 * на корабль 10 ед. товара. То есть если у корабля вместительность 50 шт., то причал загрузит его за
 * 5 секунд своей работы.
 * */
public class MainClass {

    public static void main(String[] args) {

    }
}