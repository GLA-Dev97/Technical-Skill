// given an integer the size of n in one second you can increasethe value of one element by one to find the minimum time in second to make the all element of the array

import java.util.Scanner;
public class time_in_one_sec_in_arr {

    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,2,3};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int Time = max * arr.length - sum;
        System.out.println(Time);
    }
}


// obser..
// ::::To  minimize the time to make all the element is equal to the 
// find the maximum in the array
// for every element calculate how much it need to be increase to reach the maximum
// Sum all those differences