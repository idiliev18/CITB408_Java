package week1.homework.task1;

class Result {

    /*
     * Complete the 'countNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER bottom
     *  2. INTEGER top
     *  3. INTEGER difference
     */

    public static int swapFirstAndLastDigits(int number) {

        if (number < 10) {
            return number;
        }

        int digitCount = (int) Math.log10(number);
        int powerOfTen = (int) Math.pow(10, digitCount);
        int firstDigit = number / powerOfTen;
        int middleDigits = number % powerOfTen;

        return middleDigits * 10 + firstDigit;
    }

    public static int countNumbers(int bottom, int top, int difference) {
        if (bottom < 0 || top < 0) {
            return 0;
        }

        int resultCount = 0;

        for (int i = bottom; i <= top; i++) {
            if (Result.swapFirstAndLastDigits(i) - i > difference) {

                resultCount++;
            }
        }

        return resultCount;
    }

}
