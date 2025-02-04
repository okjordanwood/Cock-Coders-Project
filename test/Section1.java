import java.util.ArrayList;;

public class Section1 {
    /**
     * Will reverse the order of the digits in the number
     * e.g. 234 becomes 432
     * 
     * @param number The number to reverse the digits of
     * @return The integer representation of the reversed number
     */
    public int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
