# CustomJavaCollection

Custom collection can manipulate of integer values and forbid adding to collection null, symbols and other types as value.

Current collection presents an array and provides the following operations:
  - add();
  - delete();
  - searchByIndex();
  - searchByValue();
  - searchAverageValue();
  - searchMaxValue();
  - searchMinValue();
  - isDuplicatesExist();
  - searchTerms();

## How methods work?

  - add() - adding value to the end of the collection and simultaneously increasing existing values on added value.

  - delete() - deleting value from the collection and simultaneously decreasing existing values on deleted value.

  - searchTerms() - finding two indexes of the collection that gives a sum equals to input value.

## Examples of the work.

### Test case for array[0]

<Add    element = 5    result: [5]

Delete element = 2    result: [5] </br>
Delete element = 0    result: [] </br>
Delete element = 100  result: [] </br>
Delete element = -1   result: []

Search index = 2, value = null </br>
Search value = 7, index = null

Average value = null </br>
Max value     = null </br>
Min value     = null

Sum of elements is 2.   The number of elements: null>

### Test case for array[n]

Add    element = 1    result: [1] </br>
Add    element = 2    result: [3, 2] </br>
Add    element = 3    result: [6, 5, 3] </br>
Add    element = 4    result: [10, 9, 7, 4] </br>
Add    element = 5    result: [15, 14, 12, 9, 5] </br>
Add    element = 6    result: [21, 20, 18, 15, 11, 6] </br>
Add    element = 7    result: [28, 27, 25, 22, 18, 13, 7] </br>
Add    element = 8    result: [36, 35, 33, 30, 26, 21, 15, 8] </br>
Add    element = 9    result: [45, 44, 42, 39, 35, 30, 24, 17, 9]

Delete element = 2    result: [3, 2, -3, -7, -12, -18, -25, -33] </br>
Delete element = 0    result: [-1, -6, -10, -15, -21, -28, -36] </br>
Delete element = 100  result: [-1, -6, -10, -15, -21, -28, -36] </br>
Delete element = -1   result: [-1, -6, -10, -15, -21, -28, -36]

Search index = 2, value = -10 </br>
Search value = 7, index = null

Average value = -16 </br>
Max value     = -1 </br>
Min value     = -36 </br>

Is duplicates exist? - false

Add    element = 1    result: [0, -5, -9, -14, -20, -27, -35, 1] </br>
Add    element = 1    result: [1, -4, -8, -13, -19, -26, -34, 2, 1]

Is duplicates exist? - true

Sum of elements is 2.   The number of elements: [0, 8] </br>
Sum of elements is -12. The number of elements: [0, 3]