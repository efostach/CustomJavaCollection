package main.java.com.efostach.customjavacollection;

public class CustomCollection {

    private int[] array = new int[0];

    int[] add(int value) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] + value;
        }
        newArray[newArray.length - 1] = value;
        return array = newArray;
    }

    int[] delete(int index) {
        if (index < 0 || index >= array.length) return array;

        int[] newArray = new int[array.length - 1];

        int m = 0;
        if (newArray.length > 0) {
            for (int i = 0; i < array.length; i++, m++) {
                if (i != index) {
                    newArray[m] = array[i] - array[index];
                } else {
                    if (i < array.length) {
                        newArray[m] = array[++i] - array[index];
                    }
                }
            }
        }
        return array = newArray;
    }


    Integer searchByIndex(int index) {
        if (index < 0 || index > array.length) return null;
        return array[index];
    }

    Integer searchByValue(int value) {
        if (array.length > 0) {
            int i = 0;
            while (i < array.length) {
                if (array[i] != value) {
                    i++;
                } else return i;
            }
        }
        return null;
    }

    Integer searchAverageValue() {
        int average = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                average += array[i];
            }

            return average / array.length;
        }
        return null;
    }

    Integer searchMaxValue() {
        if (array.length > 0) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        }
        return null;
    }

    Integer searchMinValue() {
        if (array.length > 0) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }
        return null;
    }
}
