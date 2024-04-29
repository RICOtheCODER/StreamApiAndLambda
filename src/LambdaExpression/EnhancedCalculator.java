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
         var sum = calculate(44,74,(n,m) -> m+n);
         var substract = calculate(78,65,(n,m) -> n-m);
         var multiply = calculate(245,78,(n,m) -> n*m);
         var findGreatestNumber =calculate(47,87,(n,m)->Math.max(n,m));
         var findLeastNumber=calculate(47,87,(n,m)->Math.min(m,n));
         //lambda expression to take multiple values and return them from a functional interface
         System.out.println("Sum : "+sum);
         System.out.println("Substraction :  "+substract);
         System.out.println("Multiplication : "+multiply);
         System.out.println("Greatest Number : "+findGreatestNumber);
         System.out.println("LeastNumber : "+findLeastNumber);

     }
}
interface EnhancedCalculatorMethod{
     int add(int n,int m);

}