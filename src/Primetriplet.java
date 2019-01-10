import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Primetriplet {
        private static Primetriplet instance = new Primetriplet();
        public Port port;

        private Primetriplet() {
            port = new Port();
        }

        public static Primetriplet getInstance() {
            return instance;
        }

        public class Port {
            private Method[] methods = getClass().getMethods();

            public ArrayList<BigInteger> execute(BigInteger rangeFrom, BigInteger rangeTo) {
                return Primetriplet.this.execute(rangeFrom, rangeTo);
            }

            public void listMethods() {
                System.out.println("--- public methods for " + getClass().getName());
                for (int i = 0; i < methods.length; i++)
                    if (!methods[i].toString().contains("Object") && !methods[i].toString().contains("list"))
                        System.out.println(methods[i]);
                System.out.println("---");
            }
        }

        private ArrayList<BigInteger> PrimeGenerator(BigInteger rangeFrom, BigInteger rangeTo) {
            ArrayList<BigInteger> thePrimeList = new ArrayList<BigInteger>();
            for (BigInteger j = rangeFrom; j.compareTo(rangeTo) == -1; j = j.add(BigInteger.ONE)) {
                boolean prime = true;
                prime = IsPrime(j);
                if (prime && j != BigInteger.valueOf(1)) {
                    thePrimeList.add(j);
                }
            }
            return thePrimeList;
        }

        private boolean IsPrime(BigInteger thePrime) {
            boolean prime = true;
            BigInteger testVar = thePrime;
            for (BigInteger i = BigInteger.valueOf(2);
                 ((i.compareTo(testVar.divide(BigInteger.valueOf(2))) == 0) ||
                         ((i.compareTo(testVar.divide(BigInteger.valueOf(2))) == -1) || (i.compareTo(testVar.divide(BigInteger.valueOf(2))) == 0)));
                 i = i.add(BigInteger.valueOf(1))) {
                // condition for nonprime number
                if (testVar.mod(i) == BigInteger.valueOf(0)) {
                    prime = false;
                    break;
                }
            }
            return prime;
        }

        public ArrayList<BigInteger> execute(BigInteger rangeFrom, BigInteger rangeTo) {
            ArrayList<BigInteger> theList = new ArrayList<BigInteger>();
            ArrayList<BigInteger> thePrimeList = PrimeGenerator(rangeFrom, rangeTo);
            for (BigInteger i = BigInteger.valueOf(0); i.compareTo(BigInteger.valueOf(thePrimeList.size())) == -1; i = i.add(BigInteger.valueOf(1))) {
                if (IsPrime(thePrimeList.get(i.intValue()).add(BigInteger.valueOf(2))) && IsPrime(thePrimeList.get(i.intValue()).add(BigInteger.valueOf(6)))) {
                    theList.add(thePrimeList.get(i.intValue()));
                    theList.add(thePrimeList.get(i.intValue()).add(BigInteger.valueOf(2)));
                    theList.add(thePrimeList.get(i.intValue()).add(BigInteger.valueOf(6)));
                }
            }
            for (BigInteger i = BigInteger.valueOf(0); i.compareTo(BigInteger.valueOf(thePrimeList.size())) == -1; i = i.add(BigInteger.valueOf(1))) {
                if (IsPrime(thePrimeList.get(i.intValue()).add(BigInteger.valueOf(4))) && IsPrime(thePrimeList.get(i.intValue()).add(BigInteger.valueOf(6)))) {
                    theList.add(thePrimeList.get(i.intValue()));
                    theList.add(thePrimeList.get(i.intValue()).add(BigInteger.valueOf(4)));
                    theList.add(thePrimeList.get(i.intValue()).add(BigInteger.valueOf(6)));
                }
            }
            return theList;
        }

}
