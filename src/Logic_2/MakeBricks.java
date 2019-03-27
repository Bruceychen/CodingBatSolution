package Logic_2;
// https://codingbat.com/prob/p183562

// We want to make a row of bricks that is goal inches long.
// We have a number of small bricks (1 inch each) and big bricks (5 inches each).
// Return true if it is possible to make the goal by choosing from the given bricks.
// This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
//
//
//        makeBricks(3, 1, 8) → true
//        makeBricks(3, 1, 9) → false
//        makeBricks(3, 2, 10) → true
public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        // SOLUTION 2
        if(big*5+small<goal){
            return false;
        }else{
            if(goal%5<=small){
                return true;
            }else{
                return false;
            }
        }

        // SOLUTION 1
//        if(goal/5>big){
//            if(goal-big*5 <=small){
//                return true;
//            }else{
//                return false;
//            }
//        }else if (goal/5==big && goal%5==0){
//            return true;
//        }else{
//            if(goal%5<=small){
//                return true;
//            }else{
//                return false;
//            }
//        }

    }

}
