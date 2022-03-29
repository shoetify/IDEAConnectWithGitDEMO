package test01;

public class array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        reverseArr(arr1);
        for (int i = 0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static void reverseArr(int[] arr) {
        int temp = 0;
        for (int i = 0; i< arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }
}
