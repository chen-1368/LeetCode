package fastSort;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        mySort(arr,0,n-1);
        int Min=Integer.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            Min=Math.min(Min,arr[i+m-1]-arr[i]);
        }
        System.out.println(Min);
    }
    public static void mySort(int[] arr,int start,int end) {
        if (start >= end) return;
        int p = getMid(arr,start,end);
        mySort(arr,start,p-1);
        mySort(arr,p+1,end);
    }

    private static int getMid(int[] arr,int start,int end) {
        int p=start;
        int i=start;
        int temp = arr[end];
        while (i<end){
            if (arr[i]<temp){
                mySwap(arr,i++,p++);
            }else {
                i++;
            }
        }
        mySwap(arr,p,end);
        return p;
    }

    private static void mySwap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}