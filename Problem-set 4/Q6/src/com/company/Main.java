package com.company;

import java.util.Arrays;

public class Main {

    public static int findRange(int[] intArray) {
        if(intArray.length>0) {
            int[] arr = intArray;
            Arrays.sort(arr);
            int result = arr[arr.length-1]-arr[0];
            return result;
        }
        return -1;
    }

    public static void main(String[] args) {
	    int[] arr = {1, 0, 2, 3, -1, 2};
        System.out.println(findRange(arr));
    }
}