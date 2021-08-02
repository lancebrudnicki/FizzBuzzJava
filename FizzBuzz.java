public class FizzBuzz {
    public String fizzBuzz(int number) {
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        if(number % 3 == 0){
            return "Fizz";
        }
        else if(number % 5 == 0){
            return "Buzz";
        }
        else{
            return "" + number;
        }
    }
    // NINJA BONUS:
    // Create an overloaded method for fizzBuzz
    // public void String fizzBuzz(
    //     // Parameters
    //     int number,  
    //     String multOf3Word, 
    //     String multOf5Word,
    //     String multOf15Word
    //     ) {
        // Implement the same logic, but replace "Fizz", "Buzz" and 
        // "Fizzbuzz" with the given words
    // }
}

