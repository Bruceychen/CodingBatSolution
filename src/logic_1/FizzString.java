package logic_1;
// https://codingbat.com/prob/p137136


// Given a string str, if the string starts with "f" return "Fizz".
// If the string ends with "b" return "Buzz".
// If both the "f" and "b" conditions are true,
// return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)
//
//
//        fizzString("fig") → "Fizz"
//        fizzString("dib") → "Buzz"
//        fizzString("fib") → "FizzBuzz"

public class FizzString {
    public String fizzString(String str) {
        String output ="";
        boolean f = str.startsWith("f");
        boolean b = str.endsWith("b");

        if(f) output += "Fizz";
        if(b) output += "Buzz";
        if(!f&&!b) output = str;
        return output;
    }

}
