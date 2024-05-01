public class Solution3 {

    /*
        3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу, которая выведет в консоль все чётные числа.
     */
    public static void main(String[] args) {
        evenNumbers(new int[]{1, 2, 3, 4, 5, 6});
    }

    public static void evenNumbers(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
        }
    }
}
