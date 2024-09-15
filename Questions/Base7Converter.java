public class Base7Converter {
    public static String convertToBase7(int num) {
        if (num == 0) {   // Special case for 0
            return "0";
        }
        boolean isNegative = num < 0;     // Determine if the number is negative
        num = Math.abs(num);

        StringBuilder base7 = new StringBuilder();
        while (num > 0) {      // Convert to base 7
            base7.append(num % 7);
            num /= 7;
        }

        if (isNegative) {    // If the number was negative, append the negative sign
            base7.append("-");
        }
        return base7.reverse().toString();   // Since digits are added in reverse order, reverse the string
    }
}
