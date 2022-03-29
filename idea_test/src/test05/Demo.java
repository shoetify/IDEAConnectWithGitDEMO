package test05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        int[] img = {0,0,1,1,1,2,2,3,3,4};
        DemoClass dc =  new DemoClass();
        int ans = dc.removeDuplicates(img);

        System.out.println(ans);
    }
}
