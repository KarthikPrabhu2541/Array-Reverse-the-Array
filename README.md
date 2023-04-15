# LEETCODE / ARRAYS / REVERSE THE ARRAY
A simple java program to reverse the provided array.

## Intution
There are three approaches to this simple problem.
1. Brute force
2. Two pointer 
3. reverse method

## 1. Brute Force Method

The approach where one uses a seperate array of the same length. A for loop is used where each iteration accesses the array but in a reverse order starting from the last index until it reaches the first index. Every time an element at an index is accessed using the indexing number of the loop in an iteration, that element is placed in complementary position in the second array.

The complementary position of index i of first array in the second array would be 
(n-1) - i 
where, 
      n -> length of the provided array 

For each iteration when the element in placed in its intended place then the array at the end of the loop would be the reverse of the array.

### Time complexity : O(n)
### Space complexity : O(n)

## 2. Two pointer Method

The approach here would be the have two pointers that point to complementary / opposite indices of the same given array. This method can be done using a for loop or a while loop but use while preferably. The two pointers are initialised to 0 and n-1 namly i and j.

The complementary index for the current index i is same as last method which is,
(n-1)-i

Every iteration , the current index and the complementary index elements are swaped with or without the use of another variable. The terminating state is different for the two cases
case 1 - even number of array elements - two middle points - pointer i is greated than j
case 2 - odd number of array elements - single middle point - pointer i and j are equal 
In either of these cases, the loop is terminated and the program execution is stopped. 

This method differs from the previous approach in the point that it does not need any input relative additional space to solve the problem and it needs to have half as many iterations.

### Time complexity : O(n)
### Space complexity : O(1)

## 3. Reverse Method

One of the most optimal yet it is one of the simplest to implement against all stereotypes around optimal code. All we need to do is  convert the given array into an arraylist. Arraylist is used here since we can use it as an input to the collections class in java which is responsible for implementing a lot of data related operations which also includes reversing the input.

We can use the reverse method and pass the arraylist as a parameter to this method of the collections class. This reversed list can then be printed as an arraylist.

### Time complexity : O(n)
### Space complexity : O(1)

## But the problem is that leetcode asks the user to make changes in the existing string so only method 2 and 3 would work in that case.

