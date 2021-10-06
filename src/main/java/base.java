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
        System.out.println("Вот" + array[0]);

    }

    public static int random() {              //Метод для создания рандомных чисел
        int a = (int) (Math.random() * 20 - 10);
        return a;

    }

    public static void findMinMax() {     //Метод для поиска мин и макс значений в массиве
        int p = 0;
        int u = 0;
        int max = array[p];
        int min = array[u];
        for (int h = 1; h < array.length; h++) {
            if (array[h] > max) {
                max = array[h];
                p = h;
            } else if (array[h] < min) {
                min = array[h];
                u = h;
            }

        }
        System.out.println("Самое большое число массива " + max + ". Находится под номером " + p);
        System.out.println("Самое маленькое число массива " + min + ". Находится под номером " + u);
        swap(array,p,u);
    }
    public static void swap(int[] arr, int p, int u) {  //Метод для смены индексов
        int tmp = arr[p];
        arr[p] = arr[u];
        arr[u] = tmp;
    }
}

