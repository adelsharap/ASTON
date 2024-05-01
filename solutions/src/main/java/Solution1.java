public class Solution1 {

    /*
        1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
        - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
        - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
     */
    public static void main(String[] args) {
        compareAndMathOperate(10, 5);
    }

    public static void compareAndMathOperate(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("sum a + b: " + (a + b));
        System.out.println("diff a - b: " + (a - b));
        System.out.println("mult a * b: " + (a * b));
        System.out.println("div a / b: " + (a / b));
    }
}
