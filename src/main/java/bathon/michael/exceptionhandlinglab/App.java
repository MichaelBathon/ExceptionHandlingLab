package bathon.michael.exceptionhandlinglab;

/**
 * Created by michaelbathon on 2/16/16.
 */
public class App {

    public static void main(String[] args){

        System.out.println(Calculator.add(4,5));
        System.out.println(Calculator.add(33,45));

        System.out.println(Calculator.subtract(4,5));
        System.out.println(Calculator.subtract(5,4));

        try{
            System.out.println(Calculator.divide(20,5));
        } catch(DivisionByZeroException e){
            System.out.println("Dividing by zero not allowed");
        }

        try{
            Calculator.divide(5,0);
        } catch(DivisionByZeroException e){
            System.out.println("Dividing by zero not allowed");
        }

        System.out.println(Calculator.multiply(4,5));
        System.out.println(Calculator.multiply(15,4));

    }

}
