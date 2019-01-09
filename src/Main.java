public class Main {
    public static void main(String []args){
        Calculate theCalculator = Calculate.getInstance();
        if(theCalculator.port.checkSemiprime(4)){
            System.out.println(1);
        }
        if(theCalculator.port.checkSemiprime(6)){
            System.out.println(1);
        }
        if(theCalculator.port.checkSemiprime(9)){
            System.out.println(1);
        }
        if(theCalculator.port.checkSemiprime(10)){
            System.out.println(1);
        }
        if(theCalculator.port.checkSemiprime(14)){
            System.out.println(1);
        }
        if(theCalculator.port.checkSemiprime(16)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
