package com;

public class QuickSort {

    // Метод для выполнения Быстрой сортировки массива
    public static void quickSort(int[] arr, int low, int high) {
        // Проверяем, что индекс low меньше high (чтобы убедиться, что диапазон валиден)
        if (low < high) {
            // Разбиваем массив и получаем индекс опорного элемента (pivot)
            int pivotIndex = partition(arr, low, high);

            // Рекурсивно сортируем элементы до и после опорного элемента
            quickSort(arr, low, pivotIndex - 1);  // Сортируем левую часть
            quickSort(arr, pivotIndex + 1, high); // Сортируем правую часть
        }
    }

    // Метод для разбиения массива и возврата индекса опорного элемента
    private static int partition(int[] arr, int low, int high) {
        // Выбираем последний элемент в качестве опорного
        int pivot = arr[high];
        int i = low - 1; // Индекс для меньших элементов

        // Проходим по массиву и сравниваем каждый элемент с опорным
        for (int j = low; j < high; j++) {
            // Если текущий элемент меньше или равен опорному
            if (arr[j] <= pivot) {
                i++;
                // Меняем местами элементы arr[i] и arr[j]
                swap(arr, i, j);
            }
        }

        // Меняем местами arr[i+1] и опорный элемент (arr[high])
        swap(arr, i + 1, high);
        return i + 1; // Возвращаем индекс опорного элемента
    }





    // Метод для обмена местами двух элементов массива
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Основной метод для тестирования алгоритма Быстрой сортировки
    public static void main(String[] args) {
        // Пример массива для сортировки
        int[] arr = {65, 80, 30, 90, 40, 50, 10,60};
//        int[] arr = {1,5,3,4,2};


        // Вызов метода Быстрой сортировки
        quickSort(arr, 0, arr.length - 1);

        // Вывод отсортированного массива
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

