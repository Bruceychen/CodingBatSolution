package array_1;
// https://codingbat.com/prob/p167011


// Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.


// makePi() → [3, 1, 4]
public class makePi {
    public int[] makePi() {
        double piV = Math.PI;
        String test = String.valueOf(piV);
        test =  test.substring(0,1)+test.substring(2);
        int[] outcome = new int[3];
        for(int i =0; i<3;i++) {
          outcome[i] = Integer.valueOf(test.substring(i,i+1));
        }
        return outcome;
      }

}
