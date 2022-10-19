import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int max = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        IntStream.range(0, size).forEach(i -> list.add(i, random.nextInt(max)));
        System.out.println("Вот случайный список: " + list.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(list);
        logger.log("Прошло фильтр " + result.size() + " элемента из " + list.size());

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}