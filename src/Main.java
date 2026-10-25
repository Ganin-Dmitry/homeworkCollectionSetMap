import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> nameList = new ArrayList<>(List.of(
                "Дмитрий",
                "Арина",
                "Дмитрий",
                "Ольга",
                "Даниил",
                "Владислав",
                "Ксения",
                "Владислав",
                "Дарья"));
        String text = "Весна пришла в наш тихий город." +
                " Этот старинный город сразу преобразился." +
                " Повсюду запели птицы, и эти птицы радовали жителей своими песнями." +
                " Солнце светило ярко, и теплое солнце согревало землю." +
                " Каждая улица ожила, ведь эта улица вела к центральному парку." +
                " В парке расцвели цветы, и яркие цветы дарили всем улыбки.";
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Homework.task1(nums);
        System.out.println();
        Homework.task2(nums);
        System.out.println();
        Homework.task3(nameList);
        System.out.println();
        Homework.task3(text);
        System.out.println();
        Homework.task4(strings);
    }
}