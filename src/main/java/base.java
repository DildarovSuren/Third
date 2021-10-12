import java.util.Scanner;
public class base {
    public Scanner in = new Scanner(System.in);
    private static int array[] = new int[20];

    public static void main(String[] args) {

        for (int j = 0; j < array.length; j++) {
            array[j] = random();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        findMinMax();

    }

    public static int random() {              //Метод для создания рандомных чисел
        int a = (int) (Math.random() * 20 - 10);
        return a;

    }

    public static void findMinMax() {     //Метод для поиска мин положительного и макс отрицательного значений в массиве
        int p = 0;
        int u = 0;
        int max = array[p];
        int min = array[u];
        for (int h = 1; h < array.length; h++) {
            if (max > 0) {
                if (array[h] < max && array[h] > 0) {
                    max = array[h];
                    p = h;
                }} else {
                    max = array[h];
                }

        } for (int h = 1; h < array.length; h++) {
            if (array[h] < min) {
                min = array[h];
                u = h;
            }
        }

        System.out.println("Самое маленькое положительное число массива " + max + ". Находится под номером " + p);
        System.out.println("Самое большое отрицательное число массива " + min + ". Находится под номером " + u);
        swap(array,p,u);
    }
    public static void swap(int[] arr, int p, int u) {  //Метод для смены индексов
        int tmp = arr[p];
        arr[p] = arr[u];
        arr[u] = tmp;
    }
}

