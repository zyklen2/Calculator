import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String []args){
        Calculate theCalculator = Calculate.getInstance();

        Calculate theCal = Calculate.getInstance();
        theCal.port.listMethods();

        /*Primetriplet newTrip = Primetriplet.getInstance();
        newTrip.port.listMethods();
        ArrayList<BigInteger> theList=theCalculator.port.Semiprime(BigInteger.valueOf(1), BigInteger.valueOf(20));
        for(int i=0;i<theList.size();i++) {
            System.out.println(theList.get(i));
        }
        ArrayList<BigInteger> theList2=theCalculator.port.Primetriplet(BigInteger.valueOf(1), BigInteger.valueOf(20));
        for(int i=0;i<theList2.size();i++) {
            System.out.println(theList2.get(i));
        }

        ArrayList<BigInteger> theList2=theCalculator.port.MultiplicativePrime(BigInteger.valueOf(1), BigInteger.valueOf(20));
        for(int i=0;i<theList2.size();i++) {
            System.out.println(theList2.get(i));
        }

        BigInteger []a={BigInteger.valueOf(5),BigInteger.valueOf(7),BigInteger.valueOf(11)};
        if(theCalculator.port.checkPrimetriplet(a)){
            System.out.println(1);
        }
        BigInteger []b={BigInteger.valueOf(7),BigInteger.valueOf(11),BigInteger.valueOf(14)};
        if(theCalculator.port.checkPrimetriplet(b)){
            System.out.println(1);
        }
        if(theCalculator.port.checkMultiplicativePrime(BigInteger.valueOf(113))){
            System.out.println(1);
        }
        if(theCalculator.port.checkMultiplicativePrime(BigInteger.valueOf(131))){
            System.out.println(1);
        }
        if(theCalculator.port.checkMultiplicativePrime(BigInteger.valueOf(111711))){
            System.out.println(1);
        }*/
    }
}
