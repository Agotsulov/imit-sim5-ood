package ru.omsu.imit.course3.sorts;

import ru.omsu.imit.course3.core.Sort;

import java.util.Arrays;

public class InsertIntoSort implements Sort {

    public int[] sort(int[] array) {
        int [] result = Arrays.copyOf(array, array.length);
        int temp, j;
        for(int i = 0; i < result.length - 1; i++){
            if (result[i] > result[i + 1]) {
                temp = result[i + 1];
                result[i + 1] = result[i];
                j = i;
                while (j > 0 && temp < result[j - 1]) {
                    result[j] = result[j - 1];
                    j--;
                }
                result[j] = temp;
            }
        }
        return result;
    }
}
