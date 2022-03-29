package test05;

import java.util.*;

public class DemoClass {

    public DemoClass() {
    }

    public int removeDuplicates(int[] nums) {
        int i = 0, leng = nums.length;
        while (i<leng-1) {
            if (nums[i]==nums[i+1]) {
                for (int j = i+1; j<leng-1; j++) {
                    nums[j] = nums[j+1];
                    leng--;
                }
            }
            else {
                i++;
            }
        }
        return leng;
    }

}
