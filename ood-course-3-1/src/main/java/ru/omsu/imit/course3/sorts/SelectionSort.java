package ru.omsu.imit.course3.sorts;

import ru.omsu.imit.course3.core.Sort;

import java.util.Arrays;

public class SelectionSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        int [] numbers = Arrays.copyOf(array, array.length);
        int min, temp;

        for (int index = 0; index < numbers.length-1; index++){
            min = index;
            for (int scan = index+1; scan < numbers.length; scan++){
                if (numbers[scan] < numbers[min])
                    min = scan;
            }

            // Swap the values
            temp = numbers[min];
            numbers[min] = numbers[index];
            numbers[index] = temp;
        }
        return numbers;
    }
}
