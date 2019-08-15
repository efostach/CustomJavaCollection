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
                    For example, array = [3, 8, 15, 17], Number = 23, Result = [1,2].


## Examples of the work.

### Test case for array[0]

Add    element = 5    result: [5]

Delete element = 2    result: [5]
Delete element = 0    result: []
Delete element = 100  result: []
Delete element = -1   result: []

Search index = 2, value = null
Search value = 7, index = null

Average value = null
Max value     = null
Min value     = null

Sum of elements is 2.   The number of elements: null

### Test case for array[n]

Add    element = 1    result: [1]
Add    element = 2    result: [3, 2]
Add    element = 3    result: [6, 5, 3]
Add    element = 4    result: [10, 9, 7, 4]
Add    element = 5    result: [15, 14, 12, 9, 5]
Add    element = 6    result: [21, 20, 18, 15, 11, 6]
Add    element = 7    result: [28, 27, 25, 22, 18, 13, 7]
Add    element = 8    result: [36, 35, 33, 30, 26, 21, 15, 8]
Add    element = 9    result: [45, 44, 42, 39, 35, 30, 24, 17, 9]

Delete element = 2    result: [3, 2, -3, -7, -12, -18, -25, -33]
Delete element = 0    result: [-1, -6, -10, -15, -21, -28, -36]
Delete element = 100  result: [-1, -6, -10, -15, -21, -28, -36]
Delete element = -1   result: [-1, -6, -10, -15, -21, -28, -36]

Search index = 2, value = -10
Search value = 7, index = null

Average value = -16
Max value     = -1
Min value     = -36

Is duplicates exist? - false

Add    element = 1    result: [0, -5, -9, -14, -20, -27, -35, 1]
Add    element = 1    result: [1, -4, -8, -13, -19, -26, -34, 2, 1]

Is duplicates exist? - true

Sum of elements is 2.   The number of elements: [0, 8]
Sum of elements is -12. The number of elements: [0, 3]