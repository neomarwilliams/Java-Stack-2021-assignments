public class FizzBuzz {
    public String fizzBuzz(int someNum) {
        if(someNum % 3 == 0 && someNum % 5 == 0) {
            return "FizzBuzz";
        } else if(someNum % 3 == 0) {
            return "Fizz";
        } else if (someNum % 5 == 0) {
            return "Buzz";
        } else {
            return "" + someNum;
        }
    }
}