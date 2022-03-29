package test03;

import java.util.Scanner;

public class AppendAndReverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

/*        StringBuilder sb =  app(arr);
        System.out.println(sb);

        System.out.println("-------------");

        String s = sb.reverse().toString();
        System.out.println(s);*/

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();
        System.out.println(s);

    }

    public static StringBuilder app(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i<arr.length-1; i++) {
            sb.append(arr[i]).append(',');
        }
        sb.append(arr[arr.length-1]).append(']');
        return sb;
    }
}
