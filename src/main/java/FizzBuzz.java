import java.util.Optional;

public class FizzBuzz {
    public String convert(int input){
        if(input % 3 == 0 && input % 5 == 0){
            return "FizzBuzz";
        }
        if(input % 3 == 0){
            return "Fizz";
        }
        if(input % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(input);
    }

    public String convertWithJava8(int input){
        String result = Optional.of(input)
                .map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : ""))
                .get();
        return result.isEmpty()? String.valueOf(input): result;
    }
}
