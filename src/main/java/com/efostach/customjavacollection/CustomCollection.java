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

    boolean isDuplicatesExist(){
        int value;
        int index = 0;

        while (index < array.length) {
            value = array[index];

            for (int i = 0; i < array.length; i++) {
                int duplicatesCount = 1;
                if (i == index)
                    i++;
                else if (array[i] == value)
                    duplicatesCount++;

                if (duplicatesCount > 1) return true;
            }
            index++;
        }
        return false;
    }

    int[] searchTerms(int number){
        if(array.length > 0){
            int sum;
            int[] result = new int[2];
            for(int i = 0; i < array.length; i++){
                for(int k = 0; k < array.length; k++) {
                    if(k == i && (k + 1) < array.length) k++;
                    sum = array[i] + array[k];
                    if(sum == number) {
                        result[0] = i;
                        result[1] = k;
                        return result;
                    }
                }
            }
        }
        return null;
    }
}
