import java.util.*;

abstract public class Homework {
    public static void task1 (List<Integer> nums) {
        for (Integer num: nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
    }

    public static void task2 (List<Integer> nums) {
        nums = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums);
        for (Integer num: nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void task3 (List<String> stringList) {
        stringList = new ArrayList<>(new LinkedHashSet<>(stringList));
        for (String str: stringList) {
            System.out.println(str);
        }
    }

    public static void task3 (String str) {
        str = str.toLowerCase();
        str = str.replace(".", "");
        str = str.replace(",", "");
        String[] strings = str.split(" ");
        List<String> wordList = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(strings)));
        for (String word: wordList) {
            System.out.println(word);
        }
    }

    public static void task4 (List<String> wordList) {
        List<String> oneIterationWordList = new ArrayList<>(new HashSet<>(wordList));
        for (String word: oneIterationWordList) {
            int quantity = 0;
            for (int index = 0; index < wordList.size(); index++) {
                if (word.equals(wordList.get(index))) {
                    quantity++;
                }
            }
            System.out.println(quantity);
        }
    }
}
