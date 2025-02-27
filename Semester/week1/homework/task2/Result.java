package week1.homework.task2;

class Result {

    /*
     * Complete the 'sumOfNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER size as parameter.
     */

    public static int sumOfNumbers(int size) {
        if(size < 1 || size > 9){
            return 0;
        }

        int startingPoint = size * 2;
        int quadraticSequenceSum = (startingPoint * (startingPoint + 1) * (startingPoint + 2)) / 12;

        return quadraticSequenceSum * 2 - startingPoint;
    }

}
