import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args) {

        // Collection<Integer> nums= new ArrayList<Integer>();
        // Collection nums=new ArrayList();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        // nums.add("5");

        System.out.println(nums.get(2));

        System.out.println(nums.indexOf(2));

        // for(int n:nums)
        // {
        // System.out.println(nums);
        // }
        for (@SuppressWarnings("unused")
        Integer n : nums) {
            System.out.println(nums);
        }
    }
}

// Collection API -> concept
// Collection -> Interface
// Collections -> classe with multiple methods
// different type of data structures