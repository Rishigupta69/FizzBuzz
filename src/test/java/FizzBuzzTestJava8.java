import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTestJava8 {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzzConvertorOnlyNumbers(){

        Assert.assertEquals("1", fizzBuzz.convertWithJava8(1));
        Assert.assertEquals("2", fizzBuzz.convertWithJava8(2));
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfThree(){

        Assert.assertEquals("Fizz", fizzBuzz.convertWithJava8(3));
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfFive(){

        Assert.assertEquals("Buzz", fizzBuzz.convertWithJava8(5));
    }

    @Test
    public void multiplesOfBothThreeAndFive(){

        Assert.assertEquals("FizzBuzz", fizzBuzz.convertWithJava8(15));
    }

    @Test
    public void outputTheHundredFizzBuzzes(){

        for(int i=1; i<=100; i++){
            System.out.println(fizzBuzz.convertWithJava8(i));
        }
    }

}
