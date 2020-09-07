import org.junit.Assert;
import org.junit.Test;

import java.rmi.UnexpectedException;

import static org.junit.Assert.*;

public class MorseEncryptorTest {

    @Test
    public void testCase1() {
        String input = "SOS";
        String expectedResult = "... --- ... ";
        String actualResult = MorseEncryptor.output(input);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCase2() {
        String input = "S O S";
        String expectedResult = "... / --- / ... ";
        String actualResult = MorseEncryptor.output(input);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCase3() {
        String input = "GeekHub";
        String expectedResult = "--. . . -.- .... ..- -... ";
        String actualResult = MorseEncryptor.output(input);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCase4() {
        String input = "it is a good day to die";
        String expectedResult = ".. - / .. ... / .- / --. --- --- -.. / -.. .- -.-- / - --- / -.. .. . ";
        String actualResult = MorseEncryptor.output(input);
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCase5() {
        String input = "$0m*th!#g Br0k*#!";
        String expectedResult = "You should've entered numbers or letters, dumb!";
        String actualResult = MorseEncryptor.output(input);
        Assert.assertEquals(expectedResult, actualResult);
    }
}