package logic_1;
// https://codingbat.com/prob/p113261


import java.util.Arrays;

//Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
//
//        twoAsOne(1, 2, 3) → true
//        twoAsOne(3, 1, 2) → true
//        twoAsOne(3, 2, 2) → false
public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        int[] output = {a,b,c};
        Arrays.sort(output);
        if(output[0]+output[1]==output[2]) return true;
        if(output[0]+output[2]==output[1]) return true;
        if(output[1]+output[2]==output[0]) return true;
        return false;
    }
}

