public class Solution2 {

    /*
        2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
        В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

     */
    public static void main(String[] args) {
        System.out.println(stringsEquals("a", "a"));
    }

    public static String stringsEquals(String a, String b) {
        return a.equals(b)
                ? "Строки идентичны"
                : "Строки неидентичны";
    }
}
