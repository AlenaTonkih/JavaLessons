package HackerRank;

public class MyCalculator implements AdvancedArithmetic{
    int sum = 1;
    @Override
    public int divisorSum(int number) {
        for (int i = 2; i <= 1000; i++) {
            if(number % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
