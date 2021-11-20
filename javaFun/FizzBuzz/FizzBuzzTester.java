public class FizzBuzzTester {
    public static void main(String[] args){
        FizzBuzz tester = new FizzBuzz();
        // System.out.println(tester.fizzBuzz(12));
        // System.out.println(tester.fizzBuzz(2));
        // System.out.println(tester.fizzBuzz(50));
        // System.out.println(tester.fizzBuzz(60));
        // System.out.println(tester.fizzBuzz(11));
        for (int i = 1; i <= 50; i++) {
            System.out.println(tester.fizzBuzz(i));
        }
    }
}