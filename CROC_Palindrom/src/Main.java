import java.util.Scanner;

public class Main {
    /**
     * Проверка, является ли введенная строка палиндромом.
     * @author: Назаров Максим
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrStr = scanner.nextLine().replaceAll("\\s+","");
        if (Polindrom(arrStr))
            System.out.printf("%s - полиндром \n", arrStr);
        else
            System.out.printf("%s - не полиндром \n", arrStr);
    }

    /**
     *  В 11 строке происходит ввод строки, слова и т.д. пользователем, где:
     *  toLowerCase - преобразование строки к нижнему регистру
     *  replaceAll - замена элемента строки, в данном случае пробел
     */

    private static boolean Polindrom(String targetStr){

        if (targetStr.length() == 1)
            return true;
        for (int i = 0; i < targetStr.length()/2; i++) {
            if (targetStr.toLowerCase().charAt(i) != targetStr.toLowerCase().charAt(targetStr.length() - 1 - i))
                return false;
        }
        return true;
    }
    /**
     * В Polindrom идет проверка строки введённой пользователем.
     * Сравнивается по элементно т.е. первый с последним, второй с предпоследним и т.д.
     */
}
