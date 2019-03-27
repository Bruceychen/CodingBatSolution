package Logic_2;
//https://codingbat.com/prob/p148972


// Given 3 int values, a b c, return their sum. However,
// if one of the values is the same as another of the values, it does not count towards the sum.
//
//
//        loneSum(1, 2, 3) → 6
//        loneSum(3, 2, 3) → 2
//        loneSum(3, 3, 3) → 0

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        boolean ab = (a==b);
        boolean ac = (a==c);
        boolean bc = (b==c);

        if(ab&&ac&&bc){
            return 0;
        }else if(ab){
            return c;
        }else if(ac){
            return b;
        }else if(bc){
            return a;
        }
        return a+b+c;

        //official solution
//        int outcome=0;
//        if(a!=b && a!=c){
//            outcome +=a;
//        }
//        if(b!=a && b!=c){
//            outcome += b;
//        }
//        if(c!=a && c!=b){
//            outcome += c;
//        }
//        return outcome;
    }

}
