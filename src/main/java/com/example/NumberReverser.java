package com.example;

public final class NumberReverser {
    private NumberReverser() {
    }

    public static int reverse(int number) {
        int reversed = 0;
        int remaining = number;

        while (remaining != 0) {
            int digit = remaining % 10;
            remaining /= 10;

            if (reversed > Integer.MAX_VALUE / 10
                    || (reversed == Integer.MAX_VALUE / 10 && digit > 7)
                    || reversed < Integer.MIN_VALUE / 10
                    || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                throw new ArithmeticException("Reversed number is outside the int range");
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java com.example.NumberReverser <integer>");
            System.exit(1);
        }

        try {
            int number = Integer.parseInt(args[0]);
            System.out.println(reverse(number));
        } catch (NumberFormatException | ArithmeticException exception) {
            System.err.println("Error: " + exception.getMessage());
            System.exit(1);
        }
    }
}
