import java.math.BigInteger;
import java.util.ArrayList;

public interface ICalculate {
    ArrayList<BigInteger> Semiprime(BigInteger rangeFrom, BigInteger rangeTo);
    ArrayList<BigInteger> Primetriplet(BigInteger rangeFrom, BigInteger rangeTo);
    ArrayList<BigInteger> MultiplicativePrime(BigInteger rangeFrom, BigInteger rangeTo);
    void listMethods();
}
