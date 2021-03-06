import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzzConvertorOnlyNumbers(){

        Assert.assertEquals("1", fizzBuzz.convert(1));
        Assert.assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfThree(){

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfFive(){

        Assert.assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    public void multiplesOfBothThreeAndFive(){

        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

    @Test
    public void outputTheHundredFizzBuzzes(){

        for(int i=1; i<=100; i++){
            System.out.println(fizzBuzz.convert(i));
        }
    }

}
