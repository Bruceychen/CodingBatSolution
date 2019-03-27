package Logic_2;
// https://codingbat.com/prob/p191363?parent=/doc/practice/makebricks-solution-code.html

// We want make a package of goal kilos of chocolate.
// We have small bars (1 kilo each) and big bars (5 kilos each).
// Return the number of small bars to use, assuming we always use big bars before small bars.
// Return -1 if it can't be done.
//
//        makeChocolate(4, 1, 9) → 4
//        makeChocolate(4, 1, 10) → -1
//        makeChocolate(4, 1, 7) → 2

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        if( small+big*5 < goal){
            return -1;
        }else if(goal%5 <= small){
            if(big*5>goal){
                return goal-goal/5*5;
            }else if(big*5==goal){
                return 0;
            }else{
                return goal-big*5;
            }
        }
        return -1;
    }

}
