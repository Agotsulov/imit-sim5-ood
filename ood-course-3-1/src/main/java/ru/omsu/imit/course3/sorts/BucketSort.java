package ru.omsu.imit.course3.sorts;

import ru.omsu.imit.course3.core.Sort;

import java.util.Arrays;

public class BucketSort implements Sort {
    @Override
    public int[] sort(int[] array) {
        int[] items = Arrays.copyOf(array, array.length);

        int max = items.length;

        int[][] bucket = new int[10][max + 1];

        for (int x = 0; x < 10; x++)
            bucket[x][max] = 0;

        for (int digit = 1; digit <= 1000000000; digit *= 10) {
            for (int item : items) {
                int dig = (item / digit) % 10;
                bucket[dig][bucket[dig][max]++] = item;
            }
            int idx = 0;
            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < bucket[x][max]; y++) {
                    items[idx++] = bucket[x][y];
                }
                bucket[x][max] = 0;
            }
        }
        return items;
    }
}
