import java.lang.reflect.Method;
public class Calculate{
    private static Calculate instance = new Calculate();
    public Port port;
    private Calculate() {
        port = new Port();
    }
    public static Calculate getInstance() {
        return instance;
    }

    public class Port implements ICalculate{
        private Method[] methods = getClass().getMethods();
        @Override
        public boolean checkSemiprime(int num){
            return Calculate.this.checkSemiprime(num);
        }
    }

    public boolean checkSemiprime(int num)
    {
        int cnt = 0;
        for (int i = 2; cnt < 2 && i * i <= num; ++i)
            while (num % i == 0) {
                num /= i;
                ++cnt; // Increment count of prime numbers
            }
        // If number is greater than 1, add it to
        // the count variable as it indicates the
        // number remain is prime number
        if (num > 1) {
            ++cnt;
        }
        // Return '1' if count is equal to '2' else
        // return '0'
        return cnt == 2;
    }
}
