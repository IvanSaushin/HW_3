import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/*
Комментарии к работе
Старался сделать сам только на основе объяснений и логики сортировки, не смотря в код с урока. То, что написано на уроке для меня
оказалось сложновато(понимаю - написать также не могу. чтобы учиться - делаю сам, а не переписываю)
В итоге реализовал ту же логику своим способом (как смог).
Правильно это или нет - жду от ответа от вас.
 */


public class trying1 {

    private static int[] arr1 = new int[10000];                       //Создаем массив из 10000 элементов
    private static int[] arr2;
    private static int[] arr3;
    private static int[] a1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};              //Пробный массив для 2-го задания
    private static int[] a2 = new int[]{950,840,720,660,500,770,30,200,1000};    //Пробный массив для 4-го задания

    //Удаление элемента с уменьшением массива и смещением всех элементов влево
    private static int[] remove(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        int newArr[] = Arrays.copyOf(arr, arr.length - 1);
        return newArr;
    }

    //Добавление элемента по индексу со смещением вправо
    private static int[] add(int[] arr, int index, int value) {
        int newArr[] = Arrays.copyOf(arr, arr.length + 1);
        for (int i = newArr.length - 1; i > index; i--) {
            newArr[i] = newArr[i - 1];
        }
        newArr[index] = value;
        return newArr;
    }

    //Поиск значения элемента массива с возвратом его индекса, если такой элемент есть, либо возврат -1
    private static int indexOf(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }



    //Пузирьковая сортировка
    private static void bubbleSort(int[] arr) {
        long start = System.nanoTime();

        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        long stop = System.nanoTime();
        long deltaT = TimeUnit.NANOSECONDS.toMillis(stop - start);
        //display(arr);
        System.out.println("Время пузырьковой сортировки = " + deltaT + " ms");
    }

    //Сортировка методом выбора
    private static void selectSort(int[] arr) {
        long start = System.nanoTime();
        int min = arr[0];
        int temp = 0;

        for (int i =0; i < arr.length; i++) {
            for (int j = i ; j < arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }


        long stop = System.nanoTime();
        long deltaT = TimeUnit.NANOSECONDS.toMillis(stop - start);
        //display(arr);
        System.out.println("Время сортировка по методу выбора = " + deltaT + " ms");
    }

    //Сортировка методом вставки - пока не сделал, но продолжаю работать
    private static void insertSort(int[] arr) {
        long start = System.nanoTime();
        int temp = 0;

        for (int i = 1; i < arr.length; i++) {
            int newArr[] = new int[i];

            if (arr[i]> arr[i-1]) {

            }
        }

        long stop = System.nanoTime();
        long deltaT = TimeUnit.NANOSECONDS.toMillis(stop - start);
        display(arr);
        System.out.println("Время сортировка по методу вставки = " + deltaT + " ms");
    }


    public static void main(String[] args) {

        //Проверка 2-го задания
        display(a1);
        System.out.print("Удаление 8-го элемента массива а1 ");
        a1 = remove(a1, 8);
        display(a1);

        display(a1);
        System.out.print("Добавление значения 6 на позицию 2 массива а1 ");
        a1 = add(a1, 2, 6);
        display(a1);
        System.out.print("Поиск в массиве а1 индекса по значению 6 = "); //не предусмотрены повторяющиеся элементы
        System.out.println(indexOf(a1, 6));


        //3 и 4-е задание
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new Random().nextInt();
        }
        arr2 = Arrays.copyOf(arr1, arr1.length);
        arr3 = Arrays.copyOf(arr1, arr1.length);

        bubbleSort(arr1);

        selectSort(arr2);

//        display(a2);
//        selectSort(a2);

    }




    private static void display(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println(" ]");
    }
}
