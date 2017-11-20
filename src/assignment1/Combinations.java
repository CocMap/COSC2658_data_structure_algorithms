/*
RMIT University Vietnam
Course: COSC2658 Data Structures & Algorithms
Semester: 2017C
Assignment: 1
Author: Tran Le Nha Tran
ID: s3533562
Created date: 8/11/2017
Acknowledgement:
- StackOverflow: https://stackoverflow.com/questions/14293263/java-arraylist-clear-function
- Youtube: https://www.youtube.com/watch?v=8mBxpDWEKNw
*/

package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
    public static void printCombinations(int[] arr, int sum){
        //sum = element value (1 element)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sum) {
                System.out.println("[" + arr[i] + "]");
                break;
            }
        }

        //more than 1 element
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < sum){
                int temp = 0;                                       //temporary result to compare with sum
                int remainder = sum - temp;                         //the remain value to reach the sum
                int count = 1;
                List<Integer> element = new ArrayList<Integer>();   //list stores elements result

                //2 elements
                for(int j = i; j < arr.length; j++) {
                    temp = arr[i];                                  //chose temp = arr[0] as base value
                    remainder = sum - temp;                         //update remainder
                    if (arr[j] == remainder) {                      //if equal -> add two values
                        element.add(arr[i]);
                        element.add(remainder);
                        System.out.println(Arrays.toString(element.toArray()));
                    }
                    temp = 0;                                       //return temp and clear element list
                    element.clear();
                }

                //more than 2 elements
                for(int j = i; j < arr.length - 1; j++){
                    if(arr[j] <= remainder){
                        temp = temp + arr[j];                       //compare element with remainder and update
                        remainder = sum - temp;
                        element.add(arr[j]);                        //add value
                    }
                    if(temp == sum){
                        System.out.println(Arrays.toString(element.toArray())); //print out when reach the condition
                        temp = arr[i];                              //return base value of temp for next comparision
                        count++;                                    //count = compare with next element
                        j = count;
                    }
                }
            }
        }
    }

    public static void printResult(int[] arr, int sum) {
        System.out.println("Array: " + Arrays.toString(arr) + " Sum: " + sum );
        System.out.println("Output: ");
        printCombinations(arr,sum);
    }

    public static void main(String[] args) {
        int[] arr = {2,7,15,1,8,32};
        int[] arr1 = {12,2,4,7,10,33,9};
        int[] arr2 = {1,3,2,7,10,8,4,6};

        int sum = 15;
        int sum1 = 19;
        int sum2 = 10;

        printResult(arr, sum);
        printResult(arr1, sum1);
        printResult(arr2, sum2);
    }
}




