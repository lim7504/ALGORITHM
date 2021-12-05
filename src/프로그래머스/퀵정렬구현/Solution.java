package 프로그래머스.퀵정렬구현;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {5,4,3,2,1};
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        s.quickSort(array, 0, array.length -1);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
    }

    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int partition(int[] array, int left, int right){
        int pivot = array[left];
        int low = left + 1;
        int high = right;

        while (low <= high){
            while (low <= right && pivot >= array[low]) low ++;
            while (high >= left && pivot <= array[high]) high --;
            if(low <= high)
                swap(array, low, high);
        }

        swap(array, left, high);
        return high;
    }

    public void quickSort(int[] array, int left, int right){

        if(left <= right){
            int pivot = this.partition(array, left, right);
            this.quickSort(array, left, pivot -1);
            this.quickSort(array, pivot + 1, right);
        }
    }
}
