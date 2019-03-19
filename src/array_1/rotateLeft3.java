package array_1;
// https://codingbat.com/prob/p185139


//Given an array of ints length 3, return an array with the elements "rotated left" 
// so {1, 2, 3} yields {2, 3, 1}.


//rotateLeft3([1, 2, 3]) → [2, 3, 1]
//rotateLeft3([5, 11, 9]) → [11, 9, 5]
//rotateLeft3([7, 0, 0]) → [0, 0, 7]
public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int order = 1;
        int[] outcome = new int[nums.length];
        for(int i=0; i<nums.length; i++){
          outcome[i]=nums[order];
          order++;
          if(order>nums.length-1) order =0;
        }
        return outcome;
      }

}
