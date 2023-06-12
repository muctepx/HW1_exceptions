package Algorithm.Exceptions.seminar1.HW;

import java.util.Arrays;

public class task3 {

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных
    // массива,
    // и возвращающий новый массив, каждый элемент которого равен разности элементов
    // двух входящих массивов в той же ячейке. Если длины массивов не равны,
    // необходимо
    // как-то оповестить пользователя.
    public class Main {
        public static void main(String[] args) throws Exception {
            arrayDivided taskCalculation = new arrayDivided();
            int[] array1 = new int[] { 1, 2, 3 };
            int[] array2 = new int[] { 4, 5, 6 };
            Print.NewSOUT(taskCalculation.calculateDifference(array1, array2));

            array1 = new int[] { 1, 2, 3 };
            array2 = new int[] { 4, 5, 6, 7 };
            Print.NewSOUT(taskCalculation.calculateDifference(array1, array2));

        }
    }
    public class Print {
    public static void NewSOUT(int[] inArray){
        if (inArray != null) {
            System.out.println(Arrays.toString(inArray));
        }
    }
}
}
