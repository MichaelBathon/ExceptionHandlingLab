package bathon.michael.exceptionhandlinglab;

/**
 * Created by michaelbathon on 2/16/16.
 */
public class Calculator {

    static int add(int x, int y){
        return x + y;
    }

    static int subtract(int x, int y){
        return x - y;
    }

    static int multiply(int x, int y){
        return x * y;
    }

    static int divide (int x, int y) throws DivisionByZeroException {
        if(y == 0){
            throw new DivisionByZeroException("Can't divide by zero");
        }
        return x/y;
    }

}

class DivisionByZeroException extends Exception{

    DivisionByZeroException(){}
    DivisionByZeroException(String error){}

}
