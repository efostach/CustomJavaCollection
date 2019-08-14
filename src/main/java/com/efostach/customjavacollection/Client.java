package main.java.com.efostach.customjavacollection;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        CustomCollection collection = new CustomCollection();
        System.out.println("----- Test case for array[0] -----" + "\n");
        System.out.println("Add    element = 5    result: " + Arrays.toString(collection.add(5)) + "\n");

        System.out.println("Delete element = 2    result: " + Arrays.toString(collection.delete(2)));
        System.out.println("Delete element = 0    result: " + Arrays.toString(collection.delete(0)));
        System.out.println("Delete element = 100  result: " + Arrays.toString(collection.delete(100)));
        System.out.println("Delete element = -1   result: " + Arrays.toString(collection.delete(-1)) + "\n");

        System.out.println("Search index = 2, value = " + collection.searchByIndex(2));
        System.out.println("Search value = 7, index = " + collection.searchByValue(7) + "\n");

        System.out.println("Average value = " + collection.searchAverageValue());
        System.out.println("Max value     = " + collection.searchMaxValue());
        System.out.println("Min value     = " + collection.searchMinValue() + "\n");

        System.out.println("Sum of elements is 2.   Number elements: " + Arrays.toString(collection.searchTerms(2)));



        System.out.println("\n" + "----- Test case for array[n] -----" + "\n");
        System.out.println("Add    element = 1    result: " + Arrays.toString(collection.add(1)));
        System.out.println("Add    element = 2    result: " + Arrays.toString(collection.add(2)));
        System.out.println("Add    element = 3    result: " + Arrays.toString(collection.add(3)));
        System.out.println("Add    element = 4    result: " + Arrays.toString(collection.add(4)));
        System.out.println("Add    element = 5    result: " + Arrays.toString(collection.add(5)));
        System.out.println("Add    element = 6    result: " + Arrays.toString(collection.add(6)));
        System.out.println("Add    element = 7    result: " + Arrays.toString(collection.add(7)));
        System.out.println("Add    element = 8    result: " + Arrays.toString(collection.add(8)));
        System.out.println("Add    element = 9    result: " + Arrays.toString(collection.add(9)) + "\n");

        System.out.println("Delete element = 2    result: " + Arrays.toString(collection.delete(2)));
        System.out.println("Delete element = 0    result: " + Arrays.toString(collection.delete(0)));
        System.out.println("Delete element = 100  result: " + Arrays.toString(collection.delete(100)));
        System.out.println("Delete element = -1   result: " + Arrays.toString(collection.delete(-1)) + "\n");

        System.out.println("Search index = 2, value = " + collection.searchByIndex(2));
        System.out.println("Search value = 7, index = " + collection.searchByValue(7) + "\n");

        System.out.println("Average value = " + collection.searchAverageValue());
        System.out.println("Max value     = " + collection.searchMaxValue());
        System.out.println("Min value     = " + collection.searchMinValue() + "\n");

        System.out.println("Is duplicates exist? - " + collection.isDuplicatesExist() + "\n");

        System.out.println("Add    element = 1    result: " + Arrays.toString(collection.add(1)));
        System.out.println("Add    element = 1    result: " + Arrays.toString(collection.add(1)) + "\n");

        System.out.println("Is duplicates exist? - " + collection.isDuplicatesExist() + "\n");

        System.out.println("Sum of elements is 2.   Number elements: " + Arrays.toString(collection.searchTerms(2)));
        System.out.println("Sum of elements is -12. Number elements: " + Arrays.toString(collection.searchTerms(-12)));

    }
}
