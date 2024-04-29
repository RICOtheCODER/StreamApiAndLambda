package LambdaExpression;

public class EnhancedCalculator {
    //create a method calculate thatt should take3 arguments ,two operands which should be integers
    //third should be operation(some code)
    //and return the result of operation
     static int calculate(int n,int m,EnhancedCalculatorMethod method){
          return method.add(n,m);
          //return method.substract(n,m);
     }

     public static void main(String[] args) {
         var sum = calculate(44,74,(a,b) -> a+b);
         var substract = calculate(78,65,(a,b) -> a-b);
         var multiply = calculate(245,78,(a,b) -> a*b);
         //lambda expression to take multiple values and return them from a functional interface
         System.out.println("Sum : "+sum);
         System.out.println("Substraction :  "+substract);
         System.out.println("Multiplication: "+multiply);

     }
}
interface EnhancedCalculatorMethod{
     int add(int n,int m);

}